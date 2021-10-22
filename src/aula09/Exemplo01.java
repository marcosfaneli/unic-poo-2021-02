package aula09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Exemplo01 {
	
	// Tabelas de espalhamento

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<String>();
		
		List<String> alunos2 = new ArrayList<>();
		
		alunos2.add("Adriel");
		alunos2.add("Ayrton");
		alunos2.add("Adriel");
		alunos2.add("Breno");
		
		System.out.println(alunos2);
		
		alunos.add("Adriel");
		alunos.add("Ayrton");
		alunos.add("Adriel");
		alunos.add("Breno");
		
		System.out.println(alunos);
	}

}
