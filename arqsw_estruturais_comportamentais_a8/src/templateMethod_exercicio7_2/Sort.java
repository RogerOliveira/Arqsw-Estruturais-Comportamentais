package templateMethod_exercicio7_2;

import java.util.Arrays;

public class Sort extends Templete {

	@Override
	int[] sort(double[] x) {

		int parteInteira = 0;
		int pontoFlutuante = 0;
		int[] array = new int[x.length];
		for (int i = 0; i < x.length; i++) {
			parteInteira = (int) x[i];
			pontoFlutuante = (int) ((x[i] - parteInteira) * 21);
			array[i] = pontoFlutuante;
			System.out.println(pontoFlutuante);
		}
		Arrays.sort(array);
		Arrays.toString(array);
		return array;
	}

	private boolean sortBol() {
		return true;
	}

}
