package maximo;

public class Maximo {
	
	public double encontraMaiorElemento (double[] array) {
		double maiorElemento = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maiorElemento)
				maiorElemento = array[i];
		}
		return maiorElemento;
	}
	
}
