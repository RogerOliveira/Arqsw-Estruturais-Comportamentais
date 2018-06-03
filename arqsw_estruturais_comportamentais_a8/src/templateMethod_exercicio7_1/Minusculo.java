package templateMethod_exercicio7_1;

public class Minusculo extends Ler {

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String minuscula(String s) {
		s = s.toLowerCase();
		return s;
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
