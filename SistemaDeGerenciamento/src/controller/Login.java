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
	public Usuario autenticarLogin(ArrayList<Usuario> listaUsuarios) {
		
		boolean logadoComSucesso = false;
		
		//Tente validar o login
		do{
			String[] infoLogin = LoginView.logar();
			for(Usuario usuario: listaUsuarios) {
				if(usuario.getLogin().equals(infoLogin[0]) && usuario.getSenha().equals(infoLogin[1])) {
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
