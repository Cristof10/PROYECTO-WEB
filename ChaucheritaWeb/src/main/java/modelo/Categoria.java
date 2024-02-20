package modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String nombre;
	@Column
	private Integer id;
	
	public Categoria () {
		
	}
	
	public String getNombre() {
		return nombre;
	}


	public Integer getById(Integer id) {
		return id;
	}

	public void getCatTransferencia() {
		
	}
	
	public void save() {
		
	}
	
	public String getCatIngreso(){
		return null;
		
	}
		
}
