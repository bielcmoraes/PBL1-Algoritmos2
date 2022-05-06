package testes;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lowagie.text.Table;

import exceptions.ErroGrave;
import exceptions.RelatorioNaoGerado;
import model.BancoDeDados;
import model.GeraRelatorio;
import model.GeraTabela;
import model.Produto;

class GeraTabelaTest {
	
	private BancoDeDados bd = new BancoDeDados();
	GeraTabela gt = new GeraTabela();
	@BeforeEach
	
	@Test
	void estoqueTotalComListaDeProdutosNull() {
		assertThrows(ErroGrave.class, () -> gt.estoqueTotal(null), "Tentando gerar tabela de estoque total com lista não instanciada");	
	}
	
	@Test
	void estoquePorProdutoComListaDeProdutosNull() {
		assertThrows(ErroGrave.class, () -> gt.estoquePorProduto(null), "Tentando gerar tabela de estoque por produto com lista não instanciada");	
	}
	
	@Test
	void estoqueProdutosPertoDeVencer() {
		assertThrows(NullPointerException.class, () -> gt.estoqueProdutosPertoDeVencer(null), "Tentando gerar tabela de estoque produtos perto de vencer com lista não instanciada");	
	}
	
	@Test
	void estoqueProdutosVencidos() {
		assertThrows(NullPointerException.class, () -> gt.estoqueProdutosVencidos(null), "Tentando gerar tabela de estoque produtos vencidos com lista não instanciada");	
	}
	
	@Test
	void fornecedorPorProduto() {
		assertThrows(ErroGrave.class, () -> gt.fornecedorPorFornecedor(null), "Tentando gerar tabela de fornecedor por produto com lista não instanciada");	
	}
	
	@Test
	void fornecedorPorFornecedor() {
		assertThrows(ErroGrave.class, () -> gt.fornecedorPorFornecedor(null), "Tentando gerar tabela de fornecedor por fornecedor com lista não instanciada");	
	}
	
	@Test
	void vendasTotal() {
		assertThrows(ErroGrave.class, () -> gt.vendasTotal(null), "Tentando gerar tabela de vendas totais com lista não instanciada");	
	}
	
	@Test
	void vendasDiarias() {
		assertThrows(ErroGrave.class, () -> gt.vendasDiarias(null), "Tentando gerar tabela de vendas diarias com lista não instanciada");	
	}
	
	@Test
	void vendasSemanal() {
		assertThrows(ErroGrave.class, () -> gt.vendasSemanal(null), "Tentando gerar tabela de vendas semanal com lista não instanciada");	
	}
	
	@Test
	void vendasMensais() {
		assertThrows(ErroGrave.class, () -> gt.vendasMensais(null), "Tentando gerar tabela de vendas mensais com lista não instanciada");	
	}
	
	@Test
	void vendasPorTipoDePrato() {
		assertThrows(ErroGrave.class, () -> gt.vendasPorTipoDePrato(null), "Tentando gerar tabela de vendas por tipo de prato com lista não instanciada");	
	}
}
