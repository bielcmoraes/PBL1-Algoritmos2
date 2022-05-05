package exceptions;

public class ErroGrave extends Exception {
	
	public ErroGrave() {
		super();
	}
	
	@Override
	public String toString() {
		return "Erro./n Reinicie o sistema!!!";
	}
}
