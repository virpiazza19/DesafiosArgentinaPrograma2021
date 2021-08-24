package ponyExpress003;

public class PonyExpress {
	
	private static final int MILLAS_MAXIMAS = 100;
	
	public int caballos(int[] distancias) {
		int cantidadDeCaballos = 1;
		int millas = 0;
		for (int distancia = 0; distancia<distancias.length; distancia++) {
			if ((distancias[distancia] > MILLAS_MAXIMAS) || (distancias[distancia] < 0)) {
				throw new Error("La distancia entre estación y estación debe estar entre 1 y 100 millas");
			}  else
			millas += distancias[distancia];
			if (millas > MILLAS_MAXIMAS) {
				cantidadDeCaballos++;
				millas = distancias[distancia];
			}
		}
		return cantidadDeCaballos;
	}
}
