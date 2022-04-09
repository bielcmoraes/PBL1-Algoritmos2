package view;

import java.util.Scanner;

public class SubMenuView {
	
	public static int telaMenuGerenciamentos() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("=========================");
		System.out.println("= MENU DE GERENCIAMENTO =");
		System.out.println("=========================");
		System.out.println("Digite 1 para cadastrar");
		System.out.println("Digite 2 para editar");
		System.out.println("Digite 3 para excluir");
		System.out.println("Digite 4 para sair");
		int resposta = input.nextInt();
		return resposta;
	}
	
	public static int telaMenuListagem() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("====================");
		System.out.println("= MENU DE LISTAGEM =");
		System.out.println("====================");
		System.out.println("Digite 1 para mostrar o cardapio");
		System.out.println("Digite 2 para listar produtos");
		System.out.println("Digite 3 para listar vendas");
		System.out.println("Digite 4 para listar fornecedores");
		System.out.println("Digite 5 para listar usuarios");
		System.out.println("Digite 7 para sair");
		int resposta = input.nextInt();
		return resposta;
		
	}
}
