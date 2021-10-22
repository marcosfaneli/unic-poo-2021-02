package aula08;

class Paciente {
	
	private String nome;
	private int idade;
	
	public Paciente(String nome, int idade) {
		this.nome = nome.toUpperCase();
		this.idade = idade;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getNome() {
		return this.nome;
	}
}
