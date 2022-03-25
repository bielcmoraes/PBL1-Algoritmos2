package view;

import java.util.Scanner;

public class FornecedorView{

	public static String[] cadastrarFornecedor() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o nome do Fornecedor");
		String nome = input.nextLine();
		
		System.out.println("Digite o CNPJ do Fornecedor");
		String cnpj = input.nextLine();
		
		System.out.println("Digite o endereço do Fornecedor");
		String endereco = input.nextLine();
		
		String [] info = new String[3];
		
		info[0] = nome;
		info[1] = cnpj;
		info[2] = endereco;
		
		return info;
	}

	public void editarFornecedor() {
		// TODO Auto-generated method stub
		
	}

	public void excluirFornecedor() {
		// TODO Auto-generated method stub
		
	}

}
