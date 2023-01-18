package ExplicacionesDia18;

public class EjercicioStringSinLength {

	public static void main(String[] args) {
		
		String salida = "";
		String salidaSinLength = "";
		
		for (String ele:args) {
			
			salida = salida + ele + " "; //Esto último se añade para que las palabras de la frase estén separadas
		}
		
		char primerCaracter = salida.charAt(0);
		
		for (int k = 1; (salida+primerCaracter).charAt(k) != primerCaracter; k++) {
			salidaSinLength = salida.charAt(k) + salidaSinLength;
		}
		
		System.out.println("Salida sin Length *******************");
		System.out.println("Esta es la frase normal:\t" +salida);
		System.out.println("Esta es la frase volteada y sin caracteres especiales:\t" +salidaSinLength);
		
		// Cuando no hay más caracteres al final de un string, se obtiene el caracter null
		// Para saber cuándo es el final de un string, escribimos un caracter al final 
		
		salida += (char)0;
		int pos = 0;
		String salida2 = "";
		while (salida.charAt(pos) != (char)0) {
			salida2 = salida.charAt(pos++) + salida2;
			
		}
		System.out.println("Salida sin Length ni caracteres especiales *******************");
		System.out.println(salida2);
		

	}
			
}
