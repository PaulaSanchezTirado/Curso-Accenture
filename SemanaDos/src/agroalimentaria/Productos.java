package agroalimentaria;

 /**
  * Ejercicio de gestión de empresa agroalimentaria
  * @author paula.sanchez.tirado
  *
  */

public class Productos {
	
	/**
	 * Se trata de la clase padre de la que el resto de clases van a heredar
	 */
	
	private String fechaCaducidad;
	private String numeroLote;
	
	// Constructores
	public Productos(String fechaCaducidad, String numeroLote){
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}

	public Productos() {
		
	}
	
	// Getters y setters
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public void setNumeroLote(String numeroLote) {
		this.numeroLote = numeroLote;
	}
}
