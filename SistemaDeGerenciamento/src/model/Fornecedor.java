package model;

import java.util.ArrayList;

public class Fornecedor extends Entidade{
	
	private String nome;
	private String cnpj;
	private String endereco;
	
	public Fornecedor(ArrayList<String> listaIds, String nome, String cnpj, String endereco) {
		super(listaIds);
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

}
