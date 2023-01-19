package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoK {
	
	/**
	 * Se calculan los números primos de 1 a 100
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		String primos = "";
		String[] numPrimos;
		
		// Bucle que recorre los números del 1 al 100
		for (int i=1; i<=100; i++) {
			
			int counter=0;
			
			// Bucle que permite comprobar el resto al dividir el número que llega del 
			// bucle anterior entre todos los números desde este hasta 1 (disminuyendo en
			// 1 cada vez
			for (int j=i; j>=1; j--) {
				// Si el resto es 0, es divisible i entre j y se almacena en un contador
				if(i%j==0) {
					counter += 1;
				}	
			}
		// Si solo se ha obtenido un 2 en el contador es porque el número solo es
		// divisible por sí mismo y por el 1, por lo que es primo
		if (counter==2) {
			primos = primos+i+" ";
		}
			
		}
		
		numPrimos = primos.split(" ");
		System.out.println("Hay " + numPrimos.length + " números primos del 1 al 100 y estos son: " + primos);
	}

}
