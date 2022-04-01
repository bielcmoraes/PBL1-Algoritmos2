
package modelos;

public abstract class Usuario {
	private String id;
	private String nome;
	private String login;
	private String senha;
	
	//Construtores
	
	public Usuario() {
		
		this.nome = "Master";
		this.login = "admin";
		this.senha = "admin";
	}
	public Usuario(String nome, String login, String senha) {
		this.setNome(nome);
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
