package aula08;

import java.util.InputMismatchException;
import java.util.Scanner;

class CadastroDePaciente {
	
	private Scanner leitor;
	
	public CadastroDePaciente(Scanner leitor) {
		this.leitor = leitor;
	}
	
	public Paciente cadastrar() {
		try {
			System.out.println("Informe o nome: ");
			String nome = this.leitor.next();
			
			System.out.println("Informe a idade: ");
			int idade = this.leitor.nextInt();
			
			Paciente p = new Paciente(nome, idade);
			
			return p;
		} catch (InputMismatchException erro) {
			System.out.println("Idade deve ser informado como numeral");
		}
		return null;
	}

}
