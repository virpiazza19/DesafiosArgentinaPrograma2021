package circulosEIntersecciones001;

public class Punto {

	double x;
	double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	public double distanciaEntrePuntos(Punto otroPunto) {
		return Math.sqrt(Math.pow (x - otroPunto.x, 2) + Math.pow (y - otroPunto.y,2));
	}

}
