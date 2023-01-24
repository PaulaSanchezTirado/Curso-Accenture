package ejercicioPersona;

/**
 * Ejercicio herencia 
 * @author paula.sanchez.tirado
 *
 */

public class testPersona {
	
	/**
	 * Comprobación del ejercicio herencia
	 * @param args
	 */

	public static void main(String[] args) {
		
		// Objetos
		Alumno alumno = new Alumno("8749", "Paula", 23, "722454509", 4);
		Profesor profesor = new Profesor("8005", "Miguel", 57, "722989809", 1200, "16/01/2023");
		
		alumno.setAsignaturas("Programación");
		alumno.mostrar();
		System.out.println("Asignaturas: "+alumno.getAsignaturas());
		System.out.println("---------------------------------");
		profesor.mostrar();
		
	}

}
