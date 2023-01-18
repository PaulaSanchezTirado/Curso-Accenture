package Ejercicio4Eclipse;

public class Ejercicio4ApartadoA {
	
	public static void main(String[] args) {
		
		int valor=0;
		valor=23;
		valor+=10;
		System.out.println("Resultado a=" + --valor); //32
		System.out.println("Resultado a=" + ++valor); //33
		System.out.println("Resultado a=" + valor++); //33
		System.out.println("Resultado a=" + valor--); //34
		System.out.println("Resultado a=" + valor); //33

	}

}
