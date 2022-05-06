package exceptions;

public class FormatoQuantidadeInvalido extends Exception{
	
	public FormatoQuantidadeInvalido() {
		super();

	}
	
	@Override
	public String toString() {
		return "Formato da quantidade invalido!";
	}
	
}


