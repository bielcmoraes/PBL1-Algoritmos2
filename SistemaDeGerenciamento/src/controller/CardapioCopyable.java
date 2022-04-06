package controller;

import java.util.ArrayList;

import model.Prato;
import model.Produto;

public interface CardapioCopyable {
	
	public boolean cadastrarPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds, ArrayList<Produto> listaProdutos, String [] info);
	public boolean editarPrato(ArrayList<Prato> cardapio, ArrayList<Produto> listaProdutos, String codigoPrato, String [] info);
	public boolean excluirPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds, String codigoPrato);
}
