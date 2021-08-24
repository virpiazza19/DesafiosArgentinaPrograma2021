package ponyExpress003;

public class PonyExpress {
	
	private static final int MILLAS_MAXIMAS = 100;
	private static final int MILLAS_MINIMAS = 0;
	
	public int caballos(int[] distancias) {
		int cantidadDeCaballos = 1;
		int millas = MILLAS_MINIMAS;
		for (int distancia = MILLAS_MINIMAS; distancia<distancias.length; distancia++) {
			if ((distancias[distancia] > MILLAS_MAXIMAS) || (distancias[distancia] < MILLAS_MINIMAS)) {
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
