package ejercicio3;

/**
 * Ejercicio 3 de la presentación Programación en Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoC {
	
	/**
	 * Se definen dos arrays distintos, uno de una dimensión y otro de dos y se rellenan
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Array de una dimensión
		
		int[][] elMes = new int[5][7]; // Array de dos dimensiones
		elMes[0][0] = 0; // Así se definen los números del array
		elMes[0][1] = 1;
		elMes[0][2] = 2;
		elMes[0][3] = 3;
		elMes[0][4] = 4;
		elMes[0][5] = 5;
		elMes[0][6] = 6;
		elMes[1][0] = 8;
		elMes[1][1] = 9;
		elMes[1][2] = 10;
		elMes[1][3] = 11;
		elMes[1][4] = 12;
		elMes[1][5] = 13;
		elMes[1][6] = 14;
		elMes[2][0] = 16;
		elMes[2][1] = 17;
		elMes[2][2] = 18;
		elMes[2][3] = 19;
		elMes[2][4] = 20;
		elMes[2][5] = 21;
		elMes[2][6] = 22;
		elMes[3][0] = 24;
		elMes[3][1] = 25;
		elMes[3][2] = 26;
		elMes[3][3] = 27;
		elMes[3][4] = 28;
		elMes[3][5] = 29;
		elMes[3][6] = 30;
	}

}
