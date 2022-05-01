package model;

import java.util.ArrayList;
import java.util.HashMap;

import com.lowagie.text.Table;

public class GeraRelatorio implements GeraRelatoriosCopyable {

	@Override
	public void estoqueTotal(HashMap<String, ArrayList<Produto>> listaProdutos) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.estoqueTotal(listaProdutos);
		new Relatorio(info, "Relatorio de estoque total");
	}

	@Override
	public void estoquePorProduto(HashMap<String, ArrayList<Produto>> listaProdutos) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.estoquePorProduto(listaProdutos);
		new Relatorio(info, "Relatorio de estoque por produto");
		
	}

	@Override
	public void estoqueProdutosPertoDeVencer(HashMap<String, ArrayList<Produto>> listaProdutos) {
		GeraTabela tabela = new GeraTabela();
		Table info1 = tabela.estoqueProdutosVencidos(listaProdutos);
		Table info2 = tabela.estoqueProdutosPertoDeVencer(listaProdutos);
		new Relatorio(info1, info2, "Produtos do estoque vencidos e próximos de vencer");
		
	}
	
	@Override
	public void fornecedorPorProduto(HashMap<String, ArrayList<Produto>> listaProdutos) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.fornecedorPorProduto(listaProdutos);
		new Relatorio(info, "Relatorio de fornecedor por produto");
		
	}

	@Override
	public void fornecedorPorFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.fornecedorPorFornecedor(listaFornecedores);
		new Relatorio(info, "Relatorio de fornecedor por fornecedor");
		
	}

	@Override
	public void vendasTotal(ArrayList<Venda> listaVendas) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.vendasTotal(listaVendas);
		new Relatorio(info, "Relatorio total de vendas");
		
	}

	@Override
	public void vendasPorPeriodo(ArrayList<Venda> listaVendas) {
		GeraTabela tabela = new GeraTabela();
		
		//Relatorio de vendas diárias
		Table info = tabela.vendasDiarias(listaVendas);
		new Relatorio(info, "Relatorio de vendas diarias");
		
		//Relatorio de vendas semanais
		info = tabela.vendasSemanal(listaVendas);
		new Relatorio(info,"Relatorio de vendas semanais");
		
		//Relatorio de vendas mensais
		info = tabela.vendasSemanal(listaVendas);
		new Relatorio(info, "Relatorio de vendas mensais");
	}
	
	@Override
	public void vendasPorTipoDePrato(ArrayList<Venda> listaVendas) {
		GeraTabela tabela = new GeraTabela();
		Table info = tabela.vendasPorTipoDePrato(listaVendas);
		new Relatorio(info, "Relatorio de vendas por tipo de prato");
		
	}


}
