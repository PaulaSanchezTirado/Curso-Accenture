package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoD {
	
	/**
	 * Recibe una lista de números desde la línea de comandos y los convierte a letras.
	 * Para ello trabajamos con un array de Strings y varios condicionales
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		conversorALetras(20);

	}
	
	public static void conversorALetras(int numero) {
		
		int primerNumero;
		int segundoNumero;
		
		// Estos son las unidades y los números "irregulares" en su nombre
		String[] primero = {"", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Once",
				"Doce", "Trece", "Catorce", "Quince"};
		
		// Estas son las decenas
		String[] segundo = {"", "Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta",
				"Noventa"};
		
		primerNumero = numero/10; // Decenas
		segundoNumero = numero%10; // Unidades
		
		// Si el número está entre 1 y 15, imprime por pantalla directamente desde el 
		// array de strings
		if (0<numero && numero<=15) {
			System.out.println(primero[numero]);
		}
		
		// Si el número es mayor que 15, forma el número en letra mediante la unión de
		// las decenas y las unidades ayudándose para ello de un índice que indica 
		// la palabra que ha de escoger del array
		else {
			// Se debería utilizar equals
			if (primero[segundoNumero]=="") { // Para que los números acabados en 0 se impriman correctamente
				System.out.println(segundo[primerNumero]);
			}
			
			else if (primerNumero == 1) {
				System.out.println("Dieci" + primero[segundoNumero]); // Para los números "irregulares"
			}
			
			else if (primerNumero == 2) {
				System.out.println("Veinti" + primero[segundoNumero]); // Para los números "irregulares"
			}
			
			else {
				System.out.println(segundo[primerNumero] + " y " + primero[segundoNumero]);
			}
		}
	}

}
