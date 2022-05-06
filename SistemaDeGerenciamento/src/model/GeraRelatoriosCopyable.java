package model;

import java.util.ArrayList;
import java.util.HashMap;

import com.lowagie.text.Table;

import exceptions.RelatorioNaoGerado;

public interface GeraRelatoriosCopyable {
	
	public boolean estoqueTotal(HashMap<String, ArrayList<Produto>> listaProdutos) throws RelatorioNaoGerado;
	public boolean estoquePorProduto(HashMap<String, ArrayList<Produto>> listaProdutos);
	public boolean estoqueProdutosPertoDeVencer(HashMap<String, ArrayList<Produto>> listaProdutos);
	public boolean fornecedorPorProduto(HashMap<String, ArrayList<Produto>> listaProdutos);
	public boolean fornecedorPorFornecedor(ArrayList<Fornecedor> listaFornecedores);
	public boolean vendasTotal(ArrayList<Venda> listaVendas);
	public boolean vendasPorPeriodo(ArrayList<Venda> listaVendas);
	public boolean vendasPorTipoDePrato(ArrayList<Venda> listaVendas);
	
}
