package aula06;

public class AnoInvalido extends Exception{
	
	public AnoInvalido() {
		super("Ano informado é inválido");
	}
	
	public final String error = "0001";

}
