package herenciaEquipos;

/**
 * Ejercicio de herencia
 * @author paula.sanchez.tirado
 *
 */

public class Futbolista extends Equipo{
	
	/**
	 * Clase hija que hereda de Equipo
	 */
	
	private int dorsal;
	private String demarcacion;
	
	// Getters y setters
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	// Constructor
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		setDorsal(dorsal);
		setDemarcacion(demarcacion);
	}
	
	// Métodos de esta clase hija
	public void jugarPartido() {
		System.out.println(getNombre()+" "+getApellidos()+" juega");
	}
	
	public void entrenar() {
		System.out.println(getNombre()+" "+getApellidos()+" entrena");
	}

}
