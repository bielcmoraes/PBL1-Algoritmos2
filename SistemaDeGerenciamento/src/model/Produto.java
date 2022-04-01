package model;

import java.time.LocalDate;

public class Produto extends Entidade {
	
	// Attributes
	private static int ultimoId = 0;
	private String nome;
	private Double preco;
	private LocalDate validade;
	
	// Constructor
	public Produto(String nome, Double preco, LocalDate validade) {
		super(ultimoId++);
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
	}

	// Methods
	public static int getUltimoId() {
		return ultimoId;
	}

	public static void setUlitmo_Id(int ulitmo_Id) {
		Produto.ultimoId = ulitmo_Id;
	}
	
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
