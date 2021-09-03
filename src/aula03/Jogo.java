package aula03;

public class Jogo {

	public static void main(String[] args) {
		Jogador goku = new Jogador("goku",18,1500);
		
		Jogador bruceLee = new Jogador("Bruce Lee", 150, 1000);
		
		Luta luta = new Luta(goku, bruceLee);
		luta.lutar();
		
	}
}
