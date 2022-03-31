package controller;

import java.util.ArrayList;

import modelos.Fornecedor;
import modelos.Prato;
import modelos.Produto;
import modelos.Usuario;
import modelos.Venda;

public interface ListagemCopyable {
	
	public void mostrarCardapio(ArrayList<Prato> listaFornecedores);
	public void listarFornecedor(ArrayList<Fornecedor> listaFornecedores);
	public void listarProduto(ArrayList<Produto> listaFornecedores);
	public void listarUsuario(ArrayList<Usuario> listaFornecedores);
	public void listarVenda(ArrayList<Venda> listaFornecedores);
}