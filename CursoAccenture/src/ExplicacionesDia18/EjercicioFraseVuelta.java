package ExplicacionesDia18;

public class EjercicioFraseVuelta {

	public static void main(String[] args) {
		
		//Para imprimir por línea de comando hay que darle a botón derecho Run As --> Run Configuration
		
		// System.out.println(args[0]); // Esto coge la primera palabra de la frase de la línea de comandos
		String salida = "";
		
		for (String ele:args) {
			
			salida = salida + ele + " "; //Esto último se añade para que las palabras de la frase estén separadas
		}
		
		System.out.println("Fase 1 *******************");
		System.out.println(salida);
		
		
		// Aquí invertimos el orden de las palabras palabra a palabra
		
		String[] palabras = salida.split(" "); // Divide el string por espacios en blanco
		int fin = palabras.length;
		String salida2 = "";
		
		for (int i = fin-1; i>=0; i--) { // fin-1 es el último elemento del array
			salida2 = salida2 + palabras[i] + " ";
		}
		
		System.out.println("Fase 2 *******************");
		System.out.println(salida2);
		
		// Aquí invertimos la frase caracter a caracter
		
		String salida3 = "";
		
		/*
		String[] caracter = salida.split("");
		int ultimo = caracter.length;
		
		for (int j = ultimo-1; j>=0; j--) {
			salida3 = salida3 + caracter[j];
		}
		
		System.out.println("Fase 3 *******************");
		System.out.println(salida3);
		*/
		
		// Otra forma de hacer la fase 3
		
		int longitudString = salida.length();
		for (int k = longitudString-1; k>=0; k--) {
			salida3 += salida.charAt(k);
		}
		
		System.out.println("Fase 3 *******************");
		System.out.println(salida3);
		
		// Fase 4: Invertimos igual que antes, pero cambiamos algunas letras
		
		String salida4 = "";
		int longString = salida.length();
		for (int l = longString-1; l>=0; l--) {
			char character = salida.charAt(l);
			switch (character) {
			
			case 'a':
				salida4 += 4;
				// character = '4'
				break;
				
			case 'e':
			case 'E':
				salida4 += 3;
				// character = '3'
				break;
			
			case 'i':
				salida4 += 1;
				// character = '1'
				break;
			
			case 'o':
				salida4 += 0;
				// character = '0'
				break;
				
			case 'u':
				salida4 += 9;
				// character = '9'
				break;
				
			default:
				salida4 += character;
				
			// salida4 += character
				
			
			}
		}
			
		System.out.println("Fase 4 *******************");
		System.out.println(salida4);
		
		/*
		// Otra forma de hacer fase4
		
		for (int l = longString-1; l>=0; l--) {
			char character = salida.charAt(l);
			character = conver(character); // conver sería un método creado a parte con switch
			salida4 += character;
		*/
	}

}
