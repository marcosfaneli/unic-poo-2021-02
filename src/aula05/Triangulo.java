package aula05;

import java.util.Scanner;

class Triangulo extends Calculadora {

	public Triangulo(Scanner leitorParam) {
		super(leitorParam, "Triangulo Retangulo");
	}

	@Override
	protected int fazerCalculo() {
		System.out.println("Informa a base do triangulo retangulo: ");
		int base = leitor.nextInt();
		
		System.out.println("Informa a altura do triangulo retangulo: ");
		int altura = leitor.nextInt();
		
		int area = (base * altura) / 2;
		
		return area;
	}

}
