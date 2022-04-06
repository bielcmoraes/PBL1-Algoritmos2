package controller;


import java.util.ArrayList;

import model.Prato;
import model.Produto;
import view.CardapioView;
import view.ProdutosView;

public class GerenciaCardapio implements CardapioCopyable {

	@Override
	public boolean cadastrarPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds, ArrayList<Produto> listaProdutos, String [] info) {
		
		Double preco;
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		try {
			preco = Double.parseDouble(info[1]);
		} catch (java.lang.NumberFormatException a) {
			System.out.println("Prato nao cadastrado!!!");
			System.out.println("Preco invalido");
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
			System.out.println("Prato nao cadastrado!!!");
			System.out.println("Produtos invalidos");
			return false;
		}
		
		Prato novoPrato = new Prato(listaIds, info[0], preco, info[2], info[3], produtos);
		
		try {
			cardapio.add(novoPrato);
			return true;
		} 
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Prato nao cadastrado!!!");
			System.out.println("Problema ao acessar o ArrayList");
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
						System.out.println("Prato nao editado!!!");
						System.out.println("Preco invalido");
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
						System.out.println("Prato nao cadastrado!!!");
						System.out.println("Produtos invalidos");
						return false;
					}
						
					prato.setNome(info[0]);
					prato.setPreco(preco);
					prato.setDescricao(info[2]);
					prato.setCategoria(info[3]);
					return true;
				}
			}
			System.out.println("Codigo de prato nao encontrado!!!");
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Prato nao editado!!!");
			System.out.println("Erro com o array");
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
			System.out.println("Codigo de prato nao encontrado!!!");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Prato nao removido!!!");
			System.out.println("Erro no array");
		}
		return false;
	}
}
