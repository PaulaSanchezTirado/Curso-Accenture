package filtros;

/**
 * Filtros para ejercicio Banco
 */

import java.time.LocalDate;

public class Filtros {
	
	public static boolean longitudNecesaria(String nombre, int longitudMinima, int longitudMaxima) {
		boolean longitudMin;
		boolean longitudMax;
		longitudMin =  longitudMinima<=nombre.length();
		longitudMax = nombre.length()<=longitudMaxima;
		return longitudMin && longitudMax;
		
	}
	
	public static boolean fechaCorrecta(LocalDate fecha, int minYear, int maxYear) {
		LocalDate fechaHoy = LocalDate.now();
		LocalDate minFecha = fechaHoy.plusYears(minYear);
		LocalDate maxFecha = fechaHoy.plusYears(maxYear);
		return fecha.isAfter(minFecha) && fecha.isBefore(maxFecha);
		
	}
	
	
}
