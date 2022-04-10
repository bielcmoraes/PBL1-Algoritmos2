package model;

import java.util.ArrayList;

import controller.GerenciaVendas;
import controller.ListagemCopyable;
import controller.VendaCopyable;
import view.ListagemView;
/**Classe para objetos do tipo Funcionario, onde são contidos, valores e metódos necessários para a implementação da classe.
 * 
 * @author Gabriel Moraes e Luis Fernando Cintra
 *
 */
public class Funcionario extends Usuario implements VendaCopyable, ListagemCopyable{
	
	/**O construtor inicializa o costrutor da classe herdada e atribui a cada variável da classe os respectivos valores fornecidos como parâmetro.
	 * 
	 * @param listaIds Lista de id's
	 * @param nome Nome do funcionário
	 * @param login Login do funcionário
	 * @param senha Senha do funcionário
	 */
	public Funcionario(ArrayList<String> listaIds, String nome, String login, String senha) {
		super(listaIds, nome, login, senha);
	}
	
	/**Metódo para instanciar um objeto do tipo GerenciaVendas e retornar o método cadastrarVenda.
	 * @param listaVendas Lista de vendas
	 * @param listaIds Lista de id's
	 * @param cardapio Cardapio (lista de pratos)
	 * @param info Entradas do usuário
	 * @return Boolean cadastrarVenda
	 */
	@Override
	public boolean cadastrarVenda(ArrayList<Venda> listaVendas, ArrayList<String> listaIds, ArrayList<Prato> cardapio,
			String[] info) {
		GerenciaVendas gerenciamentoVendas = new GerenciaVendas();
		return gerenciamentoVendas.cadastrarVenda(listaVendas, listaIds, cardapio, info);
	}
	
	/**Metódo para instanciar um objeto do tipo GerenciaVendas e retornar o método editarVenda.
	 * @param listaVendas Lista de vendas
	 * @param cardapio Cardapio (lista de pratos)
	 * @param codigoVenda Id da venda que deseja editar
	 * @param info Entradas do Usuario
	 * @return Boolean editarVenda
	 */
	@Override
	public boolean editarVenda(ArrayList<Venda> listaVendas, ArrayList<Prato> cardapio, String codigoVenda,
			String[] info) {
		GerenciaVendas gerenciamentoVendas = new GerenciaVendas();
		return gerenciamentoVendas.editarVenda(listaVendas, cardapio, codigoVenda, info);
	}
	
	/**Metódo para instanciar um objeto do tipo GerenciaVendas e retornar o método excluirVenda.
	 * @param listaVendas Lista de vendas
	 * @param listaIds Lista de ids
	 * @param codigoVenda Id da venda que deseja editar
	 * @return Boolean excluirVenda
	 */
	@Override
	public boolean excluirVenda(ArrayList<Venda> listaVendas, ArrayList<String> listaIds, String codigoVenda) {
		GerenciaVendas gerenciamentoVendas = new GerenciaVendas();
		return gerenciamentoVendas.excluirVenda(listaVendas, listaIds, codigoVenda);
	}
	
	/**Metódo para instanciar um objeto do tipo ListagemView.
	 * @param cardapio Cardapio (lista de pratos)
	 */
	@Override
	public void mostrarCardapio(ArrayList<Prato> cardapio) {
		ListagemView listagemView = new ListagemView();
		listagemView.mostrarCardapio(cardapio);
	}
	
	/**Metódo para instanciar um objeto do tipo ListagemView.
	 * @param listaFornecedor Lista de Fornecedores
	 */
	@Override
	public void listarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		ListagemView listagemView = new ListagemView();
		listagemView.listarFornecedor(listaFornecedores);
	}
	
	/**Metódo para instanciar um objeto do tipo ListagemView.
	 * @param listaProduto Lista de produtos
	 * @return listarProduto
	 */
	@Override
	public void listarProduto(ArrayList<Produto> listaProdutos) {
		ListagemView listagemView = new ListagemView();
		listagemView.listarProduto(listaProdutos);	
	}
	
	/**Metódo para instanciar um objeto do tipo ListagemView e retornar o método listarUsuario.
	 * @param listaUsuarios Lista de usuários
	 */
	@Override
	public void listarUsuario(ArrayList<Usuario> listaUsuarios) {
		ListagemView listagemView = new ListagemView();
		listagemView.listarUsuario(listaUsuarios);
	}
	
	/**Metódo para instanciar um objeto do tipo ListagemView e retornar o método listarVenda.
	 * @param listaVendas Lista de vendas
	 */
	@Override
	public void listarVenda(ArrayList<Venda> listaVendas) {
		ListagemView listagemView = new ListagemView();
		listagemView.listarVenda(listaVendas);
	}
		
}
