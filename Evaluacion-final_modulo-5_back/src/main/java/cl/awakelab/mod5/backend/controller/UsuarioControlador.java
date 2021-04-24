package cl.awakelab.mod5.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import cl.awakelab.mod5.backend.entities.UsuariosEntity;
import cl.awakelab.mod5.backend.service.CrudService;
import cl.awakelab.mod5.backend.service.IUsuarioService;



@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioControlador {

	@Autowired
	CrudService<UsuariosEntity> crudUsuario;
	
	@Autowired
	IUsuarioService iUsuarioService ;
	
	
	//método para listar api
	@GetMapping
	public ResponseEntity<List<UsuariosEntity>> listadoUsuarios(){
		
		try {
			List<UsuariosEntity> listaUsuario = new ArrayList<UsuariosEntity>();
			listaUsuario = crudUsuario.lista();
			
			if (listaUsuario.isEmpty()) {
				
			return new ResponseEntity<List<UsuariosEntity>>(HttpStatus.NO_CONTENT);
				
			}else {
				return new ResponseEntity<List<UsuariosEntity>>(listaUsuario, HttpStatus.OK);
			}
			
		} catch (Exception e) {
				return new ResponseEntity<List<UsuariosEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	@GetMapping("/crearusuario")
	public String crearUsuario() {
		return "crearUsuario";

	}

	@PostMapping("/crearusuario")
	public RedirectView crearUsuario(@ModelAttribute("formCrearUsuario") UsuariosEntity usuarios) {
		crudUsuario.crear(usuarios);
		return new RedirectView("listausuarios");

	}
	
	@GetMapping("/buscar/{idUsuario}")
	public ResponseEntity<UsuariosEntity> buscarPorId(@PathVariable Integer idUsuario) {

		try {
			UsuariosEntity usuario = new UsuariosEntity();
			usuario = iUsuarioService.buscarPorid(idUsuario);

			return new ResponseEntity<UsuariosEntity>(usuario, HttpStatus.OK);

		} catch (Exception e) {

			return new ResponseEntity<UsuariosEntity>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}


}
