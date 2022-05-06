package exceptions;

public class ProdutoNaoCadastrado extends Exception{
	
	public ProdutoNaoCadastrado() {
		super();
	}
	
	@Override
	public String toString() {
		return "Produto nao cadastrado!";
	}
}