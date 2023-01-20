package agroalimentaria;

/**
 * Ejercicio de gestión de empresa agroalimentaria
 * @author paula.sanchez.tirado
 *
 */

public class ProductosRefrigerados extends Productos{
	
	/**
	 * Clase hija de Productos
	 */
	
	private String codigo;
	
	// Constructores
	public ProductosRefrigerados(String codigo) {
		super();
		this.codigo = codigo;
	}
	
	// Getters y setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
