package controller;

import view.LoginView;

import java.util.ArrayList;
import java.util.Scanner;

import model.Usuario;

public class Login {
	
	//Contrutores
	public Login(ArrayList<Usuario> listaUsuarios) {
		
		if(listaUsuarios.isEmpty()) {
			GerenciaUsuario gerenciadorDeUsuario = new GerenciaUsuario();
			gerenciadorDeUsuario.cadastrarUsuario(listaUsuarios);
		}
	}
	
	public static Usuario validaLogin(ArrayList<Usuario> listaUsuarios) {
		
		String[] infoLogin = LoginView.logar();
		
		for(Usuario usuario: listaUsuarios) {
			if(usuario.getLogin() == infoLogin[0] && usuario.getSenha() == infoLogin[1]) {
				if(usuario instanceof Gerente) {
					Gerente gerenteLogado = new Gerente();
					return gerenteLogado;
				}
				else if(usuario instanceof Funcionario){
					Funcionario funcionarioLogado = new Funcionario();
					return funcionarioLogado;
				}
			}
		}
		return null;
	}
}
