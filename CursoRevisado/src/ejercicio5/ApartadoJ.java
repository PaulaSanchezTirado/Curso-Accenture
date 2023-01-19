package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoJ {
	
	/**
	 * Creación de un cuadrado con asteriscos
	 * @param args
	 */
	
	public static void main(String[] args) {
        
		// Se crea un bucle anidado de 0 a 7 (para que sean 8 asteriscos) que recorra
		// filas y columnas y vaya agregando el asterisco
        for (int i = 0; i<=7; i++) {
        	for (int j = 0; j<=7; j++) {
        		System.out.print("* ");
        	}
        	System.out.println(""); 
        }
	}

}
