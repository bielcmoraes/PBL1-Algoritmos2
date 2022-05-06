package exceptions;

public class FormatoIngredientesInvalido extends Exception{
	
	public FormatoIngredientesInvalido() {
		super();

	}
	
	@Override
	public String toString() {
		return "Formato dos ingredientes invalido!";
	}
	
}


