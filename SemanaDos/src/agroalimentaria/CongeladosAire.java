package agroalimentaria;

/**
 * Ejercicio de gestión de empresa agroalimentaria
 * @author paula.sanchez.tirado
 *
 */

public class CongeladosAire extends ProductosCongelados{
	
	/**
	 * Clase hija de ProductosCongelados. Herencia múltiple
	 */
	
	private String nitrogeno;
	private String oxigeno;
	private String CO2;
	private String vaporAgua;
	
	// Constructores
	public CongeladosAire(String nitrogeno, String oxigeno, String CO2, String vaporAgua) {
		super();
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.CO2 = CO2;
		this.vaporAgua = vaporAgua;		
	}
	
	// Getters y setters
	public String getNitrogeno() {
		return nitrogeno;
	}

	public void setNitrogeno(String nitrogeno) {
		this.nitrogeno = nitrogeno;
	}

	public String getOxigeno() {
		return oxigeno;
	}

	public void setOxigeno(String oxigeno) {
		this.oxigeno = oxigeno;
	}

	public String getCO2() {
		return CO2;
	}

	public void setCO2(String cO2) {
		CO2 = cO2;
	}

	public String getVaporAgua() {
		return vaporAgua;
	}

	public void setVaporAgua(String vaporAgua) {
		this.vaporAgua = vaporAgua;
	}

}
