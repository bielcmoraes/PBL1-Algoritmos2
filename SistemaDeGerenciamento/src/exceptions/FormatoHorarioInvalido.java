package exceptions;

public class FormatoHorarioInvalido extends Exception{
	
	public FormatoHorarioInvalido() {
		super();

	}
	
	@Override
	public String toString() {
		return "Formato do horario invalido!";
	}
	
}


