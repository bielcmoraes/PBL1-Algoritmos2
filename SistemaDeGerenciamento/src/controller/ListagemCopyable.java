package controller;

import java.util.ArrayList;

import model.Fornecedor;
import model.Prato;
import model.Produto;
import model.Usuario;
import model.Venda;

public interface ListagemCopyable {
	
	public void mostrarCardapio(ArrayList<Prato> cardapio);
	public void listarFornecedor(ArrayList<Fornecedor> listaFornecedores);
	public void listarProduto(ArrayList<Produto> listaProdutos);
	public void listarUsuario(ArrayList<Usuario> listaUsuarios);
	public void listarVenda(ArrayList<Venda> listaVendas);
}