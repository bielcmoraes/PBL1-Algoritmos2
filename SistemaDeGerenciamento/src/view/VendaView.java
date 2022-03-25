package view;

import java.util.ArrayList;
import java.util.Scanner;

import modelos.Prato;
import modelos.Venda;

public class VendaView {
	
	private ArrayList<Prato> pratos;
	public VendaView(ArrayList<Prato> listaDePratos) {
		
		Scanner input = new Scanner(System.in);
		
		String data = input.nextLine(); //Fazer uma função que converte datas para o tipo Date
		
		this.pratos = listaDePratos;
		String primeiroPrato = input.nextLine();
		String metodoDePagamento = input.nextLine();
		Venda venda = new Venda(data,listaDePratos, primeiroPrato, metodoDePagamento);
	}
	
	}
