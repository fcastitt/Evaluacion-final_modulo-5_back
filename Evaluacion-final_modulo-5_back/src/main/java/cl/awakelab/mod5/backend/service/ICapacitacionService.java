package cl.awakelab.mod5.backend.service;

import cl.awakelab.mod5.backend.entities.CapacitacionEntity;
import cl.awakelab.mod5.backend.entities.UsuariosEntity;

public interface ICapacitacionService {
	
	public CapacitacionEntity buscarPorid(Integer idCapacitacion);

}
