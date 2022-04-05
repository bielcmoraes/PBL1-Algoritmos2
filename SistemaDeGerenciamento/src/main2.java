
import java.time.LocalDate;
import java.util.ArrayList;

import controller.BancoDeDados;
import controller.GerenciaCardapio;
import controller.GerenciaProdutos;
import controller.GerenciaVendas;
import controller.Login;
import model.Fornecedor;
import model.Gerente;
import model.Prato;
import model.Produto;
import view.ListagemView;

public class main2 {

	public static void main(String[] args) {
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		ListagemView listagemView = new ListagemView();
		// Testes Gerenciamento Produtos

		GerenciaProdutos gerenciaProdutos = new GerenciaProdutos();
		//System.out.println("TESTE CADASTRO\n");
		gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds());
		//gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds());
		//gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds());
		//listagemView.listarProduto(bancoDeDados.getListaProdutos());
		//System.out.println("\nTESTE EDICAO\n");
		//gerenciaProdutos.editarProduto(bancoDeDados.getListaProdutos());
		//listagemView.listarProduto(bancoDeDados.getListaProdutos());
		//System.out.println("\nTESTE EXCLUSAO\n");
		//gerenciaProdutos.excluirProduto(bancoDeDados.getListaProdutos());
		//listagemView.listarProduto(bancoDeDados.getListaProdutos());
		
		// Testes Gerenciamento Cardapio
		
		GerenciaCardapio gerenciaCardapio = new GerenciaCardapio();
		//System.out.println("TESTE CADASTRO\n");
		gerenciaCardapio.cadastrarPrato(bancoDeDados.getCardapio(), bancoDeDados.getListaIds(), bancoDeDados.getListaProdutos());
		//listagemView.mostrarCardapio(bancoDeDados.getCardapio());
		//System.out.println("\nTESTE EDICAO\n");
		//gerenciaCardapio.editarPrato(bancoDeDados.getCardapio(), bancoDeDados.getListaProdutos());
		//listagemView.mostrarCardapio(bancoDeDados.getCardapio());
		//System.out.println("\nTESTE EXCLUSAO\n");
		//gerenciaCardapio.excluirPrato(bancoDeDados.getCardapio());
		//listagemView.mostrarCardapio(bancoDeDados.getCardapio());
		
		// Testes Gerenciamento Vendas
		
		GerenciaVendas gerenciaVendas = new GerenciaVendas();
		
		//System.out.println("TESTE CADASTRO\n");
		gerenciaVendas.cadastrarVenda(bancoDeDados.getListaVendas(), bancoDeDados.getListaIds(), bancoDeDados.getCardapio());
		listagemView.listarVenda(bancoDeDados.getListaVendas());
		//System.out.println("\nTESTE EDICAO\n");
		gerenciaVendas.editarVenda(bancoDeDados.getListaVendas(), bancoDeDados.getCardapio());
		listagemView.listarVenda(bancoDeDados.getListaVendas());
		//System.out.println("\nTESTE EXCLUSAO\n");
		gerenciaVendas.excluirVenda(bancoDeDados.getListaVendas());
		listagemView.listarVenda(bancoDeDados.getListaVendas());
		
	}

}
