package automovil;

/**
 * Ejercicio automóvil
 * @author paula.sanchez.tirado
 *
 */

public class Coche extends Vehiculo implements ActivarReductora{
	
	/**
	 * Clase hija de vehículo que implementa una interfaz
	 */
	
	private String color;
	private int numeroPuertas;
	private String modelo;
	private boolean situacionReductora;
	
	
	public boolean isSituacionReductora() {
		return situacionReductora;
	}

	public void setSituacionReductora(boolean situacionReductora) {
		this.situacionReductora = situacionReductora;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Coche(int numeroMarchas, int velocMaxima, String numeroChasis, int numeroRuedas, String color,
			int numeroPuertas, String modelo) {
		super(numeroMarchas, velocMaxima, numeroChasis, numeroRuedas);
		setColor(color);
		setNumeroPuertas(numeroPuertas);
		setModelo(modelo);
		
	}
	
	Coche(){
		super();
	}

	@Override
	public void activarReductora(boolean activar) {
		
		situacionReductora=activar; // Sería incorrecto poner aquí ya true o false. No se rellenan aquí los datos
	}
	
	@Override
	public String toString() {
		return "Coche \nColor= " + getColor() + 
				"\nModelo= " + getModelo() +
				"\nMarchas= " + getNumeroMarchas() +
				"\nVelocidad= " + getVelocMaxima() + 
				"\nMatricula= " + getMatricula() + 
				"\nNumero de chasis= "+ getNumeroChasis()+
				"\nActivación de reductora: "+isSituacionReductora();
	}

	

}
