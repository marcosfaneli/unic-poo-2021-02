package aula09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Exemplo01 {
	
	// Tabelas de espalhamento

	public static void main(String[] args) {
		
		List<String> alunos2 = new ArrayList<>();
		alunos2.add("Adriel");
		alunos2.add("Ayrton");
		alunos2.add("Adriel");
		alunos2.add("Breno");
		System.out.println(alunos2);
		
		Set<String> alunos = new HashSet<String>();
		alunos.add("Adriel");
		alunos.add("Ayrton");
		alunos.add("Adriel");
		alunos.add("Breno");
		System.out.println(alunos);
		
		Map<String, Integer> alunos3 = new HashMap<>();
		alunos3.put("Adriel", 18);
		alunos3.put("Ayrton", 35);
		alunos3.put("Adriel", 22);
		alunos3.put("Breno", 23);
		System.out.println(alunos3);
	}

}
