package view;

import java.util.ArrayList;

import controller.ListagemCopyable;
import modelos.Fornecedor;
import modelos.Prato;
import modelos.Produto;
import modelos.Usuario;
import modelos.Venda;

public class ListagemView implements ListagemCopyable {

	@Override
	public void mostrarCardapio(ArrayList<Prato> cardapio) {
		for(Prato prato: cardapio) {
			System.out.println(prato.getNome() + "-----" + prato.getPreco());
		}
		
	}

	@Override
	public void listarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		for(Fornecedor fornecedor: listaFornecedores) {
			System.out.println(fornecedor.getNome() + "----- CNPJ: " + fornecedor.getCnpj());
		}
		
	}

	@Override
	public void listarProduto(ArrayList<Produto> listaProdutos) {
		for(Produto produto: listaProdutos) {
			System.out.println(produto.getNome() + "----- Preço: " + produto.getPreco());
		}
		
	}

	@Override
	public void listarUsuario(ArrayList<Usuario> listaUsuarios) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarVenda(ArrayList<Venda> listaVendas) {
		// TODO Auto-generated method stub
		
	}

}
