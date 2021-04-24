package cl.awakelab.mod5.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.awakelab.mod5.backend.entities.CapacitacionEntity;
import cl.awakelab.mod5.backend.service.CrudService;


@RestController
@RequestMapping("/api/v1/capacitacion")
public class CapacitacionController {
	
	@Autowired
	CrudService<CapacitacionEntity> crudCap;
	
	@GetMapping
	public ResponseEntity<List<CapacitacionEntity>> listadoCap(){
		
		try {
			
			List<CapacitacionEntity> listaCap = new ArrayList<CapacitacionEntity>();
			listaCap = crudCap.lista();
			
			if(listaCap.isEmpty()) {
				
				return new ResponseEntity<List<CapacitacionEntity>>(HttpStatus.NO_CONTENT);
				
			}else{
				return new ResponseEntity<List<CapacitacionEntity>>(listaCap, HttpStatus.OK);
			}
			
		} catch (Exception e) {
			return new ResponseEntity<List<CapacitacionEntity>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
