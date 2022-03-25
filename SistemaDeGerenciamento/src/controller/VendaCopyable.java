package controller;

import java.util.ArrayList;

import modelos.Venda;

public interface VendaCopyable {
	
	public void cadastrarVenda(ArrayList<Venda> vendas);
	public void editarVenda();
	public void excluirVenda();
}
