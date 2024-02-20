package modelo;

import java.io.Serializable;
import java.util.*;

public class Ingreso implements Serializable{

	private static final long serialVersionUID = 1L;
	private Double valor;
	private String concepto;
	private Cuenta cuenta;

	public Ingreso() {
    	
    }

}