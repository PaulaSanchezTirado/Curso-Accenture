package automovil;

/**
 * Ejercicio automóvil
 * @author paula.sanchez.tirado
 *
 */

public class Moto extends Vehiculo{
	
	/**
	 * Clase hija de vehículo
	 */
	
	private int deposito;
	
	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public Moto(int numeroMarchas, int velocMaxima, String numeroChasis, int numeroRuedas, int deposito) {
		super(numeroMarchas, velocMaxima, numeroChasis, numeroRuedas);
		setDeposito(deposito);
		
	}

}
