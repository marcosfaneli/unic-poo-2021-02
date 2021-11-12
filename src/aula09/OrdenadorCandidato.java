package aula09;

import java.util.Comparator;

class OrdenadorCandidato implements Comparator<Candidato> {

	@Override
	public int compare(Candidato o1, Candidato o2) {
		if (o1.getVotos() > o2.getVotos()) {
			return -1;
		}
		
		if (o1.getVotos() < o2.getVotos()) {
			return 1;
		}
		
		return 0;
	}

}
