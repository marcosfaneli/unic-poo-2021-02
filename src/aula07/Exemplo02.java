package aula07;

import java.util.ArrayList;
import java.util.List;

class Exemplo02 {

	public static void main(String[] args) {
		
		List<String> alunos = new ArrayList<String>();
		
		alunos.add("Adriel");
		alunos.add("Allan");
		alunos.add("Natan");
		alunos.add("Giovanni");
		
//		System.out.println(alunos.size());
//		
//		System.out.println(alunos.get(2));
//		
//		// percorrendo a lista com for
//		for (int i = 0; i < alunos.size(); i++) {
//			System.out.println(alunos.get(i));
//		}
//		
//		// usando while
//		int i = 0;
//		while (alunos.size() > i) {
//			System.out.println(alunos.get(i));
//			i++;
//		}
//		
//		alunos.forEach(aluno -> System.out.println(aluno));
		
		// percorrendo com foreach
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.remove(2);
		
		System.out.println("Após remoção");
		for(String aluno : alunos) {
			System.out.println(aluno);
		}
		
	}

}
