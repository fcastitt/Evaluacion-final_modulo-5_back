package cl.awakelab.mod5.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
@Entity
public class PagosEntity {
	
	@Id
	@Column(name="pagmonto")
	private Integer pagoMonto;
	@Column(name="pagmes")
	private String pagMes;
	@Column(name="pagaño")
	private Integer pagAño;
	@Column(name="pagrut")
	private String pagRut;
	@Column(name="pagfecha")
	private String pagFecha;

}