package circulosEIntersecciones001;

public class Circulo {

	private double radio;
	private Punto centro;
	
	public Circulo (double radio, Punto centro) {
		this.radio = radio;
		this.centro = centro;
	}
	
	double suma = 0;
	
	public double sumaDeRadios(Circulo otroCirculo) {
		suma = this.radio + otroCirculo.radio;
		return suma;
	}
	
	public boolean intersectaCon(Circulo otroCirculo) {
		return (centro.distanciaEntrePuntos(otroCirculo.centro)< sumaDeRadios(otroCirculo));	
	}	
		
}
