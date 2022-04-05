package model;

import java.util.ArrayList;

import controller.CardapioCopyable;
import controller.FornecedorCopyable;
import controller.GerenciaCardapio;
import controller.GerenciaFornecedor;
import controller.GerenciaProdutos;
import controller.GerenciaUsuario;
import controller.ProdutoCopyable;
import controller.UsuarioCopyable;

public class Gerente extends Usuario implements FornecedorCopyable, UsuarioCopyable, ProdutoCopyable, CardapioCopyable{
	
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
	public boolean cadastrarFornecedor(ArrayList<Fornecedor> listaFornecedores, ArrayList<String> listaIds) {
		
		GerenciaFornecedor gerenciamentoFornecedor = new GerenciaFornecedor();
		return gerenciamentoFornecedor.cadastrarFornecedor(listaFornecedores, listaIds);
	}

	@Override
	public boolean editarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		
		GerenciaFornecedor gerenciamentoFornecedor = new GerenciaFornecedor();
		return gerenciamentoFornecedor.editarFornecedor(listaFornecedores);
	}

	@Override
	public boolean excluirFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		
		GerenciaFornecedor gerenciamentoFornecedor = new GerenciaFornecedor();
		return gerenciamentoFornecedor.excluirFornecedor(listaFornecedores);
	}
	
	//Metodos do gerenciamento de Usuario
	@Override
	public boolean cadastrarUsuario(ArrayList<Usuario> listaUsuarios, ArrayList<String> listaIds) {
		//Istancia o gerenciamento de usuario
		GerenciaUsuario gerenciamentoUsuario = new GerenciaUsuario();
		//Retorna o cadastro de usuari0
		return gerenciamentoUsuario.cadastrarUsuario(listaUsuarios, listaIds);
	}

	@Override
	public boolean editarUsuario(ArrayList<Usuario> listaUsuarios) {
		
		//Istancia o gerenciamento de usuario
		GerenciaUsuario gerenciamentoUsuario = new GerenciaUsuario();
		return gerenciamentoUsuario.editarUsuario(listaUsuarios);
	}

	@Override
	public boolean excluirUsuario(ArrayList<Usuario> listaUsuarios) {
		GerenciaUsuario gerenciamentoUsuario = new GerenciaUsuario();
		return gerenciamentoUsuario.excluirUsuario(listaUsuarios);
	}
	
	//Metodos de gerenciamento de Produto
	@Override
	public boolean cadastrarProduto(ArrayList<Produto> listaProdutos, ArrayList<String> listaIds) {
		GerenciaProdutos gerenciamentoProdutos = new GerenciaProdutos();
		return gerenciamentoProdutos.cadastrarProduto(listaProdutos, listaIds);
	}

	@Override
	public boolean editarProduto(ArrayList<Produto> listaProdutos) {
		GerenciaProdutos gerenciamentoProdutos = new GerenciaProdutos();
		return gerenciamentoProdutos.editarProduto(listaProdutos);
	}

	@Override
	public boolean excluirProduto(ArrayList<Produto> listaProdutos) {
		GerenciaProdutos gerenciamentoProdutos = new GerenciaProdutos();
		return gerenciamentoProdutos.excluirProduto(listaProdutos);
	}
	
	//Metodos de Gerenciamento de Cardapio (Mexe com os Pratos)
	@Override
	public boolean cadastrarPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds,
			ArrayList<Produto> listaProdutos) {
		GerenciaCardapio gerenciamentoCardapio = new GerenciaCardapio();
		return gerenciamentoCardapio.cadastrarPrato(cardapio, listaIds, listaProdutos);
	}

	@Override
	public boolean editarPrato(ArrayList<Prato> cardapio, ArrayList<Produto> listaProdutos) {
		GerenciaCardapio gerenciamentoCardapio = new GerenciaCardapio();
		return gerenciamentoCardapio.editarPrato(cardapio, listaProdutos);
	}

	@Override
	public boolean excluirPrato(ArrayList<Prato> cardapio) {
		GerenciaCardapio gerenciamentoCardapio = new GerenciaCardapio();
		return gerenciamentoCardapio.excluirPrato(cardapio);
	}

}