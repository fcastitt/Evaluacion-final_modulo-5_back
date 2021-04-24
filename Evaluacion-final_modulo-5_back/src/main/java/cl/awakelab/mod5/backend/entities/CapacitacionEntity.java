package cl.awakelab.mod5.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@SequenceGenerator(name = "CAP_SEQ", initialValue = 1, allocationSize = 1, sequenceName = "CAP_SEQ")
public class CapacitacionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CAP_SEQ")
	@Column(name = "idcapacitacion")
	private Integer idCapacitacion;
	@Column(name = "capfecha")
	private String capFecha;
	@Column(name = "caphora")
	private String capHora;
	@Column(name = "caplugar")
	private String capLugar;
	@Column(name = "capduracion")
	private Integer capDuracion;
	@Column(name = "cliente_rutcliente")
	private Integer clienteRutCliente;

	public CapacitacionEntity(String capFecha, String capHora, String capLugar, Integer capDuracion,
			Integer clienteRutCliente) {
		super();
		this.capFecha = capFecha;
		this.capHora = capHora;
		this.capLugar = capLugar;
		this.capDuracion = capDuracion;
		this.clienteRutCliente = clienteRutCliente;

	}

	public CapacitacionEntity() {
		super();
	}

	public Integer getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(Integer idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public String getCapFecha() {
		return capFecha;
	}

	public void setCapFecha(String capFecha) {
		this.capFecha = capFecha;
	}

	public String getCapHora() {
		return capHora;
	}

	public void setCapHora(String capHora) {
		this.capHora = capHora;
	}

	public String getCapLugar() {
		return capLugar;
	}

	public void setCapLugar(String capLugar) {
		this.capLugar = capLugar;
	}

	public Integer getCapDuracion() {
		return capDuracion;
	}

	public void setCapDuracion(Integer capDuracion) {
		this.capDuracion = capDuracion;
	}

	public Integer getClienteRutCliente() {
		return clienteRutCliente;
	}

	public void setClienteRutCliente(Integer clienteRutCliente) {
		this.clienteRutCliente = clienteRutCliente;
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", capFecha=" + capFecha + ", capHora=" + capHora
				+ ", capLugar=" + capLugar + ", capDuracion=" + capDuracion + ", clienteRutCliente=" + clienteRutCliente
				+ "]";
	}

}
