package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoF {
	
	/**
	 * Imprime por pantalla cada 23 números en un rango de 0 a 100 y de 100 a 0
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// Se crea un bucle que va de 0 a 100 aumentando de 23 en 23
		System.out.println("Aquí imprime en pantalla cada 23 números del 0 al 100: ");
		for (int i=0; i>=0 && i<=100; i+=23) {
			System.out.println(i);
		}
		
		// Se crea un bucle que va de 100 a 0 disminuyendo de 23 en 23
		System.out.println("Aquí imprime en pantalla cada 23 números del 100 al 0: ");
		for (int j=100; j>=0; j-=23) {
			System.out.println(j);
		}
	}

}
