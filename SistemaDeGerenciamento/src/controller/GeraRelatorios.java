package controller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import model.Usuario;

public class GeraRelatorios{
	
	//Construtores
	public GeraRelatorios(Table tabela) {
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    	DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
    	
    	//Data e horarios do sistema formatados
    	String data = formatoData.format(LocalDate.now());
    	String horario = formatoHorario.format(LocalTime.now());
        
    	//Instancia um novo documento
    	Document documentPDF = new Document();

        try {
            PdfWriter.getInstance(documentPDF, new FileOutputStream(data + ".pdf"));

            documentPDF.open();
            //Cabeçalho do Arquivo
            Paragraph cabecalho = new Paragraph();
            cabecalho.add("\nData: " + data);
            cabecalho.add("\nHorário: " + horario);            
            
            //Tabela com as informações
            Paragraph corpo = new Paragraph();
            corpo.add(tabela);
            
            //Adiciona os paragrafos ao documento
            documentPDF.add(cabecalho);
            documentPDF.add(corpo);
            documentPDF.close();

        } catch (DocumentException e) {
            
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
	}
	
}