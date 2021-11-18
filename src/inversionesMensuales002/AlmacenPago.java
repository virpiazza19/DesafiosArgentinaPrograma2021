package inversionesMensuales002;

public class AlmacenPago {

	private static final int MESES_EN_UN_ANIO = 12;

	public double[] saldoFinDeAnio(double montoParaInvertir, double interesAnual, int cantidadAniosMaximo) {
		double[] inversionAnual = new double[cantidadAniosMaximo];
		// Creo una lista de doubles que almacena los valores que resultan del cálculo del método
		int posicion = 0;

		for (int i = 0; i < cantidadAniosMaximo; i++) {
			montoParaInvertir = montoParaInvertir * Math.pow((1 + interesAnual / MESES_EN_UN_ANIO), MESES_EN_UN_ANIO);
			inversionAnual[posicion++] = Math.round(montoParaInvertir * 10000.0) / 10000.0;
			//Reemplazo el valor de la posicion de la lista por el montoParaInvertir con 4 decimales
			System.out.println(Math.round(montoParaInvertir * 10000.0) / 10000.0);
			//Imprimo en pantalla los resultados para que luego se muestren en la prueba.
		}
		return inversionAnual;
		//Devuelvo la lista de doubles con los valores anuales
	}

	public int cuantoTardaEnLlegarLaInversion(double montoParaInvertir, double interesAnual, double saldoFinalDeseado) {
		/*Si bien utilizo como parámetros doubles, no es necesario castear ya que, 
		 el valor que devuelve el método corresponde a la variable que declaro abajo - int cuantosMesesTardo */
		int cuantosMesesTardo = 0;
		if (saldoFinalDeseado <= montoParaInvertir) {
			// Si el saldo al que quiero llegar es menor que lo que quiero invertir, tira error
			throw new Error("El saldo al que quieres llegar debe ser mayor al monto que estás dispuesto a invertir");
			} else {	
		while (saldoFinalDeseado > montoParaInvertir) {
			montoParaInvertir *= 1 + interesAnual / MESES_EN_UN_ANIO;
				cuantosMesesTardo++;
			}
			System.out.println(cuantosMesesTardo);
			/*Mientras que el valor del saldo deseado sea menor al monto invertido: se ejecuta el while, 
			 suma un mes por cada vez que entra, e imprime en consola la cantidad de meses*/
			
			return cuantosMesesTardo;
		}
	}
}
