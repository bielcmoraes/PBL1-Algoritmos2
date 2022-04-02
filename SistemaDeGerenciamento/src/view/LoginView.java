package view;

import java.util.Scanner;

public class LoginView {
	
	public static String[] logar() {
		
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
	
	public static void erroLogin() {
		
		System.out.println("Login ou senha incorretos!!!");
		System.out.println("Tente novamente!!!");
	}
}
