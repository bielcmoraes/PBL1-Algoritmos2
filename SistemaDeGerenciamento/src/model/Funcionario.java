package model;

import java.util.ArrayList;

import controller.GerenciaVendas;
import controller.ListagemCopyable;
import controller.VendaCopyable;

public class Funcionario extends Usuario implements VendaCopyable{
	
	//Construtores
	public Funcionario(ArrayList<String> listaIds, String nome, String login, String senha) {
		super(listaIds, nome, login, senha);
	}
	
	//Metodos do gerenciamento de vendas
	//Gerenciamento de Vendas
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

}
