package model;

import java.util.ArrayList;

public class Prato extends Entidade{
	
	private String nome;
	private Double preco;
	private String descricao;
	private String categoria;
	
	public Prato(ArrayList<String> listaIds, String nome, Double preco, String descricao, String categoria) {
		
		super(listaIds);
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.categoria = categoria;
	}
	
	//Getters e Setters
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
	
}
