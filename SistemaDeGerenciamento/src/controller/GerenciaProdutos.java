package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.Fornecedor;
import model.Prato;
import model.Produto;
import model.ProdutoCopyable;

/**Classe responsável por implementar os metódos de cadastrar, editar e excluir produto que foram especificados na classe ProdutoCopyable.
 * 
 *  @author Gabriel Moraes e Luis Fernando Cintra
 *
 */
public class GerenciaProdutos implements ProdutoCopyable {
	/**
	 * O método é responsável por cadastrar um objeto do tipo Produto em uma ArrayList<Produto>.
	 * Esse cadastro só ocorre caso todos os dados passados atraves da String []
	 * possam ser convertidos para seus respectivos tipos correspondente.
	 * @param listaProdutos Lista de Produtos
	 * @param listaIds Lista de IDs
	 * @param info Lista com as entradas do usuario
	 * @return true caso o cadastro ocorra corretamente, false caso ocorra algum problema durante o processo
	 */
	@Override
	public boolean cadastrarProduto(ArrayList<Produto> listaProdutos, ArrayList<String> listaIds, String [] info, ArrayList<Fornecedor> listaFornecedor) {
		
		Double preco;
		try {
			preco = Double.parseDouble(info[1]);
		} catch (java.lang.NumberFormatException a) {
			return false;
		}
		
		Double quantidade;
		try {
			quantidade = Double.parseDouble(info[2]);
		} catch (java.lang.NumberFormatException a) {
			return false;
		}
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate validade;
		try {
			validade = LocalDate.parse(info[3], formatoData);
		} catch (java.time.format.DateTimeParseException a) {
			return false;
		}
		
		
		ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
		
		//Verifica se o nome do fornecedor passado está na lista de fornecedores.
		//Se o nome for igual adiciona o fornecedor à lista. (Pode existir produtos sem fornecedores)
		for (String fornecedorNome : info[4].split(", ")) {
			for (Fornecedor fornecedor : listaFornecedor) {
				if (fornecedorNome.equals(fornecedor.getNome())) {
					fornecedores.add(fornecedor);
				}
			}
		}
		
		Produto novoProduto = new Produto(listaIds, info[0], preco, quantidade, validade, fornecedores);
		
		try {
			listaProdutos.add(novoProduto);
			return true;
		} 
		catch(ArrayIndexOutOfBoundsException a){
			return false;
		}
	}
	/**
	 * O método é reponsavel por editar as informações de um objeto do tipo Produto já cadastrado em uma ArrayList<Produto>.
	 * Essa edição só ocorre caso todos os dados passados atraves da String [] 
	 * possam ser convertidos para seus respectivos tipos correspondente
	 * e o produto a ser editado possa ser encontrado na lista de produtos.
	 * @param listaProdutos Lista de Produtos
	 * @param codigoProduto Código do Produto a ser editado
	 * @param info Lista com as entradas do usuario
	 * @return true caso a edição ocorra corretamente, false caso ocorra algum problema durante o processo
	 */
	@Override
	public boolean editarProduto(ArrayList<Produto> listaProdutos, String codigoProduto, String [] info, ArrayList<Fornecedor> listaFornecedor) {
		
		try {
			for(Produto produto : listaProdutos) {
				if(codigoProduto.equals(produto.getId())) {
					
					Double preco;
					try {
						preco = Double.parseDouble(info[1]);
					} catch (java.lang.NumberFormatException a) {
						return false;
					}
					
					Double quantidade;
					try {
						quantidade = Double.parseDouble(info[2]);
					} catch (java.lang.NumberFormatException a) {
						return false;
					}
					
					DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate validade;
					try {
						validade = LocalDate.parse(info[3], formatoData);
					} catch (java.time.format.DateTimeParseException a) {
						return false;
					}
					
					ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
					for (String fornecedorNome : info[4].split(", ")) {
						for (Fornecedor fornecedor : listaFornecedor) {
							if (fornecedorNome.equals(fornecedor.getNome())) {
								fornecedores.add(fornecedor);
							}
						}
					}
					
					//Garante que os fornecedores estejam na lista de fornecedores
					if (fornecedores.size() != info[4].split(", ").length) {
						return false;
					}
					
					produto.setNome(info[0]);
					produto.setPreco(preco);
					produto.setQuantidade(quantidade);
					produto.setValidade(validade);
					produto.setFornecedores(fornecedores);
		
					return true;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a){
		}
		return false;
	}
	/**
	 * O método é reponsavel por excluir um objeto do tipo Produto já cadastrado em uma ArrayList<Produto>.
	 * Essa exclusão só ocorre caso o produto a ser excluido seja encontrado na lista de produtos.
	 * @param listaProdutos Lista de Produtos
	 * @param listaIds Lista de IDs
	 * @param codigoProduto Código do Produto a ser editado
	 * @return true caso a edição ocorra corretamente, false caso ocorra algum problema durante o processo
	 */
	@Override
	public boolean excluirProduto(ArrayList<Produto> listaProdutos, ArrayList<String> listaIds, String codigoProduto) {
		
		try {
			for(Produto produto : listaProdutos) {
				if(codigoProduto.equals(produto.getId())) {
					int index = listaProdutos.indexOf(produto);
					listaProdutos.remove(index);
					return true;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a) {
			return false;
		}
		return false;
	}
}
