package modelo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_consulta")
public class Consulta {
	
	@Id
	@Column(name="codConsulta")
	private String codConsulta;
	
	@Column(name="codTipo")
	private String codTipo;
	
	
	private Date fechaConsulta;
	
	private String codDoctor;
	
	
	public String getCodConsulta() {
		return codConsulta;
	}
	public void setCodConsulta(String codConsulta) {
		this.codConsulta = codConsulta;
	}
	public String getCodTipo() {
		return codTipo;
	}
	public void setCodTipo(String codTipo) {
		this.codTipo = codTipo;
	}
	public Date getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(Date fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public String getCodDoctor() {
		return codDoctor;
	}
	public void setCodDoctor(String codDoctor) {
		this.codDoctor = codDoctor;
	}
	
	

}
