package Ejercicio5;

public class Ejercicio5ApartadoD {

	public static void main(String[] args) {
		
		conversorALetras(11);

	}
	
	public static void conversorALetras(int numero) {
		
		int primerNumero;
		int segundoNumero;
		
		String[] primero = {"", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Once",
				"Doce", "Trece", "Catorce", "Quince"};
		
		String[] segundo = {"", "Diez", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta",
				"Noventa"};
		
		primerNumero = numero/10;
		segundoNumero = numero%10;
		
		if (0<numero && numero<=15) {
			System.out.println(primero[numero]);
		}
		
		else {
			if (primero[segundoNumero]=="") {
				System.out.println(segundo[primerNumero]);
			}
			
			else if (primerNumero == 1) {
				System.out.println("Dieci" + primero[segundoNumero]);
			}
			
			else if (primerNumero == 2) {
				System.out.println("Veinti" + primero[segundoNumero]);
			}
			
			else {
				System.out.println(segundo[primerNumero] + " y " + primero[segundoNumero]);
			}
		}
	}
}
