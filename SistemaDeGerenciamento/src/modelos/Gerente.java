package modelos;

import gerenciamentos.GerenciaCardapio;

public class Gerente extends Usuario implements GerenciaCardapio{

	@Override
	public void cadastrar() {
		System.out.println("Cadastrando gerente");
		
	}

	@Override
	public void editar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
}