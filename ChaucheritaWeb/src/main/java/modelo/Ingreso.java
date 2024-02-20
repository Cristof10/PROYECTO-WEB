package modelo;

import java.io.Serializable;
import java.util.*;

public class Ingreso implements Serializable{

	private static final long serialVersionUID = 1L;
	private Double valor;
	private String concepto;
	private Cuenta cuentaOrigen;
	private Categoria categoria;
	private Date fecha;

	public Ingreso() {
    	
    }

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public Cuenta getCuentaOrigen() {
		return cuentaOrigen;
	}

	public void setCuentaOrigen(Cuenta cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Ingreso [valor=" + this.valor + ", concepto=" + this.concepto + ", cuentaOrigen=" + this.cuentaOrigen + ", categoria="
				+ this.categoria + ", fecha=" + this.fecha + "]";
	}

	

}