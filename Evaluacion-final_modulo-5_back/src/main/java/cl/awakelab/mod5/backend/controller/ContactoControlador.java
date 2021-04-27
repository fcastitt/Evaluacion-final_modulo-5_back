package cl.awakelab.mod5.backend.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.awakelab.mod5.backend.entities.ContactoModelo;


@Controller
@RequestMapping("/")
public class ContactoControlador {
	
	private static final Logger log = LoggerFactory.getLogger("Log de contacto");
	
	@GetMapping("/contacto")
	public String contacto() {
		return "/contacto";
	}
	
	@PostMapping("/contacto")
	public String contactoPost(@ModelAttribute("formContacto")ContactoModelo contacto) {
		log.info("IFORMACION INGRESADA EN FORMULARIO DE CONTACTO");
		System.out.println("Nombre: "+contacto.getNombreContacto());
		System.out.println("Email: "+contacto.getEmailContacto());
		System.out.println("Telefono: "+contacto.getTelefonoContacto());
		System.out.println("Mensaje: "+contacto.getMensajeContacto());
		System.out.println("Genero: "+contacto.getGeneroContacto());
		return "contacto";
	}

}
