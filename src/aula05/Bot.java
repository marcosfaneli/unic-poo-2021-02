package aula05;

import java.util.Scanner;

public class Bot {

	public static void main(String[] args) {
		
		System.out.println("Bem-vindo a calculadora geométrica");

		String resposta = "";
		
		Scanner leitor = new Scanner(System.in);
		try {
			while(!resposta.equalsIgnoreCase("q")) {
				System.out.println("Escolha forma geométrica desejada calcular a área:");
				System.out.println("1 - Retângulo");
				System.out.println("2 - Quadrado");
				System.out.println("3 - Triângulo");
				System.out.println("4 - Circulo");
				System.out.println("Pressiona 'q' para sair");
				
				resposta = leitor.next();
				
				
				if (!resposta.equalsIgnoreCase("q")) {
					escolher(resposta, leitor);
				}
			}
			System.out.println("Obrigado por usar nossa calculadora!!!");
			
		} finally {
			leitor.close();
		}
	}
	
	private static void escolher(String escolha, Scanner leitor) {
		try {
			int opcao = Integer.parseInt(escolha);
			
			Calculadora calc = null;
			
			switch (opcao) {
				case 1:
					calc = new Retangulo(leitor);
					break;
				case 2:
					calc = new Quadrado(leitor);
					break;
				case 3:
					calc = new Triangulo(leitor);
					break;
				case 4:
					calc = new Circulo(leitor);
					break;
				default:
					System.out.println("Você não escolheu uma opção do menu");
					break;
			}
			
			calc.calcular();

		} catch (Exception erro) {
			System.out.println("Opção inválida, tente novamente");
		}
	}

}
