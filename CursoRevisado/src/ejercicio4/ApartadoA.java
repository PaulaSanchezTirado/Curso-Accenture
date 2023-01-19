package ejercicio4;

/**
 * Ejercicio 4 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoA {
	
	/**
	 * Aquí se intenta predecir el resultado que proporciona el código que se adjunta
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int valor=0;
		valor=23;
		valor+=10;
		
		// Se imprime por pantalla el resultado para comprobar que esté bien
		
		System.out.println("Resultado a=" + --valor); //32
		System.out.println("Resultado a=" + ++valor); //33
		System.out.println("Resultado a=" + valor++); //33
		System.out.println("Resultado a=" + valor--); //34
		System.out.println("Resultado a=" + valor);   //33

	}
}
