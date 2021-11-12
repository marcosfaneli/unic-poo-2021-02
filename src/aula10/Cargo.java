package aula10;

import aula10.reajuste.Reajuste;
import aula10.reajuste.ReajusteSalarialAnalista;
import aula10.reajuste.ReajusteSalarialDesenvolvedor;
import aula10.reajuste.ReajusteSalarialGerente;
import aula10.reajuste.ReajusteSalarialQualidade;

enum Cargo {
	
	DESENVOLVEDOR {
		@Override
		public Reajuste getReajuste() {
			return new ReajusteSalarialDesenvolvedor();
		}
	},ANALISTA {
		@Override
		public Reajuste getReajuste() {
			return new ReajusteSalarialAnalista();
		}
	},GERENTE {
		@Override
		public Reajuste getReajuste() {
			return new ReajusteSalarialGerente();
		}
	},QUALIDADE {
		@Override
		public Reajuste getReajuste() {
			return new ReajusteSalarialQualidade();
		}
	};
	
	public abstract Reajuste getReajuste();

}
