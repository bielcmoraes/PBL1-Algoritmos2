package testes;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lowagie.text.Table;

import exceptions.ErroGrave;
import model.BancoDeDados;
import model.GeraRelatorio;
import model.Produto;

class GeraRelatorioTest {
	
	@BeforeEach
	void antesDoTeste() {
		BancoDeDados bd = new BancoDeDados();
		HashMap<String, ArrayList<Produto>> lp;
		Table info;
		GeraRelatorio gr = new GeraRelatorio();
		
	}
	
	@Test
	void estoqueTotalComListaDeProdutosNull() {
		assertThrows(NullPointerException.class, () -> gr.estoqueTotal(bd.getListaProdutos()));
		
	}

}
