package controller;


import java.util.ArrayList;

import exceptions.ProdutoNaoCadastrado;
import model.CardapioCopyable;
import model.Prato;
import model.Produto;

/**Classe responsável por implementar os metódos de cadastrar, editar e excluir pratos da classe CardapioCopyable.
 * 
 * @author Gabriel Moraes e Luis Fernando Cintra
 *
 */
public class GerenciaCardapio implements CardapioCopyable {
	
	/**
	 * O método é responsável por cadastrar um objeto do tipo Prato em uma ArrayList<Prato>.
	 * Esse cadastro só ocorre caso todos os dados passados atraves da String []
	 * possam ser convertidos para seus respectivos tipos correspondente.
	 * @param cardapio Lista de Pratos
	 * @param listaIds Lista de IDs
	 * @param listaProdutos Lista de Produtos
	 * @param info Lista com as entradas do usuario
	 * @return true caso o cadastro ocorra corretamente, false caso ocorra algum problema durante o processo.
	 * @throws ProdutoNaoCadastrado 
	 */
	@Override
	public boolean cadastrarPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds, ArrayList<Produto> listaProdutos, String [] info) throws NumberFormatException, ProdutoNaoCadastrado{
		
		Double preco;
		preco = Double.parseDouble(info[1]);
		
		String [] ingredientes = info[4].split(";");
		boolean produtoCadastrado;
		if (ingredientes.length > 0) {
			for (int i = 2; i < ingredientes.length; i+=3) {
				produtoCadastrado = false;
				for (Produto produto : listaProdutos) {
					if (ingredientes[i].equals(produto.getNome())) {
						produtoCadastrado = true;
						break;
					}
				}
				if (produtoCadastrado == false) {
					throw new ProdutoNaoCadastrado(ingredientes[i]);
				}
			}
			Prato novoPrato = new Prato(listaIds, info[0], preco, info[2], info[3], ingredientes);
			cardapio.add(novoPrato);
			return true;
		} else {
			return false;
		}	
	}
	/**
	 * O método é responsável por editar um objeto do tipo Prato em uma ArrayList<Prato>.
	 * Essa edição só ocorre caso todos os dados passados atraves da String []
	 * possam ser convertidos para seus respectivos tipos correspondente
	 * e o prato a ser editado possa ser encontrada na lista de pratos.
	 * @param cardapio Lista de Pratos
	 * @param listaProdutos Lista de Produtos
	 * @param codigoPrato Codigo do prato a ser editado
	 * @param info Lista com as entradas do usuario
	 * @return true caso a edição ocorra corretamente, false caso ocorra algum problema durante o processo.
	 */
	@Override
	public boolean editarPrato(ArrayList<Prato> cardapio, ArrayList<Produto> listaProdutos, String codigoPrato, String [] info) {
		
		
		try {
			for(Prato prato : cardapio) {
				if(codigoPrato.equals(prato.getId())) {
					Double preco;
					ArrayList<Produto> produtos = new ArrayList<Produto>();
		
					try {
						preco = Double.parseDouble(info[1]);
					} catch (java.lang.NumberFormatException a) {
						return false;
					}
					
					for (String produtoNome : info[4].split(", ")) {
						for (Produto produto : listaProdutos) {
							if (produtoNome.equals(produto.getNome())) {
								produtos.add(produto);
							}
						}
					}
					
					if (produtos.size() != info[4].split(", ").length) {
						return false;
					}
						
					prato.setNome(info[0]);
					prato.setPreco(preco);
					prato.setDescricao(info[2]);
					prato.setCategoria(info[3]);
					return true;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a){
			return false;
		}
		return false;
	}
	/**
	 * O método é responsável por excluir um objeto do tipo Prato em uma ArrayList<Prato>.
	 * Essa exclusão só ocorre caso o prato a ser excluido possa ser encontrada na lista de pratos.
	 * @param cardapio Lista de Pratos
	 * @param listaIds Lista de IDs
	 * @param codigoPrato Codigo do prato a ser excluido
	 * @return true caso a exclusão ocorra corretamente, false caso ocorra algum problema durante o processo.
	 */
	@Override
	public boolean excluirPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds, String codigoPrato) {
		
		try {
			for(Prato prato : cardapio) {
				if(codigoPrato.equals(prato.getId())) {
					int index = cardapio.indexOf(prato);
					cardapio.remove(index);
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
