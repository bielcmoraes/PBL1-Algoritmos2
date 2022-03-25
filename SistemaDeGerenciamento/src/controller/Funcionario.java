package controller;

import java.util.ArrayList;

import modelos.Prato;
import modelos.Usuario;
import modelos.Venda;
import view.VendaView;

public class Funcionario extends Usuario implements ListagemCopyable, VendaCopyable{
	
	//Atributos
	private ArrayList<Prato> listaDePratos;
	
	//Construtores
	public Funcionario() {
		super();
	}
	
	public Funcionario(String login, String senha) {
		super(login, senha);
	}
	
	//Metodos
	@Override
	public void cadastrarVenda(ArrayList<Venda> listaVendas) {
		
		VendaView venda = new VendaView();
		Venda novaVenda = venda.cadastrarVenda(listaDePratos);
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
