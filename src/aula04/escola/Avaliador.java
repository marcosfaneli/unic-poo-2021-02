package aula04.escola;

class Avaliador {
	
	public final static double MEDIA_ESCOLAR = 7.;
	
	public static void avaliar(Aluno aluno) {
		
		double somaDasNotas = 0;
		for(double nota : aluno.getNotas()) {
			somaDasNotas = somaDasNotas + nota;
		}
		
		double media = somaDasNotas / 4;
		
		if (media >= MEDIA_ESCOLAR) {
			aluno.setSituacao(Situacao.APROVADO);
		}else {
			aluno.setSituacao(Situacao.REPROVADO);
		}
	}

}
