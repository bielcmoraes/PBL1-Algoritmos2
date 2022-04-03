package view;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import controller.ListagemCopyable;
import model.Fornecedor;
import model.Prato;
import model.Produto;
import model.Usuario;
import model.Venda;

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
		System.out.println("Produtos");
		System.out.format("%-15s %-15s %-15s %-15s\n", "ID", "NOME","PRECO", "VALIDADE");
		for(Produto produto: listaProdutos) {
			DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			System.out.format("%-15s %-15s R$ %-12.2f %-15s\n", 
					produto.getId(), 
					produto.getNome(), 
					produto.getPreco(),
					produto.getValidade().format(formatoData));
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
