package leerGrabar;

public class LeerGrabar {
	
	/**
	 * Recive Coches, Motod, Cuadrados, etc. Se hace con una interface porque todo lo que llegue ahí tiene que ser 
	 * del mismo tipo
	 */
	
	public void AccesoLectura(LecturaGrabacion rece) { // El objeto tiene que ser uno que implemente LecturaGrabacion
		// Abre BBDD
		// Prepara SQL
		// Ejecuta SQL
		rece.leer();
		System.out.println("Leído");
	}
	
	public void AccesoGrabacion(LecturaGrabacion rece) {
		rece.grabar();
		System.out.println("Grabado");
	}
}
