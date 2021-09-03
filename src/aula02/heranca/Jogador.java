package aula02.heranca;

class Jogador {
	
	String nome;
	int nivel;
	int vida;
	
	void correr() {
		System.out.println("O " + this.nome + " esta correndo");
	}
	
	void socar() {
		System.out.println("O " + this.nome + " esta dando um soco");
	}
	
	void chutar() {
		System.out.println("O " + this.nome + " esta dando um chute");
	}
	
	void pular() {
		System.out.println("O " + this.nome + " esta pulando");
	}
	
	private class PoderEspecial {
		void soltarPoder() {
			System.out.println("Soltando poder");
		}
	}

}

