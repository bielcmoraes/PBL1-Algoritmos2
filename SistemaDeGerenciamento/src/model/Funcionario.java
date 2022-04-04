package model;

import java.util.ArrayList;

import controller.ListagemCopyable;
import controller.VendaCopyable;
import view.VendaView;

public class Funcionario extends Usuario implements ListagemCopyable, VendaCopyable{
	
	//Construtores
	public Funcionario() {
		super();
	}
	
	public Funcionario(ArrayList<String> listaIds, String nome, String login, String senha) {
		super(listaIds, nome, login, senha);
	}
	//Metodos de venda
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
	
	//Metodos de listagem
	@Override
	public void mostrarCardapio(ArrayList<Prato> listaFornecedores) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarProduto(ArrayList<Produto> listaFornecedores) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarUsuario(ArrayList<Usuario> listaFornecedores) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarVenda(ArrayList<Venda> listaFornecedores) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
