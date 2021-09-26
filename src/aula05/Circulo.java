package aula05;

import java.util.Scanner;

class Circulo extends Calculadora {

	public Circulo(Scanner leitorParam) {
		super(leitorParam, "Circulo");
	}

	@Override
	protected int fazerCalculo() {
		System.out.println("Informa a medida do raio: ");
		int raio = leitor.nextInt();
		
		int area = (int) (2 * 3 * Math.pow(raio, 2));
		
		return area;
	}

}
