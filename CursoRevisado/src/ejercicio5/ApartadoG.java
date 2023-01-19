package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoG {
	
	/**
	 * Calcula los diez primeros múltiplos de 5
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int multiplos;
		String todosMultiplos = ""; // Esto es por presentación. No es necesario para el cálculo
		
		System.out.println("Los primeros diez múltiplos de 5 son: ");
		
		// Se crea un bucle que va de 1 a 10 y aumentando en 1. Los múltiplos se
		// consiguen multiplicando este número por 5
		for (int i = 1; i<=10; i++) {			
			multiplos = 5*i;
			todosMultiplos = multiplos + " ";
			System.out.print(todosMultiplos); // Se imprime por pantalla
		}

	}

}
