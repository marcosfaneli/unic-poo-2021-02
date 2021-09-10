package aula04.escola;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws Exception {
		Scanner leitor = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		String valorDigitado = leitor.nextLine();
		aluno.setNome(valorDigitado);
		
		System.out.println("Digite a matricula do aluno: ");
		String matriculaDigitada = leitor.nextLine();
		aluno.setMatricula(matriculaDigitada);
		
		System.out.println("Digite o bimestre: ");
		int bimestreDigitado = leitor.nextInt();
		
		System.out.println("Digite a nota do " + 
		   bimestreDigitado + " bimestre: ");
		double notaDigitada = leitor.nextDouble();
		
		aluno.definirNotaDoBimestre(bimestreDigitado, 
				notaDigitada);
		
		System.out.println(aluno.toString());

	}

}
