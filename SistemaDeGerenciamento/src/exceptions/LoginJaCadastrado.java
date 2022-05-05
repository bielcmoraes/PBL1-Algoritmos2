package exceptions;

public class LoginJaCadastrado extends Exception{
	
	public LoginJaCadastrado() {
		super();
	}
	
	@Override
	public String toString() {
		return "Esse login já existe.\n Tente novamente!";
	}
}
