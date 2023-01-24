package automovil;

/**
 * Ejercicio automóvil
 * @author paula.sanchez.tirado
 *
 */

public class testVehiculo {
	
	/**
	 * Comprobación de las clases padre e hijas
	 * @param args
	 */

	public static void main(String[] args) {
		
		// Objetos
		Coche coche1 = new Coche(6, 200, "5647", 4, "azul", 5, "Seat");
		Coche coche2 = new Coche(6, 200, "5637", 4, "verde", 5, "Renault");
		Moto moto1 = new Moto(5, 120, "5789", 2, 100);
		Camion camion1 = new Camion(5, 180, "3647", 4, 1200, 50000);
		
		coche1.activarReductora(false);
		coche2.activarReductora(true);
		
		System.out.println("Coche 1 es: "+coche2.toString());
	}
	

}
