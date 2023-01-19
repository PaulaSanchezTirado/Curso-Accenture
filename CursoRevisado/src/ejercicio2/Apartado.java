package ejercicio2;

/**
 * Ejercicio 1 de la presentación Programación Java 
 * @author paula.sanchez.tirado
 *
 */

public class Apartado {
	
	/**
	 * En este ejercicio se modifican algunos errores que contenía el código (escritos en comentarios en el mismo)
	 * y se añadía el texto "En Java puede..." con distintos separadores
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		int $nombre;
		int PasaDo;
		int alcance; // Falta ; al final de la línea
		 
		int _contador;
		_contador=25;
		 
		$nombre=_contador;
		PasaDo=_contador; // La variable pasado no existe. Es PasaDo

		System.out.println($nombre + " / " + _contador);
		System.out.println("En \"Java\" puede \n  que tengamos que utilizar "
				+ "\n  caracteres especiales");

	}
}
