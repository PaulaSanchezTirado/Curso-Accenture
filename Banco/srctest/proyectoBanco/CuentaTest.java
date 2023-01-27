package proyectoBanco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import excepciones.ExcepcionNumeroNegativo;
import excepciones.ExcepcionSaldo;
import excepciones.ExcepcionesLongitud;

class CuentaTest {
	
	final String NUMERO_CUENTA = "65739395";
	final String TITULAR1 = "Sergio";
	final String TITULAR2 = "Sergio Uclés Fernández";
	final int NUMERO_NEGATIVO = -10;
	final int NUMERO_POSITIVO = 10;
	final int NUMERO_POSITIVO_RETIRADA = 9;
	final int NUMERO_TOTAL = 1;
	final String CONCEPTO_LARGO = "Compra en tienda";
	final String CONCEPTO_CORTO = "Nada";
	
	Cuenta cuenta;
	
	@BeforeEach
	void creacionCuenta() throws ExcepcionesLongitud{
		cuenta = new Cuenta(NUMERO_CUENTA, TITULAR2);
	}

	@Test
	void testCuenta() {
		Assertions.assertThrows(ExcepcionesLongitud.class, () ->{
			new Cuenta(NUMERO_CUENTA, TITULAR1);
		});
	}
	
	@Test
	void testIngresarStringDoubleEImporte() {
		Assertions.assertThrows(ExcepcionNumeroNegativo.class, () ->{
			cuenta.ingresar(CONCEPTO_LARGO, NUMERO_NEGATIVO);
		});
	}
	
	@Test
	void testIngresarStringDoubleEConcepto() {
		Assertions.assertThrows(ExcepcionesLongitud.class, () ->{
			cuenta.ingresar(CONCEPTO_CORTO, NUMERO_NEGATIVO);
		});
	}
	
	@Test
	void testRetirarStringDoubleEConcepto() {
		Assertions.assertThrows(ExcepcionesLongitud.class, () ->{
			cuenta.retirar(CONCEPTO_CORTO, NUMERO_POSITIVO);
		});
	}
	
	@Test
	void testRetirarStringDoubleEImporte() {
		Assertions.assertThrows(ExcepcionNumeroNegativo.class, () ->{
			cuenta.retirar(CONCEPTO_LARGO, NUMERO_NEGATIVO);
		});
	}
	
	@Test
	void testRetirarStringDoubleESaldo() {
		Assertions.assertThrows(ExcepcionSaldo.class, () ->{
			cuenta.retirar(CONCEPTO_LARGO, NUMERO_POSITIVO);
		});
	}
	
	@Test
	void testIngresarDoubleE() {
		Assertions.assertThrows(ExcepcionNumeroNegativo.class, () ->{
			cuenta.ingresar(NUMERO_NEGATIVO);
		});
	}

	@Test
	void testRetirarDoubleE() {
		Assertions.assertThrows(ExcepcionNumeroNegativo.class, () ->{
			cuenta.retirar(NUMERO_NEGATIVO);
		});
	}
	
	@Test
	void testGetmNumero() {
		cuenta.setmNumero(NUMERO_CUENTA);
		assertEquals(NUMERO_CUENTA, cuenta.getmNumero());
	}

	@Test
	void testGetmTitular() {
		cuenta.setmTitular(TITULAR2);
		assertEquals(TITULAR2, cuenta.getmTitular());
	}
	
	/**
	 * 
	 * El método de get saldo ya se comprueba en ingresar y retirar
	 * @Test
	 * void testGetSaldo() {		
	 * }
	 */
	

	@Test
	void testIngresarDouble() throws ExcepcionNumeroNegativo, ExcepcionesLongitud {
		cuenta.ingresar(NUMERO_POSITIVO);
		assertEquals(NUMERO_POSITIVO, cuenta.getSaldo());
	}

	@Test
	void testIngresarStringDouble() throws ExcepcionNumeroNegativo, ExcepcionesLongitud {
		cuenta.ingresar(CONCEPTO_LARGO, NUMERO_POSITIVO);
		assertEquals(NUMERO_POSITIVO, cuenta.getSaldo());
	}

	@Test
	void testRetirarDouble() throws ExcepcionNumeroNegativo, ExcepcionesLongitud, ExcepcionSaldo {
		cuenta.ingresar(NUMERO_POSITIVO);
		cuenta.retirar(NUMERO_POSITIVO_RETIRADA);
		assertEquals(NUMERO_TOTAL, cuenta.getSaldo());
	}

	@Test
	void testRetirarStringDouble() throws ExcepcionSaldo, ExcepcionNumeroNegativo, ExcepcionesLongitud {
		cuenta.ingresar(CONCEPTO_LARGO, NUMERO_POSITIVO);
		cuenta.retirar(CONCEPTO_LARGO, NUMERO_POSITIVO_RETIRADA);
		assertEquals(NUMERO_TOTAL, cuenta.getSaldo()); 
	}

}
