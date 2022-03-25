package controller;

import java.util.ArrayList;

import modelos.Fornecedor;

public interface FornecedorCopyable {

	public boolean cadastrarFornecedor(ArrayList<Fornecedor> listaFornecedores);
	public void editarFornecedor();
	public void excluirFornecedor();
}
