package model;

import java.util.ArrayList;

import controller.CardapioCopyable;
import controller.FornecedorCopyable;
import controller.GerenciaCardapio;
import controller.GerenciaFornecedor;
import controller.GerenciaProdutos;
import controller.GerenciaUsuario;
import controller.GerenciaVendas;
import controller.ProdutoCopyable;
import controller.UsuarioCopyable;
import controller.VendaCopyable;

public class Gerente extends Usuario implements FornecedorCopyable, UsuarioCopyable, ProdutoCopyable, CardapioCopyable, VendaCopyable{
	
	//Atributos
	
	//Construtores
	public Gerente() {
		super();
	}
	
	public Gerente(ArrayList<String> listaIds, String nome, String login, String senha) {
		super(listaIds, nome, login, senha);
	}
	
	//Metodos do gerenciamento de fornecedores
	@Override
	public boolean cadastrarFornecedor(ArrayList<Fornecedor> listaFornecedores, ArrayList<String> listaIds, String[] info) {
		
		GerenciaFornecedor gerenciamentoFornecedor = new GerenciaFornecedor();
		return gerenciamentoFornecedor.cadastrarFornecedor(listaFornecedores, listaIds, info);
	}

	@Override
	public boolean editarFornecedor(ArrayList<Fornecedor> listaFornecedores, String codigoFornecedor, String [] info) {
		
		GerenciaFornecedor gerenciamentoFornecedor = new GerenciaFornecedor();
		return gerenciamentoFornecedor.editarFornecedor(listaFornecedores, codigoFornecedor, info);
	}

	@Override
	public boolean excluirFornecedor(ArrayList<Fornecedor> listaFornecedores,ArrayList<String> listaIds, String codigoFornecedor) {
		
		GerenciaFornecedor gerenciamentoFornecedor = new GerenciaFornecedor();
		return gerenciamentoFornecedor.excluirFornecedor(listaFornecedores, listaIds, codigoFornecedor);
	}
	
	//Metodos do gerenciamento de Usuario
	@Override
	public boolean cadastrarUsuario(ArrayList<Usuario> listaUsuarios, ArrayList<String> listaIds, String [] info) {
		//Istancia o gerenciamento de usuario
		GerenciaUsuario gerenciamentoUsuario = new GerenciaUsuario();
		//Retorna o cadastro de usuari0
		return gerenciamentoUsuario.cadastrarUsuario(listaUsuarios, listaIds, info);
	}

	@Override
	public boolean editarUsuario(ArrayList<Usuario> listaUsuarios, String codigoUsuario, String [] info) {
		
		//Istancia o gerenciamento de usuario
		GerenciaUsuario gerenciamentoUsuario = new GerenciaUsuario();
		return gerenciamentoUsuario.editarUsuario(listaUsuarios, codigoUsuario, info);
	}

	@Override
	public boolean excluirUsuario(ArrayList<Usuario> listaUsuarios, ArrayList<String> listaIds, String codigoUsuario) {
		GerenciaUsuario gerenciamentoUsuario = new GerenciaUsuario();
		return gerenciamentoUsuario.excluirUsuario(listaUsuarios, listaIds, codigoUsuario);
	}
	
	//Metodos de gerenciamento de Produto
	@Override
	public boolean cadastrarProduto(ArrayList<Produto> listaProdutos, ArrayList<String> listaIds, String [] info) {
		GerenciaProdutos gerenciamentoProdutos = new GerenciaProdutos();
		return gerenciamentoProdutos.cadastrarProduto(listaProdutos, listaIds, info);
	}

	@Override
	public boolean editarProduto(ArrayList<Produto> listaProdutos,  String codigoProduto, String [] info) {
		GerenciaProdutos gerenciamentoProdutos = new GerenciaProdutos();
		return gerenciamentoProdutos.editarProduto(listaProdutos, codigoProduto, info);
	}

	@Override
	public boolean excluirProduto(ArrayList<Produto> listaProdutos, ArrayList<String> listaIds, String codigoProduto) {
		GerenciaProdutos gerenciamentoProdutos = new GerenciaProdutos();
		return gerenciamentoProdutos.excluirProduto(listaProdutos, listaIds, codigoProduto);
	}
	
	//Metodos de Gerenciamento de Cardapio (Mexe com os Pratos)
	@Override
	public boolean cadastrarPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds,
			ArrayList<Produto> listaProdutos, String [] info) {
		GerenciaCardapio gerenciamentoCardapio = new GerenciaCardapio();
		return gerenciamentoCardapio.cadastrarPrato(cardapio, listaIds, listaProdutos, info);
	}

	@Override
	public boolean editarPrato(ArrayList<Prato> cardapio, ArrayList<Produto> listaProdutos, String codigoPrato, String [] info) {
		GerenciaCardapio gerenciamentoCardapio = new GerenciaCardapio();
		return gerenciamentoCardapio.editarPrato(cardapio, listaProdutos, codigoPrato, info);
	}

	@Override
	public boolean excluirPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds, String codigoPrato) {
		GerenciaCardapio gerenciamentoCardapio = new GerenciaCardapio();
		return gerenciamentoCardapio.excluirPrato(cardapio, listaIds, codigoPrato);
	}
	
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