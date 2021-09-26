package aula05;

import java.util.Scanner;

class Retangulo extends Calculadora {
	
	public Retangulo(Scanner leitorParam) {
		super(leitorParam, "Retangulo");
	}

	@Override
	protected int fazerCalculo() {
		System.out.println("Informa a base do retangulo: ");
		int base = leitor.nextInt();
		
		System.out.println("Informa a altura do retangulo: ");
		int altura = leitor.nextInt();
		
		int area = base * altura;
		
		return area;
	}
	
}
