package aula10;

class ReajustarSalarioEmpregado {
	
	public static Empregado reajustar(Empregado empregado) {
		CalcularReajuste calculador = new CalcularReajuste();
		System.out.println(empregado + "Salário atual");
		
		Double reajuste = calculador.calcular(empregado);
		
		empregado.reajustarSalario(reajuste);
		System.out.println(empregado + "Salário reajustado");
		
		return empregado;
	}

}
