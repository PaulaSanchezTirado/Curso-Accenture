package herenciaEquipos;

/**
 * Ejercicio de herencia
 * @author paula.sanchez.tirado
 *
 */

public class Entrenador extends Equipo{
	
	/**
	 * Clase hija que hereda de Equipo
	 */

	private String idFederacion;
	
	// Getters y setters
	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	// Constructor
	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		setIdFederacion(idFederacion);
	}
	
	// Métodos de esta clase hija
	public void dirigirPartido() {
		System.out.println(getNombre()+" "+getApellidos()+" dirige partido");
	}
	
	public void dirigirEntrenamiento() {
		System.out.println(getNombre()+" "+getApellidos()+" dirige entrenamiento");
	}
}
