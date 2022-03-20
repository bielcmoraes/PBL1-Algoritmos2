package modelos;

public class Fornecedor {
	
	//testando git
	private int id;
	private String nome;
	private int cnpj;
	private String endereco;
	
	public Fornecedor(String nome, int cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public Fornecedor(String nome, int cnpj, String endereco) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	//Setters e Getters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
