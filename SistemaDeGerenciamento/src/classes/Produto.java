package classes;

public class Produto {
	
	private int id;
	private String nome;
	private double preco;
	//private date validade;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	/*
	public Produto(String nome, double preco, date validade) {
		this.nome = nome;
		this.preco = preco;
		this.validade = validade;
	}
*/
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
