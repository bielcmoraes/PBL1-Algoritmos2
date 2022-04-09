package model;

import java.util.ArrayList;

import controller.GerenciaVendas;
import controller.ListagemCopyable;
import controller.VendaCopyable;
import view.ListagemView;

public class Funcionario extends Usuario implements VendaCopyable, ListagemCopyable{
	
	//Construtores
	public Funcionario(ArrayList<String> listaIds, String nome, String login, String senha) {
		super(listaIds, nome, login, senha);
	}
	
	//Metodos do gerenciamento de vendas
		@Override
		public boolean cadastrarVenda(ArrayList<Venda> listaVendas, ArrayList<String> listaIds, ArrayList<Prato> cardapio,
				String[] info) {
			GerenciaVendas gerenciamentoVendas = new GerenciaVendas();
			return gerenciamentoVendas.cadastrarVenda(listaVendas, listaIds, cardapio, info);
		}

		@Override
		public boolean editarVenda(ArrayList<Venda> listaVendas, ArrayList<Prato> cardapio, String codigoVenda,
				String[] info) {
			GerenciaVendas gerenciamentoVendas = new GerenciaVendas();
			return gerenciamentoVendas.editarVenda(listaVendas, cardapio, codigoVenda, info);
		}

		@Override
		public boolean excluirVenda(ArrayList<Venda> listaVendas, ArrayList<String> listaIds, String codigoVenda) {
			GerenciaVendas gerenciamentoVendas = new GerenciaVendas();
			return gerenciamentoVendas.excluirVenda(listaVendas, listaIds, codigoVenda);
		}
		
		@Override
		public void mostrarCardapio(ArrayList<Prato> cardapio) {
			ListagemView listagemView = new ListagemView();
			listagemView.mostrarCardapio(cardapio);
		}

		@Override
		public void listarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
			ListagemView listagemView = new ListagemView();
			listagemView.listarFornecedor(listaFornecedores);
		}

		@Override
		public void listarProduto(ArrayList<Produto> listaProdutos) {
			ListagemView listagemView = new ListagemView();
			listagemView.listarProduto(listaProdutos);	
		}

		@Override
		public void listarUsuario(ArrayList<Usuario> listaUsuarios) {
			ListagemView listagemView = new ListagemView();
			listagemView.listarUsuario(listaUsuarios);
		}

		@Override
		public void listarVenda(ArrayList<Venda> listaVendas) {
			ListagemView listagemView = new ListagemView();
			listagemView.listarVenda(listaVendas);
		}
		
}
