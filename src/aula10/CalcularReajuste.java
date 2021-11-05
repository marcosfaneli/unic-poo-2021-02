package aula10;

class CalcularReajuste {
	
	public Double calcular(Empregado empregado) {
		
		Double valorDoReajuste = empregado.getSalario() * empregado.getCargo().getValorReajuste() / 100;
		
		return valorDoReajuste;
	}

}
