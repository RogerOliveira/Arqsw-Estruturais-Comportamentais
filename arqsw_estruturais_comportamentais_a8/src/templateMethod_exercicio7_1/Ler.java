package templateMethod_exercicio7_1;

public abstract class Ler {

	boolean duplicadaBool() {
		return true;
	}

	boolean invertidaBool() {
		return true;
	}

	boolean maiusculaBool() {
		return true;
	}

	boolean minusculaBool() {
		return true;
	}

	final String ler() {
		String s = "No tears left to cry.";
		if (duplicadaBool() == true) {
			return duplicada(s);
		}

		if (invertidaBool() == true) {
			return invertida(s);
		}
		if (maiusculaBool() == true) {
			return maiuscula(s);

		}
		if (minusculaBool() == true) {
			return minuscula(s);
		}
		return "";

	}

	abstract String duplicada(String s);

	abstract String invertida(String s);

	abstract String maiuscula(String s);

	abstract String minuscula(String s);

}
