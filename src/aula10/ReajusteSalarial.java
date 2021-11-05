package aula10;

class ReajusteSalarial {

	public static void main(String[] args) {
		CalcularReajuste calculador = new CalcularReajuste();
		
		Empregado joao = new Empregado("João",Cargo.DESENVOLVEDOR, 1000.0);
		System.out.println(joao);
		
		Double reajuste = calculador.calcular(joao);
		
		joao.reajustarSalario(reajuste);
		System.out.println(joao);
		
		Empregado pedro = new Empregado("Pedro",Cargo.ANALISTA, 1000.0);
		System.out.println(pedro);
		
		reajuste = calculador.calcular(pedro);
		
		pedro.reajustarSalario(reajuste);
		System.out.println(pedro);
		
		Empregado maria = new Empregado("Maria",Cargo.GERENTE, 1000.0);
		System.out.println(maria);
		
		reajuste = calculador.calcular(maria);
		
		maria.reajustarSalario(reajuste);
		System.out.println(maria);
		
		Empregado matias = new Empregado("Matias",Cargo.QUALIDADE, 1000.0);
		System.out.println(matias);
		
		reajuste = calculador.calcular(matias);
		
		matias.reajustarSalario(reajuste);
		System.out.println(matias);
		
	}

}
