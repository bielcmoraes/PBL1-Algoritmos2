package view;

import java.util.Scanner;

public class CardapioView {

	public static String[] cadastrarPrato() {
				
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do prato");
		String nome = input.nextLine();
		
		System.out.println("Digite o preco do prato");
		String preco = input.nextLine();
		
		System.out.println("Digite a descricao");
		String descricao = input.nextLine();
		
		System.out.println("Digite a categoria");
		String categoria = input.nextLine();
		
		System.out.println("Digite os produtos");
		String produtos = input.nextLine();
		
		String [] info = new String[5];
		
		info[0] = nome;
		info[1] = preco;
		info[2] = descricao;
		info[3] = categoria;
		info[4] = produtos;
		
		return info;
	}

	public static String buscaPrato() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o codigo do prato que deseja buscar");
		String codigo = input.nextLine();
		return codigo;
	}
	
	public static String[] editarPrato() {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite o novo nome do prato");
		String nome = input.nextLine();
		
		System.out.println("Digite o novo preco do prato");
		String preco = input.nextLine();
		
		System.out.println("Digite a nova descricao");
		String descricao = input.nextLine();
		
		System.out.println("Digite a nova categoria");
		String categoria = input.nextLine();
		
		System.out.println("Digite os produtos");
		String produtos = input.nextLine();
		
		String [] info = new String[5];
		
		info[0] = nome;
		info[1] = preco;
		info[2] = descricao;
		info[3] = categoria;
		info[4] = produtos;
		
		return info;
		
	}

	public String excluirPrato() {
		
		return buscaPrato();
		
	}

}
