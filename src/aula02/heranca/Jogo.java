package aula02.heranca;

public class Jogo {
	
	public static void main(String[] args) {
		Jogador hugal = new Jogador();
		hugal.nome = "Hugal";
		hugal.nivel = 10;
		
		hugal.correr();
		hugal.chutar();
		hugal.socar();
		
		Bot bot01 = new Bot();
		bot01.nome = "Bob Esponja";
		bot01.nivel = 11;
		bot01.vida = 7;
		bot01.tempoRenascimento = 60;
		bot01.pular();
		bot01.correr();
		bot01.roubar();
		
		BotRuim bot02 = new BotRuim();
		bot02.nome = "Heman";
		bot02.vida = 15;
		bot02.tempoRenascimento = 30;
		bot02.roubar();
	}

}
