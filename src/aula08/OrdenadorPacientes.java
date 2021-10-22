package aula08;

import java.util.Comparator;

class OrdenadorPacientes implements Comparator<Paciente> {

	@Override
	public int compare(Paciente paciente1, Paciente paciente2) {
		if (paciente1.getIdade() < paciente2.getIdade()) {
			return 1;
		}
		
		if (paciente1.getIdade() > paciente2.getIdade()) {
			return -1;
		}
		
		return 0;
	}

}
