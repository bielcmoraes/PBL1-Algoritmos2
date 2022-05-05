package exceptions;

public class UsuarioNaoEncontrado extends Exception{
	
	public UsuarioNaoEncontrado() {
		super();
	}
	
	@Override
	public String toString() {
		return "Usuário não encontrado";
	}
}
