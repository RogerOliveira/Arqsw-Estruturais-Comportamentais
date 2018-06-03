package adapter_exercicio4_1;

import java.util.Map;

public class DoMap implements Adapter {

	@SuppressWarnings("rawtypes")
	private Map map;

	@SuppressWarnings("rawtypes")
	@Override
	public Map getMap() {
		return map;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setMap(String[][] matriz) {
		// TODO Auto-generated method stub
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[0].length; c++) {
				System.out.println(matriz[l][c]);
				this.map.put(matriz[c], matriz[l]);
			}
			System.out.println("Teste1");
		}

	}

}
