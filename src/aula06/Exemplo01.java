package aula06;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = leitor.nextLine();
		
		try {
			
			System.out.println("Digite o ano do seu nascimento: ");
			int ano = leitor.nextInt();
			
			System.out.println("Digite o mês do seu nascimento");
			int mes = leitor.nextInt();
			
			System.out.println("Digite o dia do seu nascimento");
			int dia = leitor.nextInt();
			
			String diaDaSemana = obterDiaDaSemana(ano, mes, dia);
			
			System.out.println(nome + " você nasceu em uma " + diaDaSemana);
			
		} catch (InputMismatchException erro) {
			System.out.println("Você deve informar os dados com numerais");
		} catch (AnoInvalido erro) {
			System.out.println(erro.getMessage());
		} finally {
			System.out.println("Programa finalizando");
		}
		System.out.println("O programa terminou");
	}
	
	public static String obterDiaDaSemana(int ano, int mes, int dia) throws AnoInvalido {

		if (ano == 0) {
			throw new AnoInvalido();
		}
		
		Calendar aniversario = Calendar.getInstance();
		aniversario.set(ano, mes - 1, dia);
		
		int diaDaSemana = aniversario.get(Calendar.DAY_OF_WEEK);
		
		String nomeDiaDaSemana = "";
		
		switch (diaDaSemana) {
		case 1:
			nomeDiaDaSemana = "Domingo";
			break;
		case 2:
			nomeDiaDaSemana = "Segunda-feira";
			break;
		case 3:
			nomeDiaDaSemana = "Terça-feira";
			break;
		case 4:
			nomeDiaDaSemana = "Quarta-feira";
			break;
		case 5:
			nomeDiaDaSemana = "Quinta-feira";
			break;
		case 6:
			nomeDiaDaSemana = "Sexta-feira";
			break;
		case 7:
			nomeDiaDaSemana = "Sábado";
			break;
		default:
			nomeDiaDaSemana = "Dia da semana não encontrado";
			break;
		}
		
		return nomeDiaDaSemana;
	}

}
