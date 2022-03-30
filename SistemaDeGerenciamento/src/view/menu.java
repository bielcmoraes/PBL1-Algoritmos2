package view;

import java.util.Scanner;

public class menu {
	
	public static String[] telaLogin() {
		
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
	
	public static void primeiraTela() {
		System.out.println("****BEM VINDO****");
		
		
	}
}
