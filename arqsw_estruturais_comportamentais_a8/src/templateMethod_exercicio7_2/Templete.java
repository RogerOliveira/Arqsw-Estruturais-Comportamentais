package templateMethod_exercicio7_2;

public abstract class Templete {

	final int[] main() {
		double[] x = { 1.1, 2.2, 3.2, 4.4, 5.5 };

		if (sortBol() == true) {
			return sort(x);

		}

		return null;

	}

	abstract int[] sort(double[] x);

	private boolean sortBol() {		
		return true;
	}

}
