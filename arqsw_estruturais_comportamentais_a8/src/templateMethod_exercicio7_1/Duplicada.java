package templateMethod_exercicio7_1;

public class Duplicada extends Ler {

	@Override
	String duplicada(String s) {
		String x = s;
		return x + s;
	}

	@Override
	String invertida(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String maiuscula(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String minuscula(String s) {
		// TODO Auto-generated method stub
		return null;
	}

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

}
