package aula09;

import java.util.Map;

class LeituraDeArquivo {

	public static void main(String[] args) {
		
		String caminho = "/Users/marcosfaneli/eclipse-workspace/Aula01/resources/votos.txt";
		
		Leitor leitorDeArquivos = new Leitor();
		Map<String, Integer> totalVotos = leitorDeArquivos.executarLeitura(caminho);
		
		Escritor escritorDeArquivos = new Escritor();
		escritorDeArquivos.gravarEmArquivo(totalVotos);

	}

}
