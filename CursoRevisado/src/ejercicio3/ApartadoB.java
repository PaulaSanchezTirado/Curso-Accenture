package ejercicio3;

/**
 * Ejercicio 3 de la presentación Programación en Java
 * @author paula.sanchez.tirado
 *
 */

public class ApartadoB {
	
	/**
	 * En este ejercicio se definen diversas variables que pueden ser vistas por la clase
	 * Asimismo, se imprime por pantalla un mensaje con distintos separadores
	 * @param args
	 */
	
	static int dia = 10;
	static int nDNI = 57433222;
	static double precio;
	static final boolean ACTIVO = true;
	
	public static void main(String[] args) { // Como este método es estático los atributos tienen que ser estáticos
				
		precio = 135.12;
		
		System.out.println("Dia \t" + dia + "\nDNI\t" + nDNI + "\nPrecio\t" + precio + "\nActivo\t" + ACTIVO);

	}

}
