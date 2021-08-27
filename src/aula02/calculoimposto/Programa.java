package aula02.calculoimposto;

public class Programa {
	
	public static void main(String[] args) {
		
		Produto gasolina = new Produto();
		gasolina.descricao = "Gasolina Aditivada";
		gasolina.valor = 15.0;
		
		Imposto icms = new Imposto();
		icms.nome = "ICMS";
		icms.percentual = 35.0;
		
		CalculaImposto calculadora = new CalculaImposto();
		double valor = calculadora.calcular(gasolina, icms);
		
		System.out.println("O valor do " + icms.nome +
				" sobre " + gasolina.descricao+
				" é de " + valor);
	}

}
