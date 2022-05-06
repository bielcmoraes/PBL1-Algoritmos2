package exceptions;

public class QuantidadeInvalida extends Exception{
	
	public QuantidadeInvalida() {
		super();

	}
	
	@Override
	public String toString() {
		return "Quantidade invalida!";
	}
	
}


