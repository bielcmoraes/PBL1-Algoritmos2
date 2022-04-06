package controller;

import java.util.ArrayList;

import model.Fornecedor;

public interface FornecedorCopyable {

	public boolean cadastrarFornecedor(ArrayList<Fornecedor> listaFornecedores, ArrayList<String> listaIds, String [] info);
	public boolean editarFornecedor(ArrayList<Fornecedor> listaFornecedores, String codigoFornecedor, String [] info);
	public boolean excluirFornecedor(ArrayList<Fornecedor> listaFornecedores, ArrayList<String> listaIds, String codigoFornecedor);
}
