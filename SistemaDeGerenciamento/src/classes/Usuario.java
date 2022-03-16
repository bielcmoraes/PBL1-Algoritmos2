package classes;

public class Usuario {
	private int id;
	private String login;
	private String senha;
	private boolean vip;
	
	public Usuario() {
		login = "admin";
		senha = "admin";
		setVip(true);
	}
	
	public Usuario(String login, String senha) {
		this.login = login;
		this.senha = senha;
		setVip(false);
	}
	
	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}
	
	
}
