package model;

import java.util.ArrayList;

public class Prato extends Entidade{
	
	// Attributes
	private String nome;
	private Double preco;
	private String descricao;
	private String categoria;
	private ArrayList<Produto> produtos;
	
	// Constructor
	public Prato(ArrayList<String> listaIds, String nome, Double preco, String descricao, String categoria, ArrayList<Produto> produtos) {
		
		super(listaIds);
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.categoria = categoria;
		this.produtos = produtos;
	}
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
