package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoE {
	
	/**
	 * Calcula el cuadrado de un número escrito desde la línea de comandos
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		double numero;
		double calcCuadrado;
		
		for (String num:args) {
			
			/*
			 * Desde la línea de comando se recibe como string, por eso utilizamos Double.paseDouble
			 * para convertir un string en un double (por si el número ingresado es decimal)
			 */
			
			numero = Double.parseDouble(num); 
			calcCuadrado = Math.pow(numero, 2); // Math.pow calcula el cuadrado del número;
			System.out.println("El número inicial es " + numero + " y su cuadrado es " + calcCuadrado);
			
		}
	}

}
