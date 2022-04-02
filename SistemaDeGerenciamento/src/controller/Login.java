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
	
	public static Usuario autenticarLogin(ArrayList<Usuario> listaUsuarios) {
		
		boolean logadoComSucesso = false;
		
		//Tente validar o login
		do{
			String[] infoLogin = LoginView.logar();
			for(Usuario usuario: listaUsuarios) {
				if(usuario.getLogin() == infoLogin[0] && usuario.getSenha() == infoLogin[1]) {
					System.out.println("Passou");
					logadoComSucesso = true;
					return usuario;
				}
			}
			
			//Mensagem de erro de login
			LoginView.erroLogin();
		} while(logadoComSucesso == false); //Repita enquanto não conseguir logar;
		
		return null;
	}
		
}
