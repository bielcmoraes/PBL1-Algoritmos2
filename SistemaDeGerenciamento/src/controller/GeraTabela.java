/**
 * 
 */
package controller;

import java.awt.Color;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

import com.lowagie.text.Cell;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;

import model.Produto;

/**
 * @author Gabriel Moraes
 *
 */
public class GeraTabela {
	//Métodos
	
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

}
