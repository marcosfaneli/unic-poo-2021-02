package aula10.reajuste;


public class ReajusteSalarialAnalista implements Reajuste {

	@Override
	public Double calcular(Double salario) {

		if (salario > 3500.) {
			return 0.0;
		}
		
		Double valorDoReajuste = salario * 9 / 100;
		
		return valorDoReajuste;
	}

}
