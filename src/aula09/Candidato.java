package aula09;

class Candidato {
	
	String nome;
	Integer votos;
	
	public Candidato(String nomeParam, Integer votosParam) {
		this.nome = nomeParam;
		this.votos = votosParam;
	}
	
	public Integer getVotos() {
		return this.votos;
	}
	
	@Override
	public String toString() {
		return this.nome + "," + this.votos;
	}

}
