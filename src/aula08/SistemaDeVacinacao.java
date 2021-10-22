package aula08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SistemaDeVacinacao {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Bem vindo ao sistema de vacinação");
		
		String parar = "";
		
		CadastroDePaciente cadastro = new CadastroDePaciente(leitor);
		
		List<Paciente> pacientes = new ArrayList<>();
		
		while(!parar.equalsIgnoreCase("q")) {
			Paciente paciente = cadastro.cadastrar();
			
			if (paciente != null) {
				pacientes.add(paciente);
			}
			
			System.out.println("Pressione enter para continuar "
					+ "ou q para sair");
			parar = leitor.next();
		}
		
		Relatorio relatorio = new Relatorio(pacientes);
		relatorio.imprimir();

	}

}
