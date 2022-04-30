/**
 * 
 */
package model;

import java.awt.Color;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

import com.lowagie.text.Cell;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;

/**
 * @author Gabriel Moraes
 *
 */
public class GeraTabela {
	
	public Table estoqueTotal(HashMap<String, ArrayList<Produto>> listaProdutos) {
		
		int total = 0;
		
		//Cria uma nova tabela com três colunas
		Table tabela = new Table(3);
		tabela.addCell("ID: ");
		tabela.addCell("NOME: ");
		tabela.addCell("VALIDADE: ");
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		for(ArrayList<Produto> estoque: listaProdutos.values()) {
			
			for(Produto produto : estoque) {
				tabela.addCell(produto.getId());
				tabela.addCell(produto.getNome());
				tabela.addCell(produto.getValidade().format(formatoData));
				total += produto.getQuantidade();
			}
		}
		Cell celulaTotal = new Cell(new Paragraph("Total: " + String.valueOf(total)));
		celulaTotal.setColspan(3);
		tabela.addCell(celulaTotal);
		tabela.setBackgroundColor(Color.LIGHT_GRAY);
		return tabela;
	}
	
	public Table estoquePorProduto(HashMap<String, ArrayList<Produto>> listaProdutos) {
		
		Table tabela = new Table(3);
		tabela.addCell("ID: ");
		tabela.addCell("NOME: ");
		tabela.addCell("QUANTIDADE: ");
		
		for(ArrayList<Produto> estoque: listaProdutos.values()) {
			
			int quantidade = 0;
			for(Produto produto : estoque) {
				tabela.addCell(produto.getId());
				tabela.addCell(produto.getNome());
				quantidade += produto.getQuantidade();
			}
			tabela.addCell(String.valueOf(quantidade));
		}

		return tabela;
	}
	
	/*
	public Table estoqueProdutosaVencer() {
		
		Table tabela = new Table(3);
		tabela.addCell("ID: ");
		tabela.addCell("NOME: ");
		tabela.addCell("VALIDADE: ");
		return tabela;
	}
	*/
	
	public Table fornecedorPorProduto(HashMap<String, ArrayList<Produto>> listaProdutos) {
		
		Table tabela = new Table(2);
		tabela.addCell("PRODUTO: ");
		tabela.addCell("FORNECEDORES: ");
		
		for(ArrayList<Produto> estoque: listaProdutos.values()) {
			
			for(Produto produto : estoque) {
				tabela.addCell(produto.getNome());
				
				String fornecedores = "";
				for(Fornecedor fornecedor : produto.getFornecedores()) {
					fornecedores += fornecedor.getNome() + ", ";
				}
				fornecedores = fornecedores.substring(0, fornecedores.length()-2);
				
				tabela.addCell(fornecedores);
			}
		}
		
		return tabela;
	}
	
	public Table fornecedorPorFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		
		Table tabela = new Table(2);
		tabela.addCell("FORNECEDOR: ");
		tabela.addCell("PRODUTOS: ");
		
		for(Fornecedor fornecedor: listaFornecedores) {
			String produtos = "";
			for(String produto : fornecedor.getProdutos()) {
				produtos += produto + ", ";
			}
			produtos = produtos.substring(0, produtos.length()-2);
			
			tabela.addCell(fornecedor.getNome());
			tabela.addCell(produtos);
		}
		return tabela;
	}
	
	public Table vendasTotal(ArrayList<Venda> listaVendas) {
		
		double totalVendido = 0;
		Table tabela = new Table(6);
		tabela.setWidth(100);
		tabela.addCell("ID:");
		tabela.addCell("DATA:");
		tabela.addCell("HORARIO:");
		tabela.addCell("PREÇO TOTAL:");
		tabela.addCell("MÉTODO DE PAGAMENTO:");
		tabela.addCell("ITENS:");
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
		
		for(Venda venda: listaVendas) {
			
			String itens = "";
			for(Prato prato : venda.getPratos()) {
				itens += prato.getNome() + ", ";
			}
			
			itens = itens.substring(0, itens.length()-2);
			tabela.addCell(venda.getId());
			tabela.addCell(venda.getData().format(formatoData));
			tabela.addCell(venda.getHorario().format(formatoHorario));
			tabela.addCell(String.valueOf(venda.getPrecoTotal()));
			tabela.addCell(venda.getMetodoDePagamento());
			tabela.addCell(itens);
			
			totalVendido += venda.getPrecoTotal();
		}
		tabela.setBackgroundColor(Color.LIGHT_GRAY);
		Cell celulaTotal = new Cell(new Paragraph("Total Vendido: " + String.valueOf(totalVendido)));
		celulaTotal.setColspan(6);
		celulaTotal.setBackgroundColor(Color.gray);
		tabela.addCell(celulaTotal);
		
		return tabela;
	}
	
	public Table vendasPorTipoDePrato(ArrayList<Venda> listaVendas) {
		
		Table tabela = new Table(3);
		tabela.setWidth(100);
		tabela.addCell("PRATO:");
		tabela.addCell("QUANTIDADE VENDIDA:");
		tabela.addCell("VALOR VENDIDO:");
		
		ArrayList<String> listaPratos = new ArrayList<String>();
		
		//Monta um array com todos os pratos vendidos sem repetir pratos
		for(Venda venda: listaVendas) {
			for(Prato prato: venda.getPratos()) {
				String nomePrato = prato.getNome();
				
				if(!listaPratos.contains(nomePrato)) {
					listaPratos.add(nomePrato);
				}
			}
		}
		
		//Compara os pratos vendidos com a lista de vendas contando quantos pratos foram vendidos e o total de venda de cada prato
		for(String pratoVendido: listaPratos) {
			int quantidade = 0;
			double valor = 0;
			for(Venda venda: listaVendas) {
				for(Prato prato: venda.getPratos()) {
					if(pratoVendido.equals(prato.getNome())) {
						quantidade += 1;
						valor += prato.getPreco();
					}
				}
			}
			tabela.addCell(pratoVendido);
			tabela.addCell(String.valueOf(quantidade));
			tabela.addCell(String.valueOf(valor));
		}
		
		return tabela;
	}

}
