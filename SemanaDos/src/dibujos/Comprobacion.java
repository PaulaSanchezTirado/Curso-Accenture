package dibujos;

/**
 * Ejercicio sobre herencia con figuras geométricas
 * @author paula.sanchez.tirado
 *
 */

public class Comprobacion {
	
	/**
	 * Clase para comprobar el concepto de herencia creado con las figuras geométricas
	 * @param args
	 */

	public static void main(String[] args) {
		
		// Creación de objetos
		Cuadrado cuadrado = new Cuadrado(10, 10);
		Circulo circulo = new Circulo(2);
		Triangulo triangulo = new Triangulo(12.2, 3);
		
		// Imprimimos por pantalla el resultado
		System.out.println("El área del rectángulo es: "+cuadrado.getArea());
		System.out.println("El área del triángulo es: "+triangulo.getArea());
		System.out.println("El área del círculo es: "+circulo.getArea());
		

	}

}
