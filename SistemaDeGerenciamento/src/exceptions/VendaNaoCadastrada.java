package exceptions;

public class VendaNaoCadastrada extends Exception{
	
	public VendaNaoCadastrada() {
		super();

	}
	
	@Override
	public String toString() {
		return "Venda nao cadastrada!";
	}
	
}


