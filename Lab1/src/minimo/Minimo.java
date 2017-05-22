package minimo;

public class Minimo {

	public double encontraMenorElemento (double[] array) {
		double menorElemento = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < menorElemento)
				menorElemento = array[i];
		}
		return menorElemento;
	}
}
