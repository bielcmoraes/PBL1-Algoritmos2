package exceptions;

public class NaoEncontrado extends Exception{
	
	private String objeto;
	public NaoEncontrado(String objeto) {
		super();
		this.objeto = objeto;
	}
	
	@Override
	public String toString() {
		return objeto + " não encontrado";
	}
}
