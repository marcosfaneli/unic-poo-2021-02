package aula04.escola;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double[] notas = new double[4];
	private Situacao situacao = Situacao.CURSANDO;
	
	//Métodos Get e Set
	public void setNome(String valor) {
		this.nome = valor;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setMatricula(String matriculaDigitada) {
		this.matricula = matriculaDigitada;
	}
	
	public void definirNotaDoBimestre(
			int bimestre, 
			double nota) throws Exception {
		
		if (bimestre > 4 || bimestre < 1) {
			throw new Exception("Bimestre informado não existe");
		}
		this.notas[bimestre - 1] = nota;
	}
	
	public double[] getNotas() {
		return this.notas;
	}
	
	public void setSituacao(Situacao valor) {
		this.situacao = valor;
	}
	
	//Polimorfismo
	@Override
	public String toString() {
		return "Nome: "+this.nome + 
				", Matricula: " + this.matricula +
				", Situação: " + this.situacao;
	}
}
