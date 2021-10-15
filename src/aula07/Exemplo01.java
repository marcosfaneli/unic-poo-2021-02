package aula07;

import java.util.Collection;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Aluno[] alunos = new Aluno[2];
		
		alunos[0] = new Aluno("João");
		alunos[1] = new Aluno("Eduardo");
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i].getNome());
		}
	}

}
