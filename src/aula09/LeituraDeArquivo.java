package aula09;

import java.util.Map;

class LeituraDeArquivo {

	public static void main(String[] args) {
		
		Leitor leitorDeArquivos = new Leitor();
		Map<String, Integer> totalVotos = leitorDeArquivos.executarLeitura("/Users/marcosfaneli/eclipse-workspace/Aula01/resources/votos.txt");
		
		Escritor escritorDeArquivos = new Escritor();
		escritorDeArquivos.gravarEmArquivo(totalVotos);

	}

}
