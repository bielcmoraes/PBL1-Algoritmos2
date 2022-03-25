package modelos;


public class Fornecedor {
	
	private String id;
	private String nome;
	private String cnpj;
	private String endereco;
	
	public Fornecedor(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public Fornecedor(String nome, String cnpj, String endereco) {
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
