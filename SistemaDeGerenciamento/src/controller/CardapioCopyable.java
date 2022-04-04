package controller;

import java.util.ArrayList;

import model.Prato;

public interface CardapioCopyable {
	
	public boolean cadastrarPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds);
	public boolean editarPrato(ArrayList<Prato> cardapio);
	public boolean excluirPrato(ArrayList<Prato> cardapio);
}
