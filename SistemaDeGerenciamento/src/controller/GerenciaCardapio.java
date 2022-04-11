package controller;


import java.util.ArrayList;

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
	 * @param cardapio Lista de pratos
	 * @param listaIds Lista de id's
	 * @param listaProdutos Lista de produtos
	 * @param info Entrada do usuário
	 * @return
	 */
	@Override
	public boolean cadastrarPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds, ArrayList<Produto> listaProdutos, String [] info) {
		
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
		
		Prato novoPrato = new Prato(listaIds, info[0], preco, info[2], info[3], produtos);
		
		try {
			cardapio.add(novoPrato);
			return true;
		} 
		catch(ArrayIndexOutOfBoundsException a){
			return false;
		}
	}

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
