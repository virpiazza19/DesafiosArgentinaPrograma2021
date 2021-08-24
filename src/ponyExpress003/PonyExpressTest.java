package ponyExpress003;

import static org.junit.Assert.*;

import org.junit.Test;

public class PonyExpressTest {
	
	PonyExpress p1 = new PonyExpress();
	
	@Test
	public void EjemplosDeLaConsigna() {	
		assertEquals(1, p1.caballos(new int[] { 18, 15 }));
		assertEquals(2, p1.caballos(new int[] { 43, 23, 40, 13 }));
		assertEquals(3, p1.caballos(new int[] { 33, 8, 16, 47, 30, 30, 46 }));
		assertEquals(3, p1.caballos(new int[] { 51, 51, 51 }));
		assertEquals(4, p1.caballos(new int[] { 6, 24, 6, 8, 28, 8, 23, 47, 17, 29, 37, 18, 40, 49 }));
	}
	
	@Test
	public void DistanciaMinima(){
		assertEquals(1, p1.caballos(new int[] { 1 }));
	}
	
	@Test (expected = Error.class)
	public void DistanciaMayorA100EsNula() {
		assertEquals(3, p1.caballos(new int[] { 60, 42, 103}));
	}
	
	@Test (expected = Error.class)
	public void DistanciaMenorA0EsNula() {
		assertEquals(3, p1.caballos(new int[] { 60, 42, 13, 32, 0}));
	}
	@Test 
	public void UnCaballosPara100Millas() {
		assertEquals(1, p1.caballos(new int[] { 100}));
	}
	@Test
	public void PobrePrimerCaballo() {
		assertEquals(2, p1.caballos(new int[] { 100, 1}));
	}
}

