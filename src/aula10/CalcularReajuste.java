package aula10;

import aula10.reajuste.Reajuste;

class CalcularReajuste {
	
	public Double calcular(Empregado empregado) {
		
		Reajuste reajuste = empregado.getCargo().getReajuste();
		
		Double valorDoReajuste = reajuste.calcular(empregado.getSalario());
		
		return valorDoReajuste;
	}

}
