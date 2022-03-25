package controller;

import java.util.ArrayList;

import modelos.*;

public class BancoDeDados {
	
	//Atributos
	private ArrayList<Cardapio> listaCardapios;
	private ArrayList<Fornecedor> listaFornecedores;
	private ArrayList<Prato> listaPratos;
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
	public ArrayList<Cardapio> getListaCardapios() {
		return listaCardapios;
	}
	public void setListaCardapios(ArrayList<Cardapio> listaCardapios) {
		this.listaCardapios = listaCardapios;
	}
	public ArrayList<Fornecedor> getListaFornecedores() {
		return listaFornecedores;
	}
	public void setListaFornecedores(ArrayList<Fornecedor> listaFornecedores) {
		this.listaFornecedores = listaFornecedores;
	}
	public ArrayList<Prato> getListaPratos() {
		return listaPratos;
	}
	public void setListaPratos(ArrayList<Prato> listaPratos) {
		this.listaPratos = listaPratos;
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
	
	
}
