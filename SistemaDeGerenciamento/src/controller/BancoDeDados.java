package controller;

import java.util.ArrayList;

import model.*;

public class BancoDeDados {
	
	//Atributos
	private ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
	private ArrayList<Prato> cardapio = new ArrayList<Prato>();
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private ArrayList<Venda> listaVendas = new ArrayList<Venda>();
	private ArrayList<String> listaIds = new ArrayList<String>();
	
	//Construtores
	
	/*
	 Devemos instanciar os ArrayList no construtor
	 Podemos inicializar o programa com dados atraves do construtor.
	 Basta Instanciar objetos e adiciona-los a lista por aqui;
	*/
	//Metodos
	public ArrayList<Fornecedor> getListaFornecedores() {
		return listaFornecedores;
	}
	
	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	
	
	public ArrayList<Venda> getListaVendas() {
		return listaVendas;
	}
	
	public ArrayList<Prato> getCardapio() {
		return cardapio;
	}
	
	public ArrayList<String> getListaIds() {
		return listaIds;
	}
	
}
