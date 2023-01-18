package Ejercicio4Eclipse;

public class Ejercicio4ApartadoB {
	
	final static double IVA = 0.21; // No puede haber constantes dentro del método

	public static void main(String[] args) {
		
		int cantidad;
		int unidades;
		double precio;
		double importe;
		int total;
		double iva;
		
		cantidad = 3;
		unidades = 12;
		precio = 5.40;
		
		importe = cantidad*unidades*precio;
		// total = (int) (importe*1.21);
		iva = importe*IVA;
		total = (int) (importe+iva);
		
		System.out.println("Cantidad\t= " + cantidad);
		System.out.println("Unidades\t= " + unidades);
		System.out.println("Precio\t\t= " + precio);
		System.out.println("Importe\t\t= " + importe);
		System.out.println("Iva\t\t= " + iva);
		System.out.println("Total\t\t= " + total + "\tdebería ser:" + (importe+iva));

	}

}
