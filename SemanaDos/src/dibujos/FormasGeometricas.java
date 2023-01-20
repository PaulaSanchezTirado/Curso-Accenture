package dibujos;

/**
 * Ejercicio sobre herencia con figuras geométricas
 * @author paula.sanchez.tirado
 *
 */

public abstract class FormasGeometricas {
	
	/**
	 * Clase padre con los métodos calcularArea y dibujar que permiten conocer el área
	 * de las figuras geométricas y saber el tamaño de los lados (o radio)
	 */
	
	protected double area;
	protected double base;
	protected double altura;
	
	// Constructores
	public FormasGeometricas(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public FormasGeometricas() {
		
	}
	
	// Getters y setters
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

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
	
	// Métodos exigidos por el ejercicio
	public abstract void calcularArea();
	
	public void dibujar() {
		System.out.println("La base mide"+base+" y la altura mide"+altura);
	}

	
}
