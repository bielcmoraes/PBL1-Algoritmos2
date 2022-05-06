package exceptions;

public class PrecoInvalido extends Exception{
	
	public PrecoInvalido() {
		super();

	}
	
	@Override
	public String toString() {
		return "Preco invalido!";
	}
	
}


