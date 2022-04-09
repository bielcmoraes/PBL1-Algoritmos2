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
		System.out.println("\n");
		System.out.println("============");
		System.out.println("= CARDAPIO =");
		System.out.println("============");
		System.out.format("%-15s %-30s %-15s %-50s %-15s %-50s\n", "ID", "NOME","PRECO", "DESCRICAO", "CATEGORIA", "PRODUTOS");
		for(Prato prato: cardapio) {
			String produtos = "";
			for(Produto produto : prato.getProdutos()) {
				produtos += produto.getNome() + ", ";
			}
			produtos = produtos.substring(0, produtos.length()-2);
			System.out.format("%-15s %-30s R$ %-12.2f %-50s %-15s %-50s\n", 
					prato.getId(), 
					prato.getNome(), 
					prato.getPreco(),
					prato.getDescricao(),
					prato.getCategoria(),
					produtos);
		}
		
	}

	@Override
	public void listarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		System.out.println("\n");
		System.out.println("================");
		System.out.println("= FORNECEDORES =");
		System.out.println("===============");
		System.out.format("%-15s %-50s\n", "ID", "NOME", "CNPJ", "ENDERECO");
		for(Fornecedor fornecedor: listaFornecedores) {
			System.out.format("%-15s %-50s %-30s %-50s\n", 
					fornecedor.getId(), 
					fornecedor.getNome(),
					fornecedor.getCnpj(),
					fornecedor.getEndereco());
		}
	}

	@Override
	public void listarProduto(ArrayList<Produto> listaProdutos) {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("\n");
		System.out.println("============");
		System.out.println("= PRODUTOS =");
		System.out.println("============");
		System.out.format("%-15s %-15s %-15s %-15s\n", "ID", "NOME","PRECO", "VALIDADE");
		for(Produto produto: listaProdutos) {
			System.out.format("%-15s %-15s R$ %-12.2f %-15s\n", 
					produto.getId(), 
					produto.getNome(), 
					produto.getPreco(),
					produto.getValidade().format(formatoData));
		}
		
	}

	@Override
	public void listarUsuario(ArrayList<Usuario> listaUsuarios) {
		System.out.println("\n");
		System.out.println("============");
		System.out.println("= USUARIOS =");
		System.out.println("============");
		System.out.format("%-15s %-50s\n", "ID", "NOME");
		for(Usuario usuario: listaUsuarios) {
			System.out.format("%-15s %-50s\n", 
					usuario.getId(), 
					usuario.getNome());
		}
	}

	@Override
	public void listarVenda(ArrayList<Venda> listaVendas) {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("\n");
		System.out.println("==========");
		System.out.println("= VENDAS =");
		System.out.println("==========");
		System.out.format("%-15s %-15s %-15s %-50s %-15s %-15s\n", "ID", "DATA","HORARIO", "PRATOS", "PRECO TOTAL", "METODO DE PAGAMENTO");
		for(Venda venda: listaVendas) {
			String pratos = "";
			for(Prato prato : venda.getPratos()) {
				pratos += prato.getNome() + ", ";
			}
			pratos = pratos.substring(0, pratos.length()-2);
			System.out.format("%-15s %-15s %-15s %-50s R$ %-12.2f %-15s\n", 
					venda.getId(), 
					venda.getData().format(formatoData), 
					venda.getHorario(),
					pratos,
					venda.getPrecoTotal(),
					venda.getMetodoDePagamento());
		}
		
	}

}
