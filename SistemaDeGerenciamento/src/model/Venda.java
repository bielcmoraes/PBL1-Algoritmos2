package model;

import java.util.ArrayList;
import java.util.Date;

public class Venda extends Entidade{
	private Date data;
	private ArrayList<Prato> itens;
	private double precoTotal;
	private String metodoDePagamento;
	
	//Construtores
	public Venda(ArrayList<String> listaIds, Date data, ArrayList<Prato> pratos, String primeiroPrato, String metodoDePagamento) {
		
		super(listaIds);
		this.data = data;
		this.setMetodoDePagamento(metodoDePagamento);
		
		for(Prato prato: pratos) {
			
			if (prato.getId() == primeiroPrato) {
				this.itens.add(prato);
			}
		}
		
		for(Prato item : this.itens) {
			this.precoTotal += item.getPreco();
		}
	}
	
	//Atualiza o preço total
	public void atualizaPrecoTotal() {
		
		for(Prato item : this.itens) {
			this.precoTotal += item.getPreco();
		}
	}
	
	public void adicionaItens(ArrayList<Prato> pratos, String codigoPrato){
		
		//Adiciona mais um prata ao ArrayList de vendas
		for(Prato prato: pratos) {
			if (prato.getId() == codigoPrato) {
				this.itens.add(prato);
			}
		
		//Atualiza o preço Total apos adicionar mais um prato ao ArrayList de vendas
		atualizaPrecoTotal();
		}
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
