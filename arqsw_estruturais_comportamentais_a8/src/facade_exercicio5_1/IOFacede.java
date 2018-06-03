package facade_exercicio5_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



public class IOFacede {

	public void gravarArquivoBinario(String nome, byte[] conteudo) {
		File outFile = new File(nome);
		try {
			FileOutputStream outStream = new FileOutputStream(outFile);
			outStream.write(conteudo);
			outStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void lerArquivoBinario(String nome) {
		File inFile = new File(nome);
		try {
			FileInputStream inStream = new FileInputStream(inFile);
			int tamanho = (int) inFile.length();
			byte[] conteudo = new byte[tamanho];
			inStream.read(conteudo);
			for (int i = 0; i < conteudo.length; i++) {
				System.out.println(conteudo[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
