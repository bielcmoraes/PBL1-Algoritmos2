/**
 * 
 */
package model;

import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
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
		
		int produtosCadastrados = 0;
		
		//Cria uma nova tabela com três colunas
		Table tabela = new Table(4);
		tabela.addCell("ID:");
		tabela.addCell("NOME:");
		tabela.addCell("VALIDADE:");
		tabela.addCell("QUANTIDADE:");
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		for(ArrayList<Produto> estoque: listaProdutos.values()) {
			
			for(Produto produto : estoque) {
				tabela.addCell(produto.getId());
				tabela.addCell(produto.getNome());
				tabela.addCell(produto.getValidade().format(formatoData));
				tabela.addCell(String.valueOf(produto.getQuantidade()) + " " + produto.getUnidadeDeMedida());
				produtosCadastrados += 1;
			}
		}
		Cell celulaTotal = new Cell(new Paragraph("Total de produtos cadastrados: " + String.valueOf(produtosCadastrados)));
		celulaTotal.setColspan(4);
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
			String unidadeDeMedida;
			for(Produto produto : estoque) {
				tabela.addCell(produto.getId());
				tabela.addCell(produto.getNome());
				
				quantidade += produto.getQuantidade();
				unidadeDeMedida = " " + produto.getUnidadeDeMedida();
				tabela.addCell(String.valueOf(quantidade) + unidadeDeMedida);
			}
			
		}

		return tabela;
	}
	
	
	public Table estoqueProdutosPertoDeVencer(HashMap<String, ArrayList<Produto>> listaProdutos) {
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		ArrayList<Produto> produtosPertoDeVencer = new ArrayList<Produto>();
		
		for(ArrayList<Produto> estoque: listaProdutos.values()) {	
			for(Produto produto : estoque) {
				
				//Adiciona uma semana à data atual e compara com a validade dos produtos. Se a validade for menor
				//o produto está vencido ou falta no maximo 7 dias para vencer.
				LocalDate dataAtual = LocalDate.now();
				
				if(dataAtual.plusWeeks(1).isAfter(produto.getValidade()) && dataAtual.isBefore(produto.getValidade())) {
					produtosPertoDeVencer.add(produto);	
				}
				}
			}
		produtosPertoDeVencer.sort(Comparator.comparing(Produto::getValidade));
		
		Table tabela = new Table(4);
		Paragraph proximoDeVencerText = new Paragraph("PRÓXIMO À VENCER");
		
		Cell proximoDeVencer = new Cell(proximoDeVencerText);
		proximoDeVencer.setColspan(4);
		proximoDeVencer.setBackgroundColor(Color.yellow);
		proximoDeVencer.setHorizontalAlignment(Cell.ALIGN_CENTER);
		tabela.addCell(proximoDeVencer);
	
		tabela.addCell("ID:");
		tabela.addCell("NOME:");
		tabela.addCell("VALIDADE:");
		tabela.addCell("QUANTIDADE:");
		
		if(!produtosPertoDeVencer.isEmpty()) {
			for(Produto produto: produtosPertoDeVencer) {
				tabela.addCell(produto.getId());
				tabela.addCell(produto.getNome());
				tabela.addCell(produto.getValidade().format(formatoData));
				tabela.addCell(String.valueOf(produto.getQuantidade()));
			}
			
		}else {
			Paragraph vazioText = new Paragraph("Não há produtos próximos de vencer no sistema!");
			Cell vazio = new Cell(vazioText);
			vazio.setColspan(4);
			vazio.setHorizontalAlignment(Cell.ALIGN_CENTER);
			tabela.addCell(vazio);
		}
		
		
		return tabela;
	}
	
	public Table estoqueProdutosVencidos(HashMap<String, ArrayList<Produto>> listaProdutos) {
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		ArrayList<Produto> produtosVencidos = new ArrayList<Produto>();
		LocalDate dataAtual = LocalDate.now();
		
		for(ArrayList<Produto> estoque: listaProdutos.values()) {
			for(Produto produto : estoque) {
				
				if(dataAtual.isAfter(produto.getValidade())) {
					produtosVencidos.add(produto);
				}
				}
		}
		
		//Ordena os arrays pela data de validade
		produtosVencidos.sort(Comparator.comparing(Produto::getValidade));
		Table tabela = new Table(4);
		Paragraph vencidoText = new Paragraph("VENCIDOS");
		
		Cell vencidos = new Cell(vencidoText);
		vencidos.setColspan(4);
		vencidos.setBackgroundColor(Color.red);
		vencidos.setHorizontalAlignment(Cell.ALIGN_CENTER);
		tabela.addCell(vencidos);
	
		tabela.addCell("ID:");
		tabela.addCell("NOME:");
		tabela.addCell("VALIDADE:");
		tabela.addCell("QUANTIDADE:");
		
		if(!produtosVencidos.isEmpty()) {
			for(Produto produto: produtosVencidos) {
				tabela.addCell(produto.getId());
				tabela.addCell(produto.getNome());
				tabela.addCell(produto.getValidade().format(formatoData));
				tabela.addCell(String.valueOf(produto.getQuantidade()));
			}
			
		}else {
			Paragraph vazioText = new Paragraph("Não há produtos vencidos no sistema!");
			Cell vazio = new Cell(vazioText);
			vazio.setColspan(4);
			vazio.setHorizontalAlignment(Cell.ALIGN_CENTER);
			tabela.addCell(vazio);
		}
		
		
		return tabela;
	}
	
	
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
	
	public Table vendasDiarias(ArrayList<Venda> listaVendas) {
		
		double totalVendido = 0;
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
		
		Table tabela = new Table(5);
		tabela.setWidth(100);
		tabela.addCell("ID:");
		tabela.addCell("DATA:");
		tabela.addCell("HORARIO:");
		tabela.addCell("MÉTODO DE PAGAMENTO:");
		tabela.addCell("ITENS:");
		
		for(Venda venda : listaVendas) {
			
			String itens = "";
			for(Prato prato : venda.getPratos()) {
				itens += prato.getNome() + ", ";
			}
			
			itens = itens.substring(0, itens.length()-2);
			if(venda.getData().equals(LocalDate.now())) {
				tabela.addCell(venda.getId());
				tabela.addCell(venda.getData().format(formatoData));
				tabela.addCell(venda.getHorario().format(formatoHorario));
				tabela.addCell(venda.getMetodoDePagamento());
				tabela.addCell(itens);
			}
			totalVendido += venda.getPrecoTotal();
			
		}
		
		
		
		Cell celulaTotal = new Cell(new Paragraph("Total Vendido: " + String.valueOf(totalVendido) + " reais."));
		celulaTotal.setColspan(5);
		celulaTotal.setBackgroundColor(Color.gray);
		tabela.addCell(celulaTotal);
		
		return tabela;
	}
	
	public Table vendasSemanal(ArrayList<Venda> listaVendas) {
		
		double totalVendido = 0;
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
		
		Table tabela = new Table(5);
		tabela.setWidth(100);
		tabela.addCell("ID:");
		tabela.addCell("DATA:");
		tabela.addCell("HORARIO:");
		tabela.addCell("MÉTODO DE PAGAMENTO:");
		tabela.addCell("ITENS:");
		
		for(Venda venda : listaVendas) {
			
			String itens = "";
			for(Prato prato : venda.getPratos()) {
				itens += prato.getNome() + ", ";
			}
			
			itens = itens.substring(0, itens.length()-2);
			
			//Compara a data atual menos uma semana com a data da venda
			if(LocalDate.now().minusWeeks(1).isBefore(venda.getData())) {
				tabela.addCell(venda.getId());
				tabela.addCell(venda.getData().format(formatoData));
				tabela.addCell(venda.getHorario().format(formatoHorario));
				tabela.addCell(venda.getMetodoDePagamento());
				tabela.addCell(itens);
			}
			totalVendido += venda.getPrecoTotal();
			
		}
		
		Cell celulaTotal = new Cell(new Paragraph("Total Vendido: " + String.valueOf(totalVendido) + " reais."));
		celulaTotal.setColspan(5);
		celulaTotal.setBackgroundColor(Color.gray);
		tabela.addCell(celulaTotal);
		
		return tabela;
	}
	
	public Table vendasMensais(ArrayList<Venda> listaVendas) {
		
		double totalVendido = 0;
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
		
		Table tabela = new Table(5);
		tabela.setWidth(100);
		tabela.addCell("ID:");
		tabela.addCell("DATA:");
		tabela.addCell("HORARIO:");
		tabela.addCell("MÉTODO DE PAGAMENTO:");
		tabela.addCell("ITENS:");
		
		for(Venda venda : listaVendas) {
			
			String itens = "";
			for(Prato prato : venda.getPratos()) {
				itens += prato.getNome() + ", ";
			}
			
			itens = itens.substring(0, itens.length()-2);
			
			//Compara o mês e o ano das vendas com o atual e adiciona na tabela
			if(venda.getData().getMonth().equals(LocalDate.now().getMonth()) && venda.getData().getYear() == LocalDate.now().getYear()) {
				tabela.addCell(venda.getId());
				tabela.addCell(venda.getData().format(formatoData));
				tabela.addCell(venda.getHorario().format(formatoHorario));
				tabela.addCell(venda.getMetodoDePagamento());
				tabela.addCell(itens);
			}
			totalVendido += venda.getPrecoTotal();
			
		}
		
		Cell celulaTotal = new Cell(new Paragraph("Total Vendido: " + String.valueOf(totalVendido) + " reais."));
		celulaTotal.setColspan(5);
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
