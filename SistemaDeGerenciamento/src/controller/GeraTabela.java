/**
 * 
 */
package controller;

import java.awt.Color;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import com.lowagie.text.Element;
import com.lowagie.text.Table;
import com.lowagie.text.alignment.HorizontalAlignment;

import model.Entidade;
import model.Fornecedor;
import model.Produto;
import model.Usuario;
import model.Venda;

/**
 * @author Gabriel Moraes
 *
 */
public class GeraTabela {
	//Métodos
	
	public Table vendasPorData(ArrayList<Venda> listaVenda) {
		
		//Ordena a lista pela data da venda
		listaVenda.sort(Comparator.comparing(Venda::getData));
		
		//Cria uma nova tabela com duas colunas
		Table tabela = new Table(5);
		tabela.addCell("DATA: ");
		tabela.addCell("HORÁRIO: ");
		tabela.addCell("PRATOS: ");
		tabela.addCell("PREÇO TOTAL: ");
		tabela.addCell("MÉTODO DE PAGAMENTO: ");
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
		
		for(Venda venda : listaVenda) {
			tabela.addCell(venda.getData().format(formatoData));
			tabela.addCell(venda.getHorario().format(formatoHorario));
			tabela.addCell(venda.getPratos().toString());
			tabela.addCell(venda.getPrecoTotal().toString());
			tabela.addCell(venda.getMetodoDePagamento());
		}
		tabela.setBackgroundColor(Color.LIGHT_GRAY);
		return tabela;
	}

}
