package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

import com.lowagie.text.DocumentException;
import com.lowagie.text.Table;

import exceptions.ErroGrave;
import exceptions.ProdutoNaoCadastrado;
import exceptions.RelatorioNaoGerado;

public class GeraRelatorio implements GeraRelatoriosCopyable {

	@Override
	public boolean estoqueTotal(HashMap<String, ArrayList<Produto>> listaProdutos) throws RelatorioNaoGerado, ErroGrave{
		
		try{
			GeraTabela tabela = new GeraTabela();
			Table info = tabela.estoqueTotal(listaProdutos);
			new Relatorio(info, "Relatorio de estoque total");
			return true;
			
		} catch (DocumentException e) {
			throw new RelatorioNaoGerado("Relatorio de estoque total");
            
        } catch (FileNotFoundException e) {
        	throw new RelatorioNaoGerado("Relatorio de estoque total");
        	
        }
	}

	@Override
	public boolean estoquePorProduto(HashMap<String, ArrayList<Produto>> listaProdutos) throws RelatorioNaoGerado, ErroGrave {
		try {
			GeraTabela tabela = new GeraTabela();
			Table info = tabela.estoquePorProduto(listaProdutos);
			new Relatorio(info, "Relatorio de estoque por produto");
			return true;
			
		} catch (DocumentException e) {
			throw new RelatorioNaoGerado("Relatorio de estoque por produto");
			
        } catch (FileNotFoundException e) {
        	throw new RelatorioNaoGerado("Relatorio de estoque por produto");        	
        }
		
	}

	@Override
	public boolean estoqueProdutosPertoDeVencer(HashMap<String, ArrayList<Produto>> listaProdutos) throws ErroGrave, RelatorioNaoGerado {
		
		try{
			GeraTabela tabela = new GeraTabela();
			Table info1 = tabela.estoqueProdutosVencidos(listaProdutos);
			Table info2 = tabela.estoqueProdutosPertoDeVencer(listaProdutos);
			new Relatorio(info1, info2, "Produtos do estoque vencidos e próximos de vencer");
			return true;
			
		} catch (DocumentException e) {
			throw new RelatorioNaoGerado("Produtos do estoque vencidos e próximos de vencer"); 
            
        } catch (FileNotFoundException e) {
        	throw new RelatorioNaoGerado("Produtos do estoque vencidos e próximos de vencer"); 
        }
	}
	
	@Override
	public boolean fornecedorPorProduto(HashMap<String, ArrayList<Produto>> listaProdutos) throws RelatorioNaoGerado, ErroGrave {
		
		try{
			GeraTabela tabela = new GeraTabela();
			Table info = tabela.fornecedorPorProduto(listaProdutos);
			new Relatorio(info, "Relatorio de fornecedor por produto");
			return true;
			
		}catch (DocumentException e) {
        	throw new RelatorioNaoGerado("Relatorio de fornecedor por produto"); 
            
        } catch (FileNotFoundException e) {
        	throw new RelatorioNaoGerado("Relatorio de fornecedor por produto"); 
        	
        }
		
	}

	@Override
	public boolean fornecedorPorFornecedor(ArrayList<Fornecedor> listaFornecedores) throws RelatorioNaoGerado, ErroGrave {
		
		try {
			GeraTabela tabela = new GeraTabela();
			Table info = tabela.fornecedorPorFornecedor(listaFornecedores);
			new Relatorio(info, "Relatorio de fornecedor por fornecedor");
			return true;
			
		} catch (DocumentException e) {
			throw new RelatorioNaoGerado("Relatorio de fornecedor por fornecedor"); 
            
        } catch (FileNotFoundException e) {
			throw new RelatorioNaoGerado("Relatorio de fornecedor por fornecedor"); 
        	
        }
	}

	@Override
	public boolean vendasTotal(ArrayList<Venda> listaVendas) throws ErroGrave, RelatorioNaoGerado {
		
		try{
			GeraTabela tabela = new GeraTabela();
			Table info = tabela.vendasTotal(listaVendas);
			new Relatorio(info, "Relatorio total de vendas");
			return true;
			
		} catch (DocumentException e) {
			throw new RelatorioNaoGerado("Relatorio total de vendas"); 
            
        } catch (FileNotFoundException e) {
			throw new RelatorioNaoGerado("Relatorio total de vendas"); 
        	
        }
	}

	@Override
	public boolean vendasPorPeriodo(ArrayList<Venda> listaVendas) throws ErroGrave {
		GeraTabela tabela = new GeraTabela();
		
		try {
			
			try {
				//Relatorio de vendas diárias
				Table info = tabela.vendasDiarias(listaVendas);
				new Relatorio(info, "Relatorio de vendas diarias");
				
			} catch (DocumentException e) {
				throw new RelatorioNaoGerado("Relatorio de vendas diarias");
	            
	        } catch (FileNotFoundException e) {
	        	throw new RelatorioNaoGerado("Relatorio de vendas diarias");
	        	
	        }
			
			try {
				//Relatorio de vendas semanais
				Table info = tabela.vendasSemanal(listaVendas);
				new Relatorio(info,"Relatorio de vendas semanais");
				
			} catch (DocumentException e) {
				throw new RelatorioNaoGerado("Relatorio de vendas semanais");
	            
	        } catch (FileNotFoundException e) {
	        	throw new RelatorioNaoGerado("Relatorio de vendas semanais");
	        	
	        }
			
			try {
				
				//Relatorio de vendas mensais
				Table info = tabela.vendasSemanal(listaVendas);
				new Relatorio(info, "Relatorio de vendas mensais");
			}catch (DocumentException e) {
				throw new RelatorioNaoGerado("Relatorio de vendas mensais");
	            
	        } catch (FileNotFoundException e) {
	        	throw new RelatorioNaoGerado("Relatorio de vendas mensais");
	        	
	        }
			return true;
			
		}catch(RelatorioNaoGerado r) {
			return false;
		}
	}
	
	@Override
	public boolean vendasPorTipoDePrato(ArrayList<Venda> listaVendas) throws ErroGrave, RelatorioNaoGerado {
		
		try{
			GeraTabela tabela = new GeraTabela();
			Table info = tabela.vendasPorTipoDePrato(listaVendas);
			new Relatorio(info, "Relatorio de vendas por tipo de prato");
			return true;
			
		} catch (DocumentException e) {
			throw new RelatorioNaoGerado("Relatorio de vendas por tipo de prato");
            
        } catch (FileNotFoundException e) {
        	throw new RelatorioNaoGerado("Relatorio de vendas por tipo de prato");
        	
        } 
	}


}
