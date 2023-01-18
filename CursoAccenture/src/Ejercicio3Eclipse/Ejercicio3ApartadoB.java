package Ejercicio3Eclipse;

public class Ejercicio3ApartadoB {
	
	static int dia = 10;
	static int nDNI = 57433222;
	static double precio;
	static final boolean ACTIVO = true;
	
	public static void main(String[] args) { // Como este método es estático los atributos tienen que ser estáticos
				
		precio = 135.12;
		
		System.out.println("Dia \t" + dia + "\nDNI\t" + nDNI + "\nPrecio\t" + precio + "\nActivo\t" + ACTIVO);

	}

}
