import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import PreCadastro.PreCadastro;
import model.BancoDeDados;
import model.Fornecedor;
import model.GeraTabela;
import model.Gerente;
import model.Produto;
import model.Relatorio;
import model.Usuario;
import model.Venda;

public class Main2 {

	public static void main(String[] args) {
		
		BancoDeDados dados = new BancoDeDados();
		PreCadastro preCadastro = new PreCadastro();
		preCadastro.PreCadastrarFornecedores(dados);
		preCadastro.PreCadastrarProdutos(dados);
		preCadastro.PreCadastrarPratos(dados);
		preCadastro.preCadastrarVendas(dados);
		
		
		LocalDate validade = LocalDate.of(2022, 05, 06);
		LocalDate validadeVencida = LocalDate.of(2021, 10, 04);
		ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		
		Produto pertoDeVencer = new Produto(dados.getListaIds(), "Pao", 0.5, 10.0, "Un", validade, fornecedores);
		Produto vencido = new Produto(dados.getListaIds(), "Pao", 0.5, 10.0, "Un", validadeVencida, fornecedores);

		dados.getListaProdutos().put(vencido.getNome(), new ArrayList<Produto>());
		dados.getListaProdutos().get(vencido.getNome()).add(vencido);
		dados.getListaProdutos().get(pertoDeVencer.getNome()).add(pertoDeVencer);
		GeraTabela tabela = new GeraTabela();
		
		Relatorio r = new Relatorio(tabela.estoqueProdutosVencidos(dados.getListaProdutos()), tabela.estoqueProdutosPertoDeVencer(dados.getListaProdutos()));
		
		
		/*
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate data = null;
		
		BancoDeDados bd = new BancoDeDados();
		Venda v1 = new Venda(bd.getListaIds(), bd.getCardapio(),22.5, "pix");
		v1.setData(data.parse("22-06-2021", formatoData));
		Venda v2 = new Venda(bd.getListaIds(), bd.getCardapio(),28.5, "débito");
		v2.setData(data.parse("05-12-2019", formatoData));
		Venda v3 = new Venda(bd.getListaIds(), bd.getCardapio(),29.5, "dinheiro");
		v3.setData(data.parse("22-08-2022", formatoData));
		Venda v4 = new Venda(bd.getListaIds(), bd.getCardapio(),44.2, "credito");
		v4.setData(data.parse("30-08-2019", formatoData));
		
		bd.getListaVendas().add(v1);
		bd.getListaVendas().add(v2);
		bd.getListaVendas().add(v3);
		bd.getListaVendas().add(v4);

		
		GeraTabela tabela  = new GeraTabela();
		Table teste = tabela.vendasPorData(bd.getListaVendas());
		GeraRelatorios pdf = new GeraRelatorios(teste, "Master");
		
		/*
		Table tabela = new Table(2);
		for(Usuario usuario : bd.getListaUsuarios()) {
			tabela.addCell(usuario.getNome());
			tabela.addCell(usuario.getId());
		}
		
		Document documentPDF = new Document();

        try {
            PdfWriter.getInstance(documentPDF, new FileOutputStream("tabelaTeste.pdf"));

            documentPDF.open();
            
            //Informações
            Paragraph corpo = new Paragraph();
            corpo.add(tabela);
            
            //Adiciona os paragrafos ao documento
            documentPDF.add(corpo);
            documentPDF.close();

        } catch (DocumentException e) {
            
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        } */
    	
	}

}
