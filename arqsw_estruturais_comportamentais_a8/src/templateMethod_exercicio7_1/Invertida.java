package templateMethod_exercicio7_1;

public class Invertida extends Ler {

	@Override
	String duplicada(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String invertida(String s) {
		String inv = "";
		for (int x = s.length() - 1; x >= 0; x--) {
			inv += s.charAt(x);
		}
		return inv;
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