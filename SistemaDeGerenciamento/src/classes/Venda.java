package classes;

import java.util.ArrayList;

public class Venda {
	/*private date data;
	private date hora;*/
	private ArrayList<Prato> itens;
	private double precoTotal;
	private String metodoDePagamento;
	
	public Venda(ArrayList<Prato> itens, double precoTotal, String metodoDePagamento) {
		
		this.itens = itens;
		this.metodoDePagamento = metodoDePagamento;
		
		
	}
	
	/*private double calculaPrecoTotal(ArrayList<Prato> comprados) {
		
		for(int cont = 0; cont < comprados.length; cont++) {
			precoTotal += comprados.preco;
		}
		return precoTotal;
	}*/
}
