package automovil;

/**
 * Ejercicio automóvil
 */

import leerGrabar.LecturaGrabacion;
import leerGrabar.LeerGrabar;

public class Vehiculo implements LecturaGrabacion{
	
	/**
	 * Clase padre que implementa una interfaz
	 */

	private int numeroMarchas;
	private int velocMaxima;
	private String numeroChasis;
	private int numeroRuedas;
	private String matricula;
	
	static int contador;
	
	static {
		contador=1500;
	}
	
	Vehiculo(){
		setMatricula("B-"+ ++contador);
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNumeroMarchas() {
		return numeroMarchas;
	}
	public void setNumeroMarchas(int numeroMarchas) {
		this.numeroMarchas = numeroMarchas;
	}
	public int getVelocMaxima() {
		return velocMaxima;
	}
	public void setVelocMaxima(int velocMaxima) {
		this.velocMaxima = velocMaxima;
	}
	public String getNumeroChasis() {
		return numeroChasis;
	}
	public void setNumeroChasis(String numeroChasis) {
		this.numeroChasis = numeroChasis;
	}
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}
	
	public Vehiculo(int numeroMarchas, int velocMaxima, String numeroChasis, int numeroRuedas) {
		this(); // Con esto se puede invocar a otro constructor de la misma clase
		setNumeroChasis(numeroChasis);
		setVelocMaxima(velocMaxima);
		setNumeroMarchas(numeroMarchas);
		setNumeroRuedas(numeroRuedas);
		LeerGrabar dao = new LeerGrabar(); // Instancio el método
		dao.AccesoLectura(this); // Le mando el objeto
		dao.AccesoGrabacion(this);
	}


	@Override
	public void leer() {
		// Convierte SQL a dominio
		
	}

	@Override
	public void grabar() {
		// Convierte dominio a SQL
		
	}



}
