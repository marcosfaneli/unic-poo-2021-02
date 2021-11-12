package aula10.reajuste;

public class ReajusteSalarialGerente implements Reajuste {

	@Override
	public Double calcular(Double salario) {
		if (salario > 5000.) {
			return 0.0;
		}
		
		Double valorDoReajuste = salario * 10 / 100;
		
		return valorDoReajuste;
	}

}
