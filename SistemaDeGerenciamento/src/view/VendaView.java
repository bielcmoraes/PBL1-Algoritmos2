package view;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import modelos.Prato;
import modelos.Venda;

public class VendaView {
	
	//Atributos
	ArrayList<Prato> pratos;
	//Contrutores
	
	//Metodos
	public Venda cadastrarVenda(ArrayList<Prato> listaDePratos) {
		
		Scanner input = new Scanner(System.in);
		Date data = new Date();
		
		System.out.println("Digite o codigo de um item do cardapio");
		String primeiroItem = input.nextLine();
		
		System.out.println("Digite o metodo de pagamento");
		String metodoDePagamento = input.nextLine();
		
		Venda novaVenda = new Venda(data, pratos, primeiroItem, metodoDePagamento);
		
		return novaVenda;
	}
	}
