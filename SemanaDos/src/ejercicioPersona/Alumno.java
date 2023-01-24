package ejercicioPersona;

/**
 * Ejercicio de herencia
 * @author paula.sanchez.tirado
 *
 */

public class Alumno extends Persona{
	
	/**
	 * Clase hija que hereda de Persona
	 */
		
	private int curso;
	private String asignaturas;
	
	// Getters y setters
	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	public String getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	// Constructor
	public Alumno(String codPersona, String nombre, int edad, String telContacto, int curso) {
		super(codPersona, nombre, edad, telContacto);
		this.curso = curso;
	}
	
	// Método sobreescrito
	@Override
	public void mostrar() {
		System.out.println("Código de persona: "+getCodPersona()+"\nNombre: "+getNombre()+"\nEdad: "+getEdad()+
				"\nTeléfono de contacto: "+getTelContacto()+"\nCurso: "+getCurso());
		
	}
	

}
