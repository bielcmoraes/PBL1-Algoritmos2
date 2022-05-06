package exceptions;

public class FormatoDataInvalido extends Exception{
	
	public FormatoDataInvalido() {
		super();

	}
	
	@Override
	public String toString() {
		return "Formato da data invalido!";
	}
	
}