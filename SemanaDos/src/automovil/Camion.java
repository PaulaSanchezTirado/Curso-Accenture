package automovil;

/**
 * Ejercicio automóvil
 * @author paula.sanchez.tirado
 *
 */

public class Camion extends Vehiculo{
	
	/**
	 * Clase hija que hereda de vehículo
	 */
	
	private int pesoMaximo;
	private int precio;
	
	public int getPesoMaximo() {
		return pesoMaximo;
	}
	
	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Camion(int numeroMarchas, int velocMaxima, String numeroChasis, int numeroRuedas, int pesoMaximo, int precio) {
		super(numeroMarchas, velocMaxima, numeroChasis, numeroRuedas);
		setPesoMaximo(pesoMaximo);
		setPrecio(precio);
		
	}
	
	

}
