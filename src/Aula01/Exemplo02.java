package Aula01;

public class Exemplo02 {
	
	public static void main(String[] args) {
		Carro uno = new Carro();
		uno.ligar();
		uno.andar();
		uno.virarADireita();
		uno.voar();
		uno.parar();
		uno.desligar();
	}

}

class Carro {
	void ligar() {
		System.out.println("O carro ligou devagar");
	}
	
	void andar() {
		System.out.println("O carro esta andando");
	}
	
	void virarADireita() {
		System.out.println("O carro virou a direita");
	}
	
	void voar() {
		System.out.println("O carro esta voando");
	}
	
	void virarAEsquerda() {
		System.out.println("O carro virou a esquerda");
	}
	
	void parar() {
		System.out.println("O carro parou");
	}
	
	void desligar() {
		System.out.println("O carro foi desligado");
	}
}
