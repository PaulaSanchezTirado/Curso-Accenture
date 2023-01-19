package ejercicio4;

/**
 * Ejercicio 4 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoC {
	
	/**
	 * Calculamos el área del círculo y la longitud de la circunferencia
	 */
	
	// Definimos las variables que van a ser constantes en este ejercicio
	
	static final double PI = Math.PI;
	static final int RADIO = 23;
	
	public static void main(String[] args) {
			
		double areaCirculo;
		double longitudCircunferencia;
		
		areaCirculo = PI*RADIO*RADIO; // Cálculo del área del círculo
		longitudCircunferencia = 2*PI*RADIO; // Cálculo de la longitud de la circunferencia
		
		// Se imprime por pantalla ambos valores
		
		System.out.println("El área del círculo es: " + areaCirculo );
		System.out.println("La longitud de la circunferencia es " + longitudCircunferencia);

	}
	
}
