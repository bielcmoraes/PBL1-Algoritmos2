package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Produto extends Entidade {
	
	// Attributes
	private String nome;
	private Double preco;
	private LocalDate validade;
	
	// Constructor
	public Produto(ArrayList<String> listaIds, String nome, Double preco, LocalDate validade) {
		super(listaIds);
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
	}

	// Methods	
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

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
}
