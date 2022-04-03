package controller;

import java.util.ArrayList;

import model.Produto;

public interface ProdutoCopyable {
	public boolean cadastrarProduto(ArrayList<Produto> listaProdutos, ArrayList<String> listaIds);
	public boolean editarProduto(ArrayList<Produto> listaProdutos);
	public boolean excluirProduto(ArrayList<Produto> listaProdutos);
}
