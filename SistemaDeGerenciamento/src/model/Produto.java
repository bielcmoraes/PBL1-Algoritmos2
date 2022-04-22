package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**Classe para objetos do tipo Produto, onde são contidos, valores e metódos necessarios para implementação da classe.
 * 
 * @author Gabriel Moraes e Luis Fernando Cintra
 * @see Entidade
 */
public class Produto extends Entidade {
	
	// Attributes
	private String nome;
	private Double preco;
	private Double quantidade;
	private LocalDate validade;
	private ArrayList<Fornecedor> fornecedores;
	
	/**O construtor inicializa o construtor da classe herdada e atribui a cada variável da classe os respectivos valores fornecidos como parâmetro. 
	 * 
	 * @param listaIds Lista de id's
	 * @param nome Nome do produto
	 * @param preco Preço do produto
	 * @param validade Validade do produto
	 */
	public Produto(ArrayList<String> listaIds, String nome, Double preco, Double quantidade, LocalDate validade) {
		super(listaIds);
		this.nome = nome;
		this.preco = preco;
		this.setQuantidade(quantidade);
		this.validade = validade;
	}

	/**Metódo para retorno de nome do produto.
	 * @return String Nome do produto*/
	public String getNome() {
		return nome;
	}
	
	/**Metódo para alterar o nome do produto.
	 * @param nome Novo nome do produto*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**Metódo para retorno de preço do produto.
	 * @return Double Preço do produto*/
	public Double getPreco() {
		return preco;
	}
	
	/**Metódo para alterar o preço do produto.
	 * @param preco Novo Preço do produto*/
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	/**Metódo para retorno de quantidade do produto.
	 * @return Double Quantidade do produto*/
	public Double getQuantidade() {
		return quantidade;
	}
	
	/**Metódo para alterar a quantidade do produto.
	 * @param quantidade Nova quantidade de produto*/
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	/**Metódo para retorno de validade do produto.
	 * @return LocalDate Validade do produto*/
	public LocalDate getValidade() {
		return validade;
	}
	
	/**Metódo para alterar a validade do produto.
	 * @param validade Nova validade do produto*/
	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	
	/**Metódo para retorno de lista com os fornecedores do produto.
	 * @return Lista de fornecedoores do produto*/
	public ArrayList<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	
	/**Metódo para alterar a lista de fornecedores do produto.
	 * @param pratos Nova lista de fornecedores do produto*/
	public void setFornecedores(ArrayList<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
}
