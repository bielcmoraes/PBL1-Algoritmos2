package model;

import java.util.ArrayList;
import java.util.HashMap;

import com.lowagie.text.Table;

public interface GeraRelatoriosCopyable {
	
	public void estoqueTotal(HashMap<String, ArrayList<Produto>> listaProdutos);
	public void estoquePorProduto(HashMap<String, ArrayList<Produto>> listaProdutos);
	public void fornecedorPorProduto(HashMap<String, ArrayList<Produto>> listaProdutos);
	public void fornecedorPorFornecedor(ArrayList<Fornecedor> listaFornecedores);


}
