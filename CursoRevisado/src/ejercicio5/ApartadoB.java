package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoB {
	
	/**
	 * El código siguiente es utilizado para clasificar la nota (sin decimales) en:
	 * insuficiente, suficiente, bien, notable y sobresaliente
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int nota = 6;
		
		switch (nota) {
		
		// Para los casos donde la nota es 0,1,2,3 y 4
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Insuficiente");
			break;
		
		// Para el caso donde la nota es 5
		case 5:
			System.out.println("Suficiente");
			break;

		// Para el caso donde la nota es 6
		case 6:
			System.out.println("Bien");
			break;

		// Para el caso donde la nota es 7 o 8
		case 7:
		case 8:
			System.out.println("Notable");
			break;

		// Para el caso donde la nota es 9 o 10
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		
		// Si no es ninguno de los casos anteriores
		default:
			System.out.println("No se ha introducido bien la nota");
			break;
		}

	}

}
