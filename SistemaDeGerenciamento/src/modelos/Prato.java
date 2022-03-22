package modelos;

import java.util.ArrayList;

public class Prato {
	
	private String id;
	private String nome;
	private double preco;
	private ArrayList <Produto> produtos;
	private String categoria;
	
	public Prato(String nome, double preco, ArrayList<Produto> produtos, String categoria) {
		
		this.nome = nome;
		this.preco = preco;
		this.produtos = produtos;
		this.categoria = categoria;
	}
	
	//Getters e Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
