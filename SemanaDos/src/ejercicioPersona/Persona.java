package ejercicioPersona;

/**
 * Ejercicio de herencia 
 * @author paula.sanchez.tirado
 *
 */

public abstract class Persona {
	
	/**
	 * Clase padre
	 */
	
	private String codPersona;
	private String nombre;
	private int edad;
	private String telContacto;
	
	// Getters y setters
	public String getCodPersona() {
		return codPersona;
	}
	public void setCodPersona(String codPersona) {
		this.codPersona = codPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTelContacto() {
		return telContacto;
	}
	public void setTelContacto(String telContacto) {
		this.telContacto = telContacto;
	}
	
	// Constructor
	public Persona(String codPersona, String nombre, int edad, String telContacto) {
		super();
		this.codPersona = codPersona;
		this.nombre = nombre;
		this.edad = edad;
		this.telContacto = telContacto;
	}
	
	// Método que se modificará en las clases hijas
	public abstract void mostrar();
}
