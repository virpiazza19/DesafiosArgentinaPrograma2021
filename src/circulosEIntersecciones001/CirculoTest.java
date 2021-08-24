package circulosEIntersecciones001;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	@Test
	public void test() {
		Circulo c1= new Circulo(1,new Punto(0,0));
		Circulo c2= new Circulo(1.5, new Punto(10,10)); //false
		assertFalse(c1.intersectaCon(c2));
	}
	
	@Test
	public void test2() {
		Circulo c1= new Circulo(1,new Punto(0,0));
		Circulo c2= new Circulo(1.5, new Punto(1,1)); //true
		assertTrue(c1.intersectaCon(c2));
	}

}
