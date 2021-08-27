package aula02;

public class Exemplo01 {

	public static void main(String[] args) {
		MultiplicarPorDois multiplicador = new MultiplicarPorDois();
		
		int valor = 5;
		
		multiplicador.calcular(valor);
		
	}
}

class MultiplicarPorDois{
	
	int multiplicador = 2;
	
	void calcular(int numero) {
		
		int resultado = numero * multiplicador;
		System.out.println("O resultado da multiplicação é " + resultado);
				
	}
}