package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoH {
	
	/**
	 * Calcula el factorial de un número
	 * @param args
	 */
	
public static void main(String[] args) {
		
		calcularFactorial(14);
	}
	
	public static void calcularFactorial(int numero) {
		
		/**
		 * Para calcular el factorial de un número creamos un bucle while. Cada iteración
		 * será: 1, 1x2, 1x2x3, 1x2x3x4... y así sucesivamente hasta calcular el factorial
		 * del número ya que el criterio de parada es que la variable creada sea menor o
		 * igual que el número proporcionado. En la última iteración se obtiene el factorial
		 */
		
		int calcFactorial = 1;
		
		int i = 1;
		while (i<=numero) {	
			calcFactorial = calcFactorial*i;
			i++;	
		}
		
		System.out.println("El factorial de " + numero + " es " + calcFactorial);
		
	}

}
