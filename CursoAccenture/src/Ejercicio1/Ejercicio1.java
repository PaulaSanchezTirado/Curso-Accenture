package Ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Hola mundo");
		System.out.println("Pruebas de tipos");
		char c = 'A';
		double precio = 23.4;
		double iva = 0.16;
		double importeTotal;
		importeTotal = precio*iva+precio;
		
		System.out.println("Caracter: " +c);
		System.out.println("Equivalencia Unicode: " +(int)c); //El (int)c es un cast
		System.out.println("Importe Total = " +importeTotal);
		System.out.println("Primavera\nVerano\nOtoño\nInvierno");
		System.out.println("Lun\tMar\tMie\tJue\tVie"); // Esto proporciona más espacio entre lo escrito
		System.out.println("Lun\\Mar\\Mie\\Jue\\Vie");
		System.out.println("\"Cocodrilo\"");
			

		}

}
