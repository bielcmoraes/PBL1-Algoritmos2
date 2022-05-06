package exceptions;

public class FornecedorNaoCadastrado extends Exception{
	
	public FornecedorNaoCadastrado() {
		super();

	}
	
	@Override
	public String toString() {
		return "Fornecedor nao cadastrado!";
	}
	
}