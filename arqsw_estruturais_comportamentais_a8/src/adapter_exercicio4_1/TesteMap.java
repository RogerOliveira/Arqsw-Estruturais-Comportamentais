package adapter_exercicio4_1;

public class TesteMap {

	public static void main(String[] args) {
		String[][] notas = { { "9", "8", "8", "9", "8" }, { "9", "8", "9", "8", "8" },
				{ "7", "7", " 7", "8", "8" } };

		DoMap map = new DoMap();
		map.setMap(notas);
		System.out.println(map.getMap());
	}

}
