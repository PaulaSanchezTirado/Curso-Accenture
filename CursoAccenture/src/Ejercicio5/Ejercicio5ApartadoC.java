package Ejercicio5;

public class Ejercicio5ApartadoC {

	public static void main(String[] args) {
		
		fecha(9, 12, 9865);
		fechaReal(30, 2, 44);
		fechaArrays(0, 2, 2022);
		fechaBisiestos(29, 2, 2012);

	}
	
	public static void fecha(int day, int month, int year) {
		
		if (1<=day && day<=30) {
			if (1<=month && month<=12) {
				if (year>0) {
					System.out.println("La fecha se ha introducido correctamente");
				}
				
				else {
					System.out.println("El año no ha sido introducido correctamente");
				}
			}
			else {
				System.out.println("El mes no ha sido introducido correctamente");
			}
		}
		
		else {
			System.out.println("El día no ha sido introducido correctamente");
		}
		
	}
	
	public static void fechaReal(int day, int month, int year) {
		
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
						System.out.println("La fecha ha sido introducida correctamente");
					}
					else {
						System.out.println("El día no ha sido introducido correctamente");
					}
					break;
				case 2:
					if (1<=day && day<=28) {
						System.out.println("La fecha ha sido introducida correctamente");
					}
					else {
						System.out.println("El día no ha sido introducido correctamente");
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if (1<=day && day<=30){
						System.out.println("La fecha ha sido introducida correctamente");
					}
					else {
						System.out.println("El día no ha sido introducido correctamente");
					}
					break;
				}
				
				}
			
			else {
				System.out.println("El año no ha sido introducido correctamente");
			}
		}
		
		else {
			System.out.println("El mes no ha sido introducido correctamente");
		}
		
	}
	
	public static void fechaArrays(int day, int month, int year) {
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (1<=month && month<=12) {
			if (year>0) {
				if (1<= day && day<=days[month-1]) {
					System.out.println("La fecha ha sido introducida correctamente");	
				}
				
				else {
					System.out.println("El día no ha sido introducido correctamente");
				}
			}
			
			else {
				System.out.println("El año no ha sido introducido correctamente");
			}
		}
		
		else {
			System.out.println("El mes no ha sido introducido correctamente");
		}
		
	}
	
	public static void fechaBisiestos(int day, int month, int year) {
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (1<=month && month<=12) {
			if (year>0) {
				if (year%4 == 0 && year%100 != 0) {
					days[1]=29;
					System.out.println("La fecha ha sido introducida correctamente");	
				}
				
				if (1<= day && day<=days[month-1]) {
					System.out.println("La fecha ha sido introducida correctamente");	
				}
				
				else {
					System.out.println("El día no ha sido introducido correctamente");
				}
			}
			
			else {
				System.out.println("El año no ha sido introducido correctamente");
			}
		}
		
		else {
			System.out.println("El mes no ha sido introducido correctamente");
		}
		
	}

}
