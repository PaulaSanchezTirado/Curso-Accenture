package filtros;

/**
 * Tests de filtros para ejercicio Banco
 */

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FiltrosTest {
	
	final String TITULAR1 = "Titulo de prueba";
	final String TITULAR2 = "Titu";
	final String TITULAR3 = "";
	final LocalDate FECHA1 = LocalDate.of(2026, 02, 25);
	final LocalDate FECHA2 = LocalDate.of(2020, 02, 25);
	final LocalDate FECHA3 = LocalDate.of(2030, 02, 25);
	
	/**
	 * Test de la clase Filtros
	 */
	
	@Test
	/**
	 * Devuelve true si el titular tiene una longitud de entre 10 y 40.
	 * Si devuelve false, el test da error
	 */
	void testLongitudNecesariaValidaMin() {
		assertTrue(Filtros.longitudNecesaria(TITULAR1, 10, 40)); 
	}
	
	@Test
	/**
	 * Si la longitud del titular es menor de 5, pasa el test
	 */
	void testLongitudNecesariaInvalidaMin() {
		assertFalse(Filtros.longitudNecesaria(TITULAR2, 5, 40));
	}
	
	@Test
	/**
	 * Si la longitud del titular es menor de 40, pasa el test
	 */
	void testLongitudNecesariaValidaMax() {
		assertTrue(Filtros.longitudNecesaria(TITULAR1, 10, 40));
	}
	
	@Test
	/**
	 * Si la longitud del titular es mayor que 3, pasa el test
	 */
	void testLongitudNecesariaInvalidaMax() {
		assertFalse(Filtros.longitudNecesaria(TITULAR2, 2, 3));
	}
	
	@Test
	/**
	 * Si el titular está vacío, pasa el test
	 */
	void testLongitudNecesariaVacia() {
		assertFalse(Filtros.longitudNecesaria(TITULAR3, 1, 40));
	}
	
	@Test
	/**
	 * Si la fecha es tres años después a la actual, pasa el test
	 */
	void testFechaCorrectaMin() {
		assertTrue(Filtros.fechaCorrecta(FECHA1, 3, 5));
	}
	
	@Test
	/**
	 * Si la fecha es hasta cinco años después de la actual, pasa el test
	 */
	void testFechaCorrectaMax() {
		assertTrue(Filtros.fechaCorrecta(FECHA1, 0, 5));
	}
	
	@Test
	/**
	 * Si la fecha no es tres años después de la actual, pasa el test
	 */
	void testFechaIncorrectaMin() {
		assertFalse(Filtros.fechaCorrecta(FECHA2, 3, 5));
	}
	
	@Test
	/**
	 * Si la fecha es más de cinco años después de la actual, pasa el test
	 */
	void testFechaIncorrectaMax() {
		assertFalse(Filtros.fechaCorrecta(FECHA3, 0, 5));
	}
}
