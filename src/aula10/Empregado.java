package aula10;

class Empregado {
	
	private String nome;
	private Cargo cargo;
	private Double salario;
	
	public Empregado(String paramNome, Cargo paramCargo, Double paraSalario) {
		this.nome = paramNome;
		this.cargo = paramCargo;
		this.salario = paraSalario;
	}
	
	public Cargo getCargo() {
		return this.cargo;
	}
	
	public Double getSalario() {
		return this.salario;
	}
	
	public void reajustarSalario(Double valorDoReajuste) {
		this.salario += valorDoReajuste;
	}
	
	@Override
	public String toString() {
		return "Empregado [nome=" + this.nome + ", cargo=" + this.cargo + ", salario=" + this.salario + "]";
	}

}
