package model;

import java.util.ArrayList;
import java.util.HashMap;

import com.lowagie.text.Table;

import exceptions.ErroGrave;
import exceptions.RelatorioNaoGerado;

public interface GeraRelatoriosCopyable {
	
	public boolean estoqueTotal(HashMap<String, ArrayList<Produto>> listaProdutos) throws RelatorioNaoGerado, ErroGrave;
	public boolean estoquePorProduto(HashMap<String, ArrayList<Produto>> listaProdutos) throws RelatorioNaoGerado, ErroGrave;
	public boolean estoqueProdutosPertoDeVencer(HashMap<String, ArrayList<Produto>> listaProdutos) throws ErroGrave, RelatorioNaoGerado;
	public boolean fornecedorPorProduto(HashMap<String, ArrayList<Produto>> listaProdutos) throws RelatorioNaoGerado, ErroGrave;
	public boolean fornecedorPorFornecedor(ArrayList<Fornecedor> listaFornecedores) throws RelatorioNaoGerado, ErroGrave;
	public boolean vendasTotal(ArrayList<Venda> listaVendas) throws ErroGrave, RelatorioNaoGerado;
	public boolean vendasPorPeriodo(ArrayList<Venda> listaVendas) throws ErroGrave;
	public boolean vendasPorTipoDePrato(ArrayList<Venda> listaVendas) throws ErroGrave, RelatorioNaoGerado;
	
}
