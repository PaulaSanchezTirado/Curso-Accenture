package ejercicio5;

/**
 * Ejercicio 5 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoC {
	
	/**
	 * Código para una clase que, según la fecha proporcionada, imprime un mensaje por
	 * pantalla para saber si la fecha es correcta, si se ha equivocado en el día,
	 * el mes o el año
	 * @param args
	 */
	
	// Definimos las variables de los mensajes que se van a imprimir por pantalla
	// ya que se repiten en varias ocasiones
	
	static String fechaCorrecta = "La fecha se ha introducido correctamente";
	static String yearIncorrect = "El año no ha sido introducido correctamente";
	static String mesIncorrecto = "El mes no ha sido introducido correctamente";
	static String diaIncorrecto = "El día no ha sido introducido correctamente";
	
	public static void main(String[] args) {
		
		fecha(9, 12, 9865);
		fechaReal(30, 2, 44);
		fechaArrays(0, 2, 2022);
		fechaBisiestos(29, 2, 2012);

	}
	
	public static void fecha(int day, int month, int year) {
		
		/**
		 * Si el día se encuentra entre 1 y 30, el mes está entre 1 y 12 y el año es 
		 * mayor que 0, la fecha es correcta. Utilizamos condicionales if, else if y 
		 * else para programar esto
		 */
		
		if (1<=day && day<=30) {
			if (1<=month && month<=12) {
				if (year>0) {
					System.out.println(fechaCorrecta);
				}
				
				else {
					System.out.println(yearIncorrect);
				}
			}
			else {
				System.out.println(mesIncorrecto);
			}
		}
		
		else {
			System.out.println(diaIncorrecto);
		}
		
	}
	
	public static void fechaReal(int day, int month, int year) {
		
		/**
		 * El día tiene que ser el que corresponde con el mes en el que se está
		 * por lo que se crea un condicional con switch para escribir todos los casos
		 * posibles. Se comprueba asimismo el año y el mes y se imprime un mensaje por
		 * pantalla
		 */
		
		if (1<=month && month<=12) {
			if (year>0) {
				switch (month) {
				case 1: 
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (1<=day && day<=31){
						System.out.println(fechaCorrecta);
					}
					else {
						System.out.println(diaIncorrecto);
					}
					break;
				case 2:
					if (1<=day && day<=28) {
						System.out.println(fechaCorrecta);
					}
					else {
						System.out.println(diaIncorrecto);
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (1<=day && day<=30){
						System.out.println(fechaCorrecta);
					}
					else {
						System.out.println(diaIncorrecto);
					}
					break;
				}
				
				}
			
			else {
				System.out.println(yearIncorrect);
			}
		}
		
		else {
			System.out.println(mesIncorrecto);
		}
		
	}
	
	public static void fechaArrays(int day, int month, int year) {
		
		/**
		 * El día tiene que ser el que corresponde con el mes en el que se está. En
		 * este caso, se crea un array para llevarlo a cabo. Se comprueba asimismo
		 * el año y el mes y se imprime un mensaje por pantalla
		 */
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (1<=month && month<=12) {
			if (year>0) {
				// Si el día se encuentra entre 1 y el día del array al que corresponde
				// cada mes, la fecha se considera correcta
				
				if (1<= day && day<=days[month-1]) { // -1 porque el primer índice es un 0
					System.out.println(fechaCorrecta);	
				}
				
				else {
					System.out.println(diaIncorrecto);
				}
			}
			
			else {
				System.out.println(yearIncorrect);
			}
		}
		
		else {
			System.out.println(mesIncorrecto);
		}
		
	}
	
	public static void fechaBisiestos(int day, int month, int year) {
		
		/**
		 * El día tiene que ser el que corresponde con el mes en el que se está. En
		 * este caso, se crea un array para llevarlo a cabo. Además, se tienen en cuenta
		 * los años bisiestos. Se comprueba asimismo el año y el mes y se imprime
		 * un mensaje por pantalla
		 */
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (1<=month && month<=12) {
			if (year>0) {
				// El año es bisiesto si es divisible por 4 y por 100, es decir, el 
				// resto es 0
				if (year%4 == 0 && year%100 != 0) {
					days[1]=29;
					System.out.println(fechaCorrecta);	
				}
				
				if (1<= day && day<=days[month-1]) {
					System.out.println(fechaCorrecta);	
				}
				
				else {
					System.out.println(diaIncorrecto);
				}
			}
			
			else {
				System.out.println(yearIncorrect);
			}
		}
		
		else {
			System.out.println(mesIncorrecto);
		}
		
	}

}
