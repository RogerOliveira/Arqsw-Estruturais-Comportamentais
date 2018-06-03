package adapter_exercicio4_2;

public class TesteSomador {

	public static void main(String[] args) {
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}

}
