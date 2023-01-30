package filtros;

/**
 * Tests de filtros para ejercicio Banco
 */

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import excepciones.ExcepcionesLongitud;

class FiltrosTest {
	
	final String TITULAR1 = "Titulo de prueba";
	final String TITULAR2 = "Titu";
	final String TITULAR3 = "";
	
	final LocalDate FECHA1 = LocalDate.of(2026, 02, 25);
	final LocalDate FECHA2 = LocalDate.of(2020, 02, 25);
	final LocalDate FECHA3 = LocalDate.of(2030, 02, 25);
	
	final String FECHA4 = "21-12-2023";
	final String FECHA5 = "12/01/2023";
	
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
	void testFechaAdecuadaMin() {
		assertTrue(Filtros.fechaAdecuada(FECHA1, 3, 5));
	}
	
	@Test
	/**
	 * Si la fecha es hasta cinco años después de la actual, pasa el test
	 */
	void testFechaAdecuadaMax() {
		assertTrue(Filtros.fechaAdecuada(FECHA1, 0, 5));
	}
	
	@Test
	/**
	 * Si la fecha no es tres años después de la actual, pasa el test
	 */
	void testFechaNoAdecuadaMin() {
		assertFalse(Filtros.fechaAdecuada(FECHA2, 3, 5));
	}
	
	@Test
	/**
	 * Si la fecha es más de cinco años después de la actual, pasa el test
	 */
	void testFechaNoAdecuadaMax() {
		assertFalse(Filtros.fechaAdecuada(FECHA3, 0, 5));
	}
	
	/**
	 * La fecha es correcta
	 */
	@Test
	void testFechaCorrectaString(){
		assertEquals(Filtros.fechaCorrecta(FECHA4), LocalDate.of(2023, 12, 21));
	}
	
	/**
	 * La fecha es correcta aportando formato
	 */
	@Test
	void testFechaCorrectaStringFormato(){
		assertEquals(Filtros.fechaCorrecta(FECHA5, "dd/MM/yyyy"), LocalDate.of(2023, 01, 12));
	}
	
	/**
	 * La fecha devuelve null porque es incorrecta
	 * @param param
	 * 
	 * También podría hacerse con @RepeatedTest
	 */
	@ParameterizedTest
	@ValueSource(strings = {"12-12", "02-2023", "aa-bb-cc", "12122023", "12-12-23"})
	void testFechaCorrectaNull(String param){
		assertEquals(Filtros.fechaCorrecta(param), null);
	}
}
