package proyectoBanco;

/**
 * Test de clases del proyecto Banco
 */

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {
	
	/**
	 * Tests de la clase movimientos del proyecto Banco
	 */
	
	final String CONCEPTO = "Concepto de prueba";
	final double IMPORTE = 100;
	final String VACIO = "";
	
	Movimiento movimiento;
	
	@BeforeEach
	void objMovimiento() {
		movimiento = new Movimiento();
	}
	
	@Test
	/**
	 * Compruebo el get y el set de concepto
	 */
	void testGetmConcepto() {
		movimiento.setmConcepto(CONCEPTO);
		assertEquals(CONCEPTO, movimiento.getmConcepto());
	}

	@Test
	/**
	 * Compruebo el get y el set de fecha
	 */
	void testGetmFecha() {
		LocalDate fecha = LocalDate.now();
		movimiento.setmFecha(fecha);
		assertEquals(fecha, movimiento.getmFecha());
	}

	@Test
	/**
	 * Compruebo el get y el set de importe
	 */
	void testGetmImporte() {
		movimiento.setmImporte(IMPORTE);
		assertEquals(IMPORTE, movimiento.getmImporte());
	}

}
