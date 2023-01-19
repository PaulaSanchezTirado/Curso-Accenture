package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoI {
	
	/**
	 * El código propuesto imprime por pantalla las tablas de multiplicar
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// Se crea un bucle for que recorra los números del 1 al 10 y otro bucle dentro
		// de este que haga lo mismo para poder ir multiplicando los números
		for (int i=1; i<=10; i++) {
			System.out.println("Tabla del " + i);
			System.out.println("------------");
			// Hasta que no acaba de multiplicar 1 con los números del 1 al 10 no pasa a
			// siguiente iteración
			for (int j=1; j<=10; j++) {
				System.out.println(i + "x" + i + " = " + i*j);
			}
		}
	}

}
