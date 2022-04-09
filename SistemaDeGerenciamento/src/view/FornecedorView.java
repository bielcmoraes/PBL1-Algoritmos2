package view;

import java.util.Scanner;

import model.Fornecedor;

public class FornecedorView{

	public static String[] cadastrarFornecedor() {
		System.out.println("\n");
		System.out.println("========================");
		System.out.println("= CADASTRAR FORNECEDOR =");
		System.out.println("========================");
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do fornecedor");
		String nome = input.nextLine();
		
		System.out.println("Digite o CNPJ do fornecedor");
		String cnpj = input.nextLine();
		
		System.out.println("Digite o endereço do fornecedor");
		String endereco = input.nextLine();
		
		String [] info = new String[3];
		
		info[0] = nome;
		info[1] = cnpj;
		info[2] = endereco;
		
		return info;
	}

	public static String buscaFornecedor() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o codigo do fornecedor que deseja buscar");
		String codigo = input.nextLine();
		return codigo;
	}
	
	public static String[] editarFornecedor() {
		System.out.println("\n");
		System.out.println("========================");
		System.out.println("= EDITAR FORNECEDOR =");
		System.out.println("========================");
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um novo nome de fornecedor");
		String nome = input.nextLine();
		
		System.out.println("Digite um novo CNPJ de fornecedor");
		String cnpj = input.nextLine();
		
		System.out.println("Digite um novo endereço de fornecedor");
		String endereco = input.nextLine();
		
		String [] info = new String[3];
		
		info[0] = nome;
		info[1] = cnpj;
		info[2] = endereco;
		
		return info;
	}

	public static String excluirFornecedor() {
		System.out.println("\n");
		System.out.println("======================");
		System.out.println("= EXCLUIR FORNECEDOR =");
		System.out.println("======================");
		return buscaFornecedor();
	}

}
