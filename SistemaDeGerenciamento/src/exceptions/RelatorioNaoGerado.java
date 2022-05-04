package exceptions;

public class RelatorioNaoGerado extends Exception{
	
private String relatorio;
	
	public RelatorioNaoGerado(String relatorio) {
		super();
		this.relatorio = relatorio;
	}
	
	@Override
	public String toString() {
		return relatorio + "não gerado!";
	}
}