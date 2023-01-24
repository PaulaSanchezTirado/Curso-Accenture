package ejercicioPersona;

/**
 * Ejercicio de herencia
 * @author paula.sanchez.tirado
 *
 */

public class Profesor extends Persona{
	
	/**
	 * Clase hija que hereda de Persona
	 */
	
	private float salario;
	private String fecContratacion;
	
	// Getters y setters
	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFecContratacion() {
		return fecContratacion;
	}

	public void setFecContratacion(String fecContratacion) {
		this.fecContratacion = fecContratacion;
	}
	
	// Constructor
	public Profesor(String codPersona, String nombre, int edad, String telContacto, float salario, String fecContratacion) {
		super(codPersona, nombre, edad, telContacto);
		this.salario = salario;
		this.fecContratacion = fecContratacion;
	}
	
	// Método sobreescrito
	@Override
	public void mostrar() {
		System.out.println("Código de persona: "+getCodPersona()+"\nNombre: "+getNombre()+"\nEdad: "+getEdad()+
				"\nTeléfono de contacto: "+getTelContacto()+"\nSalario: "+getSalario()+"\nFecha de contratación: "+getFecContratacion());
		
	}
	
	
}
