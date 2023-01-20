package agroalimentaria;

/**
 * Ejercicio de gestión de empresa agroalimentaria
 * @author paula.sanchez.tirado
 *
 */

public class ProductosFrescos extends Productos{
	
	/**
	 * Clase hija de Productos. Se ve el concepto de herencia
	 */
	
	private String fechaEnvasado;
	private String paisOrigen;
	
	// Constructores
	public ProductosFrescos(String fechaEnvasado, String paisOrigen) {
		super();
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;				
	}
	
	// Getters y setters
	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

}
