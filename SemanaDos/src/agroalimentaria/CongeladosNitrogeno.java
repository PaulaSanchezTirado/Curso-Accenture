package agroalimentaria;

/**
 * Ejercicio de gestión de empresa agroalimentaria
 * @author paula.sanchez.tirado
 *
 */

public class CongeladosNitrogeno extends ProductosCongelados{
	
	/**
	 * Clase hija de ProductosCongelados. Herencia múltiple
	 */
	
	private String metodoCongelacion;
	private String tiempoExposicion;
	
	// Constructores
	public CongeladosNitrogeno(String metodoCongelacion, String tiempoExposicion) {
		super();
		this.metodoCongelacion = metodoCongelacion;
		this.tiempoExposicion = tiempoExposicion;
	}
	
	// Getters y setters
	public String getMetodoCongelacion() {
		return metodoCongelacion;
	}

	public void setMetodoCongelacion(String metodoCongelacion) {
		this.metodoCongelacion = metodoCongelacion;
	}

	public String getTiempoExposicion() {
		return tiempoExposicion;
	}

	public void setTiempoExposicion(String tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	
}
