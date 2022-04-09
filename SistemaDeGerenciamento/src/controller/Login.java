package controller;

import view.LoginView;

import java.util.ArrayList;
import java.util.Scanner;

import model.Gerente;
import model.Usuario;

public class Login {
	
	//Contrutores
	public Login(ArrayList<Usuario> listaUsuarios) {
		
		//Se a lista estiver vazia adicionamos o usuario "Master" na lista;
		if(listaUsuarios.isEmpty()) {
			Usuario primeiroUsuario = new Gerente();
			listaUsuarios.add(primeiroUsuario);
		}
	}
	
	//Metodos
	public Usuario autenticarLogin(ArrayList<Usuario> listaUsuarios, String[] infoLogin) {
		
		if(listaUsuarios != null) {
			//Tente validar o login
			for(Usuario usuario: listaUsuarios) {
				if(usuario.getLogin().equals(infoLogin[0]) && usuario.getSenha().equals(infoLogin[1])) {
					return usuario;
				}
				else {
					//Mensagem de erro de login
					LoginView.erroLogin();
				}
			}
		}
		else {
			System.out.println("Erro no Array");
			System.out.println("Reinicie o sistema");
			return null;
		}
		return null;
	}	
}
