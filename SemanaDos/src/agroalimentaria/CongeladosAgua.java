package agroalimentaria;

/**
 * Ejercicio de gestión de empresa agroalimentaria
 * @author paula.sanchez.tirado
 *
 */

public class CongeladosAgua extends ProductosCongelados{
	
	/**
	 * Clase hija de ProductosCongelados. Herencia múltiple
	 */
	
	private String salinidad;
	
	// Constructores
	public CongeladosAgua(String salinidad) {
		super();
		this.salinidad = salinidad;
	}
	
	// Getters y setters
	public String getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(String salinidad) {
		this.salinidad = salinidad;
	}
	
}
