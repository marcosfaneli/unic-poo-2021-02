package aula03;

class Luta {
	
	private Jogador jogador1;
	private Jogador jogador2;
	
	Luta(Jogador jogador1, Jogador jogador2){
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}
	
	void lutar() {
		while(jogador1.getVida() > 0 && jogador2.getVida() > 0) {
			
			double socoJogador1 = jogador1.socar();
			jogador2.reduzirVida(socoJogador1);
			
			double socoJogador2 = jogador2.socar();
			jogador1.reduzirVida(socoJogador2);

			System.out.println(jogador1.getNome() + " => " + jogador1.getVida() + " vida ");
			System.out.println(jogador2.getNome() + " => " + jogador2.getVida() + " vida ");
			System.out.println("-----------------------------------");
		}
		
		checarResultado();
		exibirPlacar();
	}
	
	private void checarResultado() {
		if (jogador1.getVida() > jogador2.getVida()) {
			System.out.println("O " + jogador1.getNome() + " venceu!");
		}
		
		if (jogador2.getVida() > jogador1.getVida()) {
			System.out.println("O " + jogador2.getNome() + " venceu!");
		}

		if (jogador1.getVida() == jogador2.getVida()) {
			System.out.println("O luta ficou empatada!");
		}
	}
	
	private void exibirPlacar() {
		System.out.println("-------- Placar da Luta ---------");
		System.out.println(jogador1.getNome() + " => " + jogador1.getVida());
		System.out.println(jogador2.getNome() + " => " + jogador2.getVida());
	}

}
