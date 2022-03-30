package controller;

import modelos.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
	
	private static String[] telaLogin() {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Login");
			String login = input.nextLine();
			System.out.println("Senha");
			String senha = input.nextLine();
			
			String validacao[] = new String[2];
			validacao[0] = login;
			validacao[1] = senha;
			return validacao;
		}
	
	public static boolean validaLogin(ArrayList<Usuario> listaUsuarios) {
		
		String[] infoLogin = Login.telaLogin();
		
		for(Usuario usuario: listaUsuarios) {
			if(usuario.getLogin() == infoLogin[0] && usuario.getSenha() == infoLogin[1]) {
				return true;
			}
		}
		return false;
	}
}
