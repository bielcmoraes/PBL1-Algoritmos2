
package model;

public class Usuario {
	private String id;
	private String nome;
	private String cargo;
	private String login;
	private String senha;
	
	//Construtores
	
	public Usuario() {
		
		this.nome = "Master";
		this.login = "admin";
		this.senha = "admin";
		this.setCargo("Gerente");
	}
	public Usuario(String nome, String cargo, String login, String senha) {
		this.nome = nome;
		this.setCargo(cargo);
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

	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
