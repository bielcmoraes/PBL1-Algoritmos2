package view;

import java.util.Scanner;

public class ProdutosView {

	public static String[] cadastrarProduto() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do produto");
		String nome = input.nextLine();
		
		System.out.println("Digite o preço do produto");
		String preco = input.nextLine();
		
		System.out.println("Digite a validade do produto");
		String validade = input.nextLine();
		
		String [] info = new String[3];
		
		info[0] = nome;
		info[1] = preco;
		info[2] = validade;
		
		return info;
	}

	public static String buscaProduto() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o codigo do produto que deseja buscar");
		String codigo = input.nextLine();
		return codigo;
	}
	
	public static String[] editarProduto() {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um novo nome de produto");
		String nome = input.nextLine();
		
		System.out.println("Digite um novo preco de produto");
		String preco = input.nextLine();
		
		System.out.println("Digite uma nova vailidade de produto");
		String validade = input.nextLine();
		
		String [] info = new String[3];
		
		info[0] = nome;
		info[1] = preco;
		info[2] = validade;
		
		return info;
		
	}

	public String excluirProduto() {
		
		return buscaProduto();
		
	}

}
