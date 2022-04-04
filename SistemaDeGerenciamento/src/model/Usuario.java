
package model;

import java.util.ArrayList;

public abstract class Usuario extends Entidade{
	public String nome;
	public String login;
	public String senha;
	
	//Construtores
	
	public Usuario() {
		
		super();
		this.nome = "Master";
		this.login = "admin";
		this.senha = "admin";
	}
	
	
	public Usuario(ArrayList<String> listaIds, String nome, String login, String senha) {
		super(listaIds);
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
