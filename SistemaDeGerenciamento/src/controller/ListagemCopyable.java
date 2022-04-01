package controller;

import java.util.ArrayList;

import model.Fornecedor;
import model.Prato;
import model.Produto;
import model.Usuario;
import model.Venda;

public interface ListagemCopyable {
	
	public void mostrarCardapio(ArrayList<Prato> listaFornecedores);
	public void listarFornecedor(ArrayList<Fornecedor> listaFornecedores);
	public void listarProduto(ArrayList<Produto> listaFornecedores);
	public void listarUsuario(ArrayList<Usuario> listaFornecedores);
	public void listarVenda(ArrayList<Venda> listaFornecedores);
}