package exceptions;

public class QuantidadeProdutosInsuficiente extends Exception{
	
	public QuantidadeProdutosInsuficiente() {
		super();

	}
	
	@Override
	public String toString() {
		return "Quantidade de produtos insuficiente!";
	}
	
}


