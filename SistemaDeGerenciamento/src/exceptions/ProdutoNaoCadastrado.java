package exceptions;

public class ProdutoNaoCadastrado extends Exception{
	
	private String produto;
	
	public ProdutoNaoCadastrado(String produto) {
		super();
		this.produto = produto;
	}
	
	@Override
	public String toString() {
		return produto + "não cadastrado";
	}
}