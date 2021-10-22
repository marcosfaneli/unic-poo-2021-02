package aula08;

import java.util.List;

class Relatorio {
	
	private List<Paciente> pacientes;
	
	public Relatorio(List<Paciente> lista) {
		this.pacientes = lista;
	}
	
	public void imprimir() {
		System.out.println("Total de "
				+ "pacientes cadastrado: " + this.pacientes.size());
		
		OrdenadorPacientes ordenador = new OrdenadorPacientes();
		this.pacientes.sort(ordenador);
		
		for (Paciente paciente : this.pacientes) {
			System.out.println(paciente.getNome());
		}
	}

}
