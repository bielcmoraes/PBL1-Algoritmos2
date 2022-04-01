package controller;

import java.util.ArrayList;

import modelos.*;

public class BancoDeDados {
	
	//Atributos
	private ArrayList<Fornecedor> listaFornecedores = new ArrayList<Fornecedor>();
	private ArrayList<Prato> cardapio;
	private ArrayList<Produto> listaProdutos;
	private ArrayList<Usuario> listaUsuarios;
	private ArrayList<Venda> listaVendas;
	
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
	public void setListaFornecedores(ArrayList<Fornecedor> listaFornecedores) {
		this.listaFornecedores = listaFornecedores;
	}
	public ArrayList<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(ArrayList<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	public ArrayList<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}
	public ArrayList<Venda> getListaVendas() {
		return listaVendas;
	}
	public void setListaVendas(ArrayList<Venda> listaVendas) {
		this.listaVendas = listaVendas;
	}
	public ArrayList<Prato> getCardapio() {
		return cardapio;
	}
	public void setCardapio(ArrayList<Prato> cardapio) {
		this.cardapio = cardapio;
	}
	
	
}
