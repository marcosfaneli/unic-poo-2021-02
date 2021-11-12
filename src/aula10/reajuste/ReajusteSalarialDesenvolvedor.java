package aula10.reajuste;

public class ReajusteSalarialDesenvolvedor implements Reajuste {

	@Override
	public Double calcular(Double salario) {

		if (salario > 4800.) {
			return 0.0;
		}

		Double valorDoReajuste = salario * 10 / 100;
		
		return valorDoReajuste;
	}

}
