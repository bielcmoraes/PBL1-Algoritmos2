package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import modelos.Produto;

public class GerenciaProdutos implements ProdutoCopyable {
	// Attributes
	private static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	
	// Methods
	@Override
	public static void cadastrarProduto(Produto produto) {
		listaProdutos.add(produto);
	}
	@Override
	public static void editarProduto(Produto produto, String nome) {
		produto.setNome(nome);
	}
	@Override
	public static void editarProduto(Produto produto, Double preco) {
		produto.setPreco(preco);
	}
	@Override
	public static void editarProduto(Produto produto, LocalDate validade) {
		produto.setValidade(validade);
	}
	@Override
	public static void excluirProduto(Produto produto) {
		listaProdutos.remove(produto);
	}
}
