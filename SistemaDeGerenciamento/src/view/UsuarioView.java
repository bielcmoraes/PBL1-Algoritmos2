package view;

import java.util.Scanner;

import controller.UsuarioCopyable;

public class UsuarioView {
	
	public static String[] cadastraUsuario() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do usuario");
		String nome = input.nextLine();
		System.out.println("Digite 1 para cadastrar um Gerente e 2 para cadastrar um Funcionario");
		String cargo = input.nextLine();
		System.out.println("Digite um Login para o usuario");
		String login = input.nextLine();
		System.out.println("Digite a senha do Usuario");
		String senha = input.nextLine();

		String[] infoUsuario = new String[4];
		infoUsuario[0] = nome;
		infoUsuario[1] = cargo;
		infoUsuario[2] = login;
		infoUsuario[3] = senha;
		return infoUsuario;
	}
	
	public static String buscaUsuario() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o codigo do Usuario que deseja buscar");
		String codigo = input.nextLine();
		return codigo;
	}
	
	public static String[] editaUsuario() {
		
		//Edita nome e senha (Não é possivel modificar o login)
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o novo Nome do Usuario");
		String novoNome = input.nextLine();
		System.out.println("Digite a nova Senha de Usuario");
		String novaSenha = input.nextLine();
		
		String [] infoUsuario = new String [2];
		infoUsuario[0] = novoNome;
		infoUsuario[1] = novaSenha;
		return infoUsuario;
	}
	
	public static String excluiUsuario() {
		return buscaUsuario();
	}

}
