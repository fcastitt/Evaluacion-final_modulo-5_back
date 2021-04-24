package cl.awakelab.mod5.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactoModelo {

	private String nombreContacto;
	private String emailContacto;
	private String telefonoContacto;
	private String mensajeContacto;
	private String generoContacto;

}
