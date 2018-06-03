package facade_exercicio5_1;;

public class TesteIO {

	public static void main(String[] args) {
		IOFacede iof = new IOFacede();
		byte[] byteArray = {10,20,40,50,60,70,80};
		iof.gravarArquivoBinario("teste.bin", byteArray);
		iof.lerArquivoBinario("teste.bin");

	}

}
