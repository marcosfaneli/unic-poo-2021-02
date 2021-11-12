package aula09;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class Escritor {
	
	private List<Candidato> candidatos = new ArrayList<>();
	private OrdenadorCandidato ordenador = new OrdenadorCandidato();
	
	private void ordenar(Map<String, Integer> resultado) {
		for (String chave : resultado.keySet()) {
			Candidato c = new Candidato(chave, resultado.get(chave));
			candidatos.add(c);
		}
		
		candidatos.sort(ordenador);
		
	}
	
	public void gravarEmArquivo(Map<String, Integer> resultado) {

		System.out.println("Gerando arquivo com dados processados");
		
		this.ordenar(resultado);
		
		try {
			FileWriter escritor = new FileWriter("resources/resultado.txt");
			
			escritor.write("Resultado Final\n");

			for (Candidato cand : candidatos) {
				String linha = cand.toString() + "\n";
				escritor.write(linha);
			}
			escritor.close();
			
			System.out.println("Arquivo gerado com sucesso");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
