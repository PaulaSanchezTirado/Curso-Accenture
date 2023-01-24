package herenciaEquipos;

/**
 * Ejercicio de herencia
 * @author paula.sanchez.tirado
 *
 */

public class Masajista extends Equipo{
	
	/**
	 * Clase hija que hereda de Equipo
	 */

	private String titulacion;
	private int aniosExperiencia;
	
	// Getters y setters
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	// Constructor
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		setTitulacion(titulacion);
		setAniosExperiencia(aniosExperiencia);
	}
	
	// Método de esta clase hija
	public void darMasaje() {
		System.out.println(getNombre()+" "+getApellidos()+" da masaje");
	}

}
