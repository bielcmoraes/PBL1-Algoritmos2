package controller;

import java.util.ArrayList;

import model.Fornecedor;

public interface FornecedorCopyable {

	public boolean cadastrarFornecedor(ArrayList<Fornecedor> listaFornecedores);
	public boolean editarFornecedor(ArrayList<Fornecedor> listaFornecedores);
	public boolean excluirFornecedor(ArrayList<Fornecedor> listaFornecedores);
}
