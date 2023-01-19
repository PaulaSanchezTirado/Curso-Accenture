package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoA {
	
	/**
	 * Creamos un método llamado comparar que permite comparar dos número para saber qué numero
	 * es mayor, menor o si son iguales. Además, permite conocer si son múltiplos 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// Código de comprobación: comparar(10, 20);
		comparar(678, 34);

	}
	
	public static void comparar(double valor1, double valor2) {
		
		// Condiciones if para indicar qué número del ordenador es mayor, menor o si son iguales
		
		if (valor1<valor2) {
			System.out.println("El número " + valor1 + " es menor que el número " + valor2);
		}
		
		else if (valor1>valor2) {
			System.out.println("El número " + valor1 + " es mayor que el número " + valor2);
		}
		
		else {
			System.out.println("Ambos valores son iguales");
		}
		
		// Condiciones para saber si son múltiplos
		
		if (valor1%valor2 == 0) {
			System.out.println(valor1 + " es múltiplo de " + valor2);
			
		}
		
		else {
			System.out.println(valor1 + " no es múltiplo de " + valor2);
		}
		
		/*
		// A continuación se encuentra la respuesta de Miguel
		if (valor1 == 0 || valor2 == 0) {
			System.out.println("No son múltiplos");
		}
		
		else if (valor1%valor2 == 0 || valor2%valor1 == 0) {
			System.out.println("Son múltiplos");
		}
		
		else {
			System.out.println("No son múltiplos");
		}
		*/
		
	}

}
