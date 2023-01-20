package dibujos;

/**
 * Ejercicio sobre herencia con figuras geométricas
 * @author paula.sanchez.tirado
 *
 */

public class Cuadrado extends FormasGeometricas{
	
	/**
	 * Clase hija que hereda de FormasGeometricas
	 */
	
	private double base;
	private double altura;
	
	// Constructores
	public Cuadrado(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
		calcularArea();
		dibujar();
	}
	
	// Getters y setters
	public double getBase() {
		return base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	// Override de los métodos de la clase padre
	@Override
	public void calcularArea() {
		area = base*altura;
	}
	
	@Override
	public void dibujar() {
		System.out.println("La base mide "+base+" y la altura mide "+altura);
	}
	


}
