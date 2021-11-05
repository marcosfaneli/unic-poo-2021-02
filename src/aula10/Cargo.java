package aula10;

enum Cargo {
	
	DESENVOLVEDOR{
		public Double getValorReajuste() {
			return 10.0;
		}
	}
	,ANALISTA{
		public Double getValorReajuste() {
			return 9.0;
		}
	},GERENTE{
		public Double getValorReajuste() {
			return 8.0;
		}
	},QUALIDADE{
		public Double getValorReajuste() {
			return 9.5;
		}
	}, SUPORTE {
		public Double getValorReajuste() {
			return 8.5;
		}
	};
	
	public abstract Double getValorReajuste();

}
