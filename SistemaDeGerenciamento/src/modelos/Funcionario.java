package modelos;

import java.util.ArrayList;

import interfaces.ListagemCopyable;
import interfaces.VendaCopyable;

public class Funcionario extends Usuario implements ListagemCopyable, VendaCopyable{
	
	//Atributos
	
	
	//Construtores
	public Funcionario() {
		super();
	}
	
	public Funcionario(String login, String senha) {
		super(login, senha);
	}
	
	//Metodos
	@Override
	public void cadastrarVenda(ArrayList<Venda> vendas) {
		VendaView novaVenda = new VendaView();
		vendaView.salvar();
		
	}

	@Override
	public void editarVenda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirVenda() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarCardapio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarFornecedor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarPrato() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarProduto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarUsuario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarVenda() {
		// TODO Auto-generated method stub
		
	}
	
	
}
