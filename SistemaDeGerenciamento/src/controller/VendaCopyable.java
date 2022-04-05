package controller;

import java.util.ArrayList;

import model.Prato;
import model.Venda;

public interface VendaCopyable {
	
	public boolean cadastrarVenda(ArrayList<Venda> listaVendas, ArrayList<String> listaIds, ArrayList<Prato> cardapio);
	public boolean editarVenda(ArrayList<Venda> listaVendas, ArrayList<Prato> cardapio);
	public boolean excluirVenda(ArrayList<Venda> listaVendas);
}
