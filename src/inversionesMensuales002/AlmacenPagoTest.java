package inversionesMensuales002;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class AlmacenPagoTest {
	
	AlmacenPago a1;
	
	@Test
	public void ejemplo1SaldoFinDeAnio() {
		AlmacenPago a1 = new AlmacenPago();
		double [] esperado = {1268.2418, 1608.4372, 2039.8873, 2587.0704};
		double [] actual = a1.saldoFinDeAnio(1000, 0.24, 4);
		assertArrayEquals(esperado, actual,0.1);
	}
	@Test
	public void ejemplo2SaldoFinDeAnio() {
		AlmacenPago a1 = new AlmacenPago();
		double [] esperado = {2000, 4000.0001, 8000.0002, 16000.0005, 32000.0012};
		double [] actual = a1.saldoFinDeAnio(1000, 0.71355714, 5);
		assertArrayEquals(esperado, actual, 0.1);
	}
	
	@Test
	public void ejemplo1CuantoTardaEnLlegarLaInversion() {
		AlmacenPago a1 = new AlmacenPago();
		assertEquals(120, a1.cuantoTardaEnLlegarLaInversion(1000, 0.07, 2000));
	}
	
	@Test
	public void ejemplo2CuantoTardaEnLlegarLaInversion() {
		AlmacenPago a1 = new AlmacenPago();
		assertEquals(48, a1.cuantoTardaEnLlegarLaInversion(1000, 0.24, 2587));
	}
	
	@Test  (expected = Error.class)
	public void elSaldoDeseadoNoPuedeSerMenorAlMontoParaInvertir() {
		AlmacenPago a1 = new AlmacenPago();
		a1.cuantoTardaEnLlegarLaInversion(1000, 0.12, 999);
	}
		
	@After //Cree un after que devuelva el valor a a1, ya que si este, me seguían corriendo las pruebas y no terminaba
	public void teardown() {
		a1 = null;
	}
	
}
	
