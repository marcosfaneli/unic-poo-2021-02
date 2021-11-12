package aula10;

import java.util.ArrayList;
import java.util.List;

class ReajusteSalarial {

	public static void main(String[] args) {
		
		List<Empregado> empregados = new ArrayList<>();
		
		empregados.add(new Empregado("João",Cargo.DESENVOLVEDOR, 3200.0));
		empregados.add(new Empregado("Pedro",Cargo.ANALISTA, 4000.0));
		empregados.add(new Empregado("Maria",Cargo.GERENTE, 6500.0));
		empregados.add(new Empregado("Isabel",Cargo.GERENTE, 4000.0));
		empregados.add(new Empregado("Matias",Cargo.QUALIDADE, 5000.0));
		
		for(Empregado emp : empregados) {
			ReajustarSalarioEmpregado.reajustar(emp);
		}
		
	}

}
