package aula10.reajuste;

public class ReajusteSalarialQualidade implements Reajuste{

	@Override
	public Double calcular(Double salario) {
		if (salario > 4000. ) {
			return 0.0;
		}

		Double valorDoReajuste = salario * 11.5 / 100;
		
		return valorDoReajuste;
		
	}
	
}
