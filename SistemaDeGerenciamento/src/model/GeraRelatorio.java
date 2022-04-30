package model;

import java.util.ArrayList;
import java.util.HashMap;

import com.lowagie.text.Table;

public class GeraRelatorio implements GeraRelatoriosCopyable {

	@Override
	public void estoqueTotal(HashMap<String, ArrayList<Produto>> listaProdutos) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.estoqueTotal(listaProdutos);
		new Relatorio(info);
	}

	@Override
	public void estoquePorProduto(HashMap<String, ArrayList<Produto>> listaProdutos) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.estoquePorProduto(listaProdutos);
		new Relatorio(info);
		
	}

	@Override
	public void fornecedorPorProduto(HashMap<String, ArrayList<Produto>> listaProdutos) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.fornecedorPorProduto(listaProdutos);
		new Relatorio(info);
		
	}

	@Override
	public void fornecedorPorFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.fornecedorPorFornecedor(listaFornecedores);
		new Relatorio(info);
		
	}

	@Override
	public void vendasTotal(ArrayList<Venda> listaVendas) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.vendasTotal(listaVendas);
		new Relatorio(info);
		
	}

	@Override
	public void vendasPorTipoDePrato(ArrayList<Venda> listaVendas) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.vendasPorTipoDePrato(listaVendas);
		new Relatorio(info);
		
	}

}
