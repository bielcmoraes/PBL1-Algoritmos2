package view;

import java.util.Scanner;

import controller.UsuarioCopyable;

public class UsuarioView {
	
	public static String[] cadastraUsuario() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um Login para o usuario");
		String login = input.nextLine();
		System.out.println("Digite a senha do Usuario");
		String senha = input.nextLine();
		System.out.println("Digite 1 para cadastrar um Gerente ou 2 para cadastrar um funcionariF");
		String decisao = input.nextLine();
		String[] infoUsuario = new String[3];
		infoUsuario[0] = login;
		infoUsuario[1] = senha;
		infoUsuario[2] = decisao;
		return infoUsuario;
	}
	
	public static String buscaUsuario() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o codigo do Usuario que deseja buscar");
		String codigo = input.nextLine();
		return codigo;
	}
	
	public static String[] editaUsuario() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o novo Login do Usuario");
		String novoLogin = input.nextLine();
		System.out.println("Digite a nova Senha de Usuario");
		String novaSenha = input.nextLine();
		
		String [] infoUsuario = new String [2];
		infoUsuario[0] = novoLogin;
		infoUsuario[1] = novaSenha;
		return infoUsuario;
	}
	
	public static String excluiUsuario() {
		return buscaUsuario();
	}

}
