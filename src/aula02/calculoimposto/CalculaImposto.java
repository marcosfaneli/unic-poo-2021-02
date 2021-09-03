package aula02.calculoimposto;

public class CalculaImposto {
	
	double calcular(Produto produto, Imposto imposto) {
		double valorImposto = produto.valor * 
				imposto.percentual / 100;
		
		return valorImposto;
	}
	
	void metodoSemRetorno(String param) {
		System.out.println(param);
	}

}
