import controller.BancoDeDados;
import controller.GerenciaCardapio;
import controller.GerenciaProdutos;
import view.ListagemView;

public class mainNando {

	public static void main(String[] args) {
		ListagemView listagemView
		BancoDeDados bancoDeDados = new BancoDeDados();
		GerenciaProdutos gerenciaProdutos = new GerenciaProdutos();
		GerenciaCardapio gerenciaCardapio = new GerenciaCardapio();
		
		String [] infoProduto = new String[3] ;
		infoProduto[0] = "Carne de Hamburger"; // Nome
		infoProduto[1] = "2"; // Preco
		infoProduto[2] = "10/10/2022"; // Validade
		gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds(), infoProduto, bancoDeDados.getListaFornecedores());
		
		infoProduto[0] = "Alface";
		infoProduto[1] = "2";
		infoProduto[2] = "10/10/2022";
		gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds(), infoProduto, bancoDeDados.getListaFornecedores());
		
		infoProduto[0] = "Tomate";
		infoProduto[1] = "2";
		infoProduto[2] = "10/10/2022";
		gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds(), infoProduto, bancoDeDados.getListaFornecedores());
		
		infoProduto[0] = "P�o";
		infoProduto[1] = "2";
		infoProduto[2] = "10/10/2022";
		gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds(), infoProduto,  bancoDeDados.getListaFornecedores());
		
		
		/*
		String [] infoPrato = new String[5] ;
		infoPrato[0] = "Hamburguer Comum"; // Nome
		infoPrato[1] = "10.5"; // Preco;
		infoPrato[2] = "Um delicioso hamburger comum"; // Descricao
		infoPrato[3] = "Lanche"; // Categoria
		infoPrato[4] = "Carne de Hamburger, P�o, Alface, Tomate"; // Produtos
		gerenciaCardapio.cadastrarPrato(bancoDeDados.getCardapio(), bancoDeDados.getListaIds(), bancoDeDados.getListaProdutos(), infoPrato
		*/
	}

}
