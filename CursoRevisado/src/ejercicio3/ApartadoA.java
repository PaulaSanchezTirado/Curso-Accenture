package ejercicio3;

/**
 * Ejercicio 3 de la presentación Programación en Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoA {
	
	/**
	 * En este ejercicio se definen diversas variables que solo pueden ser vistas por el método, no por la clase
	 * Asimismo, se imprime por pantalla un mensaje con distintos separadores
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// Estos campos solo los puede ver main
		
		int dia = 10;
		String nDNI = "57433222";
		double precio;
		final boolean ACTIVO = true;
		
		precio = 135.12;
		
		System.out.println("Dia \t" + dia + "\nDNI\t" + nDNI + "\nPrecio\t" + precio + "\nActivo\t" + ACTIVO);

	}

}
