package exceptions;

public class PratoNaoCadastrado extends Exception{
	
	public PratoNaoCadastrado() {
		super();
	}
	
	@Override
	public String toString() {
		return "Prato nao cadastrado!";
	}
}