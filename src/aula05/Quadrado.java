package aula05;

import java.util.Scanner;

class Quadrado extends Calculadora {
	
	public Quadrado(Scanner leitorParam) {
		super(leitorParam, "Quadrado");
	}

	@Override
	protected int fazerCalculo() {
		System.out.println("Informa a medida do lado do quadrado: ");
		int lado = leitor.nextInt();
		
		int area = (int) Math.pow(lado, 2);
		
		return area;
	}
	
}
