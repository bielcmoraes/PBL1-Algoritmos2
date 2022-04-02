package controller;

import view.LoginView;

import java.util.ArrayList;
import java.util.Scanner;

import model.Usuario;

public class Login {
	
	//Contrutores
	public Login(ArrayList<Usuario> listaUsuarios) {
		
		//Se a lista estiver vazia adicionamos o usuario "Master" na lista;
		if(listaUsuarios.isEmpty()) {
			Usuario primeiroUsuario = new Usuario();
			listaUsuarios.add(primeiroUsuario);
		}
	}
	
	public static Usuario validaLogin(ArrayList<Usuario> listaUsuarios) {
		
		String[] infoLogin = LoginView.logar();
		
		for(Usuario usuario: listaUsuarios) {
			if(usuario.getLogin() == infoLogin[0] && usuario.getSenha() == infoLogin[1]) {
				
				return usuario;
			}
		}
		return null;
	}
}
