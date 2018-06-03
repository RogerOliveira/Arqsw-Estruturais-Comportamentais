package templateMethod_exercicio7_1;

public class Maiusculo extends Ler {

	@Override
	String duplicada(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String invertida(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String maiuscula(String s) {
		s = s.toUpperCase();
		return s;
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
