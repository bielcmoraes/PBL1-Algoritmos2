package model;

import java.util.ArrayList;

public class Prato extends Entidade{
	
	private String nome;
	private double preco;
	private ArrayList <Produto> produtos;
	private String categoria;
	
	public Prato(ArrayList<String> listaIds, String nome, double preco, ArrayList<Produto> produtos, String categoria) {
		
		super(listaIds);
		this.nome = nome;
		this.preco = preco;
		this.produtos = produtos;
		this.categoria = categoria;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
