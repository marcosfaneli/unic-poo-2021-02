package aula04;

import java.util.Scanner;

public class Adivinhacao {

	public static void main(String[] args) {
        //cast
		int numeroMagico = (int) (Math.random() * (10 - 1) + 1);
		System.out.println("Bem-vindo ao jogo de adivinhação!");
		System.out.println("O programa irá pensar em um número e você irá adivinhar");
		
		int maximoDePalpites = 3;
		int numeroDigitado = 0;
		int palpitesDoJogador = 0;

		Scanner leitor = new Scanner(System.in);
		
		while(numeroMagico != numeroDigitado && palpitesDoJogador < maximoDePalpites) {
			System.out.println("Digite um número:");
			numeroDigitado = leitor.nextInt();
			
			if(numeroMagico == numeroDigitado) {
				System.out.println("Parabéns, você acertou!");
			} else {
				System.out.println("Infelizmente você errou :(");
			}
			
			palpitesDoJogador++;
		}
		
		System.out.println("O número era " + numeroMagico);
	}

}
