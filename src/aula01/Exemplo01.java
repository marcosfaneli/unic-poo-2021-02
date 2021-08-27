package aula01;
import java.util.Date;

public class Exemplo01 {
	
	public static void main(String[] args) {
		
		JogadorDeFutebol dudu = new JogadorDeFutebol();
		dudu.nome = "Durval";
		dudu.posicao = "Atacante";
		dudu.numero = 47;
		
		Time palmeiras = new Time();
		palmeiras.nome = "Palmeiras";
		
		dudu.timeAtual = palmeiras;
		
		System.out.println("O nome do jogador é: " + dudu.nome);
		System.out.println("A posição do jogador é: " + dudu.posicao);
		System.out.println("O número do jogador é: " + dudu.numero);
		System.out.println("O time atual do jogador é: " + dudu.timeAtual.nome);
	}

}

class JogadorDeFutebol {
	String nome;
	String posicao;
	int numero;
	double valorDoPasse;
	boolean disponivel;
	Date dataDeNascimento;
	Time timeAtual;
}

class Time {
	String nome;
	int titulosNacionais;
	int titulosInternacionais;
}