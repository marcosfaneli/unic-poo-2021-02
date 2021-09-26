package aula05;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Calculadora {
	
	protected final Scanner leitor;
	private final String nome;
	
	public Calculadora(Scanner leitorParam, String nomeParam) {
		this.leitor = leitorParam;
		this.nome = nomeParam;
	}
	
	public void calcular() {
		System.out.println("Calculando a área do " + nome);
		
		try {
			
			int area = this.fazerCalculo();
			System.out.println("Área do " + nome + ": " + area);
			
		} catch (InputMismatchException erro) {
			System.out.println("Ops, ocorreu um erro na calculo"
					+ ". Por favor tente novamente");
		}
	}
	
	protected abstract int fazerCalculo();

}
