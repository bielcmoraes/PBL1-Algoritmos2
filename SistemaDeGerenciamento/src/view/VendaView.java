package view;

import java.util.Scanner;

public class VendaView {
	
	public static String[] cadastrarVenda() {
		System.out.println("\n");
		System.out.println("===================");
		System.out.println("= CADASTRAR VENDA =");
		System.out.println("===================");
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a data da venda");
		String data = input.nextLine();
		
		System.out.println("Digite o horario da venda");
		String horario = input.nextLine();
		
		System.out.println("Digite os pratos da venda");
		String pratos = input.nextLine();
		
		System.out.println("Digite o metodo de pagamento");
		String metodoDePagamento = input.nextLine();
		
		String [] info = new String[4];
		
		info[0] = data;
		info[1] = horario;
		info[2] = pratos;
		info[3] = metodoDePagamento;
		
		return info;
	}

	public static String buscaVenda() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o codigo da venda que deseja buscar");
		String codigo = input.nextLine();
		return codigo;
	}
	
	public static String[] editarVenda() {
		System.out.println("\n");
		System.out.println("================");
		System.out.println("= EDITAR VENDA =");
		System.out.println("================");
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a nova data da venda");
		String data = input.nextLine();
		
		System.out.println("Digite o novo horario da venda");
		String horario = input.nextLine();
		
		System.out.println("Digite os novos pratos da venda");
		String pratos = input.nextLine();
		
		System.out.println("Digite o novo metodo de pagamento da venda");
		String metodoDePagamento = input.nextLine();
		
		String [] info = new String[4];
		
		info[0] = data;
		info[1] = horario;
		info[2] = pratos;
		info[3] = metodoDePagamento;
		
		return info;
		
	}

	public String excluirVenda() {
		System.out.println("\n");
		System.out.println("=================");
		System.out.println("= EXCLUIR VENDA =");
		System.out.println("=================");
		return buscaVenda();
		
	}
}
