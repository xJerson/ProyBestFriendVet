package modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_tipoconsulta")
public class Tipo {

	private String codTipo;
	private String desTipo;
	private double preTipo;
	public String getCodTipo() {
		return codTipo;
	}
	public void setCodTipo(String codTipo) {
		this.codTipo = codTipo;
	}
	public String getDesTipo() {
		return desTipo;
	}
	public void setDesTipo(String desTipo) {
		this.desTipo = desTipo;
	}
	public double getPreTipo() {
		return preTipo;
	}
	public void setPreTipo(double preTipo) {
		this.preTipo = preTipo;
	}
	
	
	
}
