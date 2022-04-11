
package view;

import java.util.Scanner;

public class MenuView {
	
	public static String primeiraTelaGerente() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("================");
		System.out.println("= MENU GERENTE =");
		System.out.println("================");
		System.out.println("Digite 1 para gerenciar os fornecedores");
		System.out.println("Digite 2 para gerenciar as vendas");
		System.out.println("Digite 3 para gerenciar os usuarios");
		System.out.println("Digite 4 para gerenciar o cardapio");
		System.out.println("Digite 5 para gerenciar os produtos");
		System.out.println("Digite 6 para acessar o menu de listagem");
		System.out.println("Digite 7 para deslogar");
		
		String resposta = input.nextLine();
		return resposta;
	}
	
	public static String primeiraTelaFuncionario() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("====================");
		System.out.println("= MENU FUNCIONARIO =");
		System.out.println("====================");
		System.out.println("Digite 1 para gerenciar Vendas");
		System.out.println("Digite 2 para listar");
		System.out.println("Digite 3 para deslogar");
		String resposta = input.nextLine();
		return resposta;
	}
}
