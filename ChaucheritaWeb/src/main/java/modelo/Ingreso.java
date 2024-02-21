package modelo;

import java.io.Serializable;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

@Entity(name="Ingreso")
public class Ingreso implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "valor")
	private Double valor;
	@Column(name = "concepto")
	private String concepto;
	@OneToOne
	@JoinColumn(name="cuentaOrigen")
	private Cuenta cuentaOrigen;
	@OneToOne
	@JoinColumn(name="categoria")
	private Categoria categoria;
	@Column(name = "fecha")
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
	
	public void create() {
		
	}
	private static void insertar() {
		EntityManager em = Persistence.createEntityManagerFactory("Mi_Primera_Chamba").createEntityManager();

		/*Banco pichincha = new Banco("Pichincha");
		
		
		em.getTransaction().begin();
		em.persist(pichincha);
		em.getTransaction().commit();*/
	}

	

}