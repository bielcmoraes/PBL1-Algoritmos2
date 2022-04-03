package view;

import java.util.Scanner;

public class SubMenuView {
	
	public static int telaMenuGerenciamentos() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite 1 para Cadastrar");
		System.out.println("Digite 2 para editar");
		System.out.println("Digite 3 para excluir");
		System.out.println("Digite 4 para sair");
		int resposta = input.nextInt();
		return resposta;
	}
	
	public static int telaMenuListagem() {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite 1 para mostrar o Cardapio");
		System.out.println("Digite 2 para listar Pratos");
		System.out.println("Digite 3 para listar Produtos");
		System.out.println("Digite 4 para listar Vendas");
		System.out.println("Digite 5 para listar Fornecedores");
		System.out.println("Digite 6 para listar Usuários");
		System.out.println("Digite 7 para sair");
		int resposta = input.nextInt();
		return resposta;
		
	}
}
