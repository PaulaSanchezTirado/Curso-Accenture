package excepciones;

public class ExcepcionNumeroNegativo extends Exception{

	public ExcepcionNumeroNegativo() {
		super("Error. Número negativo");
	}
	
	public ExcepcionNumeroNegativo(String mensajeError) {
		super(mensajeError);
	}
}
