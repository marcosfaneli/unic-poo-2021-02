package aula03;

class Jogador {
	
	private String nome;
	private int nivel;
	private double vida;
	
	Jogador(String nomeParam, int nivelParam, double vidaParam) {
		this.nome = nomeParam;
		this.nivel = nivelParam;
		this.vida = vidaParam;
	}
	
	Jogador(String nomeParam){
		this.nome = nomeParam;
		this.nivel = 10;
		this.vida = 1000;
	}
	
	void correr() {
		System.out.println("O " + this.nome + " esta correndo");
	}
	
	double socar() {
		double potenciaDoSoco = this.nivel * 30 / 100;
		System.out.println("O " + this.nome + " esta dando um soco de " + potenciaDoSoco);
		
		return potenciaDoSoco;
	}
	
	double chutar() {
		double potenciaDoChute = this.nivel * 50 / 100;
		System.out.println("O " + this.nome + " esta dando um chute de " + potenciaDoChute);
		
		return potenciaDoChute;
	}
	
	void pular() {
		System.out.println("O " + this.nome + " esta pulando");
	}
	
	void exibirVidaDoJogador() {
		System.out.println(this.nome + " tem " + this.vida + " de vida");
	}
	
	void reduzirVida(double golpe) {
		this.vida = this.vida - golpe;
	}
	
	double getVida() {
		return this.vida;
	}
	
	String getNome() {
		return this.nome;
	}
	
	private class PoderEspecial {
		void soltarPoder() {
			System.out.println("Soltando poder");
		}
	}

}

