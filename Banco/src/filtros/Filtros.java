package filtros;

/**
 * Filtros para ejercicio Banco
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Filtros {
	
	public static boolean longitudNecesaria(String nombre, int longitudMinima, int longitudMaxima) {
		boolean longitudMin;
		boolean longitudMax;
		longitudMin =  longitudMinima<=nombre.length();
		longitudMax = nombre.length()<=longitudMaxima;
		return longitudMin && longitudMax;
		
	}
	
	public static boolean fechaAdecuada(LocalDate fecha, int minYear, int maxYear) {
		LocalDate fechaHoy = LocalDate.now();
		LocalDate minFecha = fechaHoy.plusYears(minYear);
		LocalDate maxFecha = fechaHoy.plusYears(maxYear);
		return fecha.isAfter(minFecha) && fecha.isBefore(maxFecha);
		
	}
	
	public static LocalDate fechaCorrecta(String fecha) throws Exception {
		return fechaCorrecta(fecha, "dd-MM-yyyy");
	}
	
	public static LocalDate fechaCorrecta(String fecha, String formato) throws Exception {
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern(formato);
		
		try {
			LocalDate fech = (LocalDate.parse(fecha, format));	
			if(fech.toString().isEmpty()) {
				return fech;	
		
			}
		}
		catch (DateTimeParseException e){
			throw new Exception("Error en la fecha");
		}
		
		return null;
	}
	
}
