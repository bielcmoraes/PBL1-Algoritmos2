package controller;

import java.util.ArrayList;

import model.Produto;

public interface ProdutoCopyable {
	public boolean cadastrarProduto(ArrayList<Produto> listaProdutos, ArrayList<String> listaIds, String [] info);
	public boolean editarProduto(ArrayList<Produto> listaProdutos, String codigoProduto, String [] info);
	public boolean excluirProduto(ArrayList<Produto> listaProdutos, ArrayList<String> listaIds, String codigoProduto);
}
