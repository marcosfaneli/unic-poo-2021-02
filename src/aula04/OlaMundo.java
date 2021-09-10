package aula04;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {

		System.out.println("Digite seu nome:");
		
		Scanner leitor = new Scanner(System.in);
		String nome = leitor.nextLine();
		
		System.out.println("Olá " + nome);

	}

}
