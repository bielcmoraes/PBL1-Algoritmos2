package exceptions;

public class EscolhaIncorreta extends Exception {
		
	public EscolhaIncorreta() {
		super();
	}
	
	@Override
	public String toString() {
		return "Opção incorreta. \nEscolha uma opção válida!";
	}
}
