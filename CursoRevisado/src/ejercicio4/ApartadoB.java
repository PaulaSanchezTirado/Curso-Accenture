package ejercicio4;

/**
 * Ejercicio 4 de la presentación Programación Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoB {
	
	/**
	 * Este código calcula el importe de artículos comprados al que hay que sumarle el IVA
	 * 
	 */
	
	static final double IVA = 0.21; // Es mejor definir las contantes aquí
	
	// Para que el método estático pueda utilizar la variable IVA, esta tiene que ser estática también

	public static void main(String[] args) {
		
		int cantidad;
		int unidades;
		double precio;
		double importe;
		int total;
		double iva;
		
		/*
		 * Se definen las variables aquí porque solo se quiere lo que pide el ejercicio
		 */
		
		cantidad = 3;
		unidades = 12;
		precio = 5.40;
		
		importe = cantidad*unidades*precio;
		// Otra forma de hacerlo: total = (int) (importe*1.21);
		iva = importe*IVA;
		total = (int) (importe+iva); // tiene que hacerse un cast para pasar de double a int 
		
		System.out.println("Cantidad\t= " + cantidad);
		System.out.println("Unidades\t= " + unidades);
		System.out.println("Precio\t\t= " + precio);
		System.out.println("Importe\t\t= " + importe);
		System.out.println("Iva\t\t= " + iva);
		System.out.println("Total\t\t= " + total + "\tdebería ser:" + (importe+iva));
	}
}
