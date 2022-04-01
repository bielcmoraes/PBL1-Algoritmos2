package modelos;

import java.util.Date;

public class Produto {
	
	private String id;
	private String nome;
	private double preco;
	private Date validade;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, double preco, Date validade) {
		this.nome = nome;
		this.preco = preco;
		this.setValidade(validade);
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
}
