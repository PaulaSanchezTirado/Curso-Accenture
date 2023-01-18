package Ejercicio5;

public class Ejercicio5ApartadoA {

	public static void main(String[] args) {
		
		comparar(40, 20);
		comparar(678, 34);

	}
	
	public static void comparar(int valor1, int valor2) {
		
		if (valor1<valor2) {
			System.out.println("El número " + valor1 + " es menor que el número " + valor2);
		}
		
		else if (valor1>valor2) {
			System.out.println("El número " + valor1 + " es mayor que el número " + valor2);
		}
		
		else {
			System.out.println("Ambos valores son iguales");
		}
		
		if (valor1 == 0 || valor2 == 0) {
			System.out.println("No son múltiplos");
		}
		
		if (valor1%valor2 == 0 || valor2%valor1 == 0) {
			System.out.println("Son múltiplos");
		}
		
		else {
			System.out.println("No son múltiplos");
		}
		
		if (valor1%valor2 == 0) {
			System.out.println(valor1 + " es múltiplo de " + valor2);
			
		}
		
		else {
			System.out.println(valor1 + " no es múltiplo de " + valor2);
		}
		
	}

}
