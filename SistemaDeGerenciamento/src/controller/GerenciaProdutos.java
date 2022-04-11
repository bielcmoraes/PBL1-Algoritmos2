package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.Produto;
import model.ProdutoCopyable;
import view.ProdutosView;

public class GerenciaProdutos implements ProdutoCopyable {

	@Override
	public boolean cadastrarProduto(ArrayList<Produto> listaProdutos, ArrayList<String> listaIds, String [] info) {
		
		Double preco;
		try {
			preco = Double.parseDouble(info[1]);
		} catch (java.lang.NumberFormatException a) {
			return false;
		}
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate validade;
		try {
			validade = LocalDate.parse(info[2], formatoData);
		} catch (java.time.format.DateTimeParseException a) {
			return false;
		}
		
		Produto novoProduto = new Produto(listaIds, info[0], preco, validade);
		
		try {
			listaProdutos.add(novoProduto);
			return true;
		} 
		catch(ArrayIndexOutOfBoundsException a){
			return false;
		}
	}

	@Override
	public boolean editarProduto(ArrayList<Produto> listaProdutos, String codigoProduto, String [] info) {
		
		try {
			for(Produto produto : listaProdutos) {
				if(codigoProduto.equals(produto.getId())) {
					
					produto.setNome(info[0]);
					Double preco;
					try {
						preco = Double.parseDouble(info[1]);
					} catch (java.lang.NumberFormatException a) {
						return false;
					}
					DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate validade;
					try {
						validade = LocalDate.parse(info[2], formatoData);
					} catch (java.time.format.DateTimeParseException a) {
						return false;
					}
					produto.setPreco(preco);
					produto.setValidade(validade);
		
					return true;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a){
		}
		return false;
	}

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
