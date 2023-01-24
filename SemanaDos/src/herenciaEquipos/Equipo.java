package herenciaEquipos;

/**
 * Ejerciciol de herencia
 * @author paula.sanchez.tirado
 *
 */

public class Equipo {
	
	/**
	 * Clase padre
	 */
	
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	
	// Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Contructor
	public Equipo(int id, String nombre, String apellidos, int edad) {
		setId(id);
		setNombre(nombre);
		setApellidos(apellidos);
		setEdad(edad);
		
	}
	
	// Métodos de la clase padre
	public void concentrarse() {
		System.out.println(getNombre()+ " está concentrado");
	}
	
	public void viajar() {
		System.out.println(getNombre()+" viaja");
	}
	

}
