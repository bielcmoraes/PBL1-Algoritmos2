
import java.util.ArrayList;

import controller.PermissoesGerente;
import controller.BancoDeDados;
import controller.GerenciaProdutos;
import controller.Login;
import model.Fornecedor;
import model.Produto;
import view.ListagemView;

public class main2 {

	public static void main(String[] args) {
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		
		// Testes Gerenciamento Produtos
		
		GerenciaProdutos gerenciaProdutos = new GerenciaProdutos();
		ListagemView listagemView = new ListagemView();
		System.out.println("TESTE CADASTRO\n");
		gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds());
		//gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds());
		//gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds());
		listagemView.listarProduto(bancoDeDados.getListaProdutos());
		//System.out.println("\nTESTE EDICAO\n");
		//gerenciaProdutos.editarProduto(bancoDeDados.getListaProdutos());
		//listagemView.listarProduto(bancoDeDados.getListaProdutos());
		System.out.println("\nTESTE EXCLUSAO\n");
		gerenciaProdutos.excluirProduto(bancoDeDados.getListaProdutos());
		listagemView.listarProduto(bancoDeDados.getListaProdutos());
		
		
	}

}
