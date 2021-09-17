package aula05;

import java.util.Scanner;

public class Bot {

	public static void main(String[] args) {
		
		System.out.println("Bem-vindo a calculadora geométrica");

		String resposta = "";
		
		while(!resposta.equalsIgnoreCase("q")) {
			System.out.println("Escolha forma geométrica desejada calcular a área:");
			System.out.println("1 - Retângulo");
			System.out.println("2 - Quadrado");
			System.out.println("3 - Triângulo");
			System.out.println("Pressiona 'q' para sair");
			
			Scanner leitor = new Scanner(System.in);
			resposta = leitor.next();
			
			if (resposta.equals("1")) {
				System.out.println("Calculando a área do retangulo");
			} else if (resposta.equals("2")) {
				System.out.println("Calculando a área do quadrado");
			} else if (resposta.equals("3")) {
				System.out.println("Calculando a área do triangulo");
			} else if (!resposta.equalsIgnoreCase("q")) {
				System.out.println("Opção inválida, tente novamente");
			}
		}
		System.out.println("Obrigado por usar nossa calculadora!!!");
	}

}
