package modelos;

import java.util.ArrayList;

public class Venda {
	/*private date data;
	private date hora;*/
	private ArrayList<Prato> itens;
	private double precoTotal;
	private String metodoDePagamento;
	
	public Venda(ArrayList<Prato> itens, double precoTotal, String metodoDePagamento) {
		
		this.itens = itens;
		this.setMetodoDePagamento(metodoDePagamento);
		
		
	}
	
	//Metodo que seleciona um prato e adiciona no ArrayList de itens
	//Lembrar de colocar o codigo abaixo no Construtor
	public void selecionaPratos(ArrayList<Prato> pratos, String codigoPrato){
		
		for(Prato prato: pratos) {
			if (prato.getId() == codigoPrato) {
				itens.add(prato);
			}
		}
	}
	
	private double setPrecoTotal(double precoTotal) {
		
		for(Prato item : itens) {
			precoTotal += item.getPreco();
		}
		return precoTotal;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public String getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}
}
