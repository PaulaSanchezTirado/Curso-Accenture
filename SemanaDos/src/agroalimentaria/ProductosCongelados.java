package agroalimentaria;

/**
 * Ejercicio de gestión de empresa agroalimentaria
 * @author paula.sanchez.tirado
 *
 */

public class ProductosCongelados extends Productos{
	
	/**
	 * Clase hija de Productos
	 */
	
	private String temperatura;
	
	// Constructores
	public ProductosCongelados(String temperatura) {
		super();
		this.temperatura = temperatura;
	}

	public ProductosCongelados() {
		
	}
	
	// Getters y setters
	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	
}
