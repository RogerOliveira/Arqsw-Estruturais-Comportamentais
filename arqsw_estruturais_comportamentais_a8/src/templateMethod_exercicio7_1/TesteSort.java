package templateMethod_exercicio7_1;

public class TesteSort {

	public static void main(String[] args) {
		
		
		Duplicada dupe = new Duplicada();
		System.out.println(dupe.ler());
		
		
		Invertida inv = new Invertida();
		System.out.println(inv.ler());
		
		
		Maiusculo upp = new Maiusculo();
		System.out.println(upp.ler());
		
		
		Minusculo low = new Minusculo();
		System.out.println(low.ler());

	}

}
