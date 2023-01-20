package dibujos;

/**
 * Ejercicio sobre herencia con figuras geométricas
 * @author paula.sanchez.tirado
 *
 */

public class Circulo extends FormasGeometricas{
	
	/**
	 * Clase hija que hereda de FormasGeometricas
	 */
	
	private double radio;
	
	// Constructores
	public Circulo(double radio) {
		super();
		this.radio = radio;
		calcularArea();
		dibujar();
	}
	
	// Getters y setters
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	// Override de los métodos de la clase padre
	@Override
	public void calcularArea() {
		area = Math.PI*Math.pow(radio, 2);
	}
	
	@Override
	public void dibujar() {
		System.out.println("El radio mide "+radio);
	}

}
