package PreCadastro;

import java.util.ArrayList;
import java.util.HashMap;

import controller.BancoDeDados;
import controller.GerenciaCardapio;
import controller.GerenciaFornecedor;
import controller.GerenciaProdutos;
import exceptions.ProdutoNaoCadastrado;
import model.Prato;
import model.Produto;

public class PreCadastro {
	
	public void PreCadastrarProdutos (BancoDeDados bancoDeDados) {
		GerenciaProdutos gerenciaProdutos = new GerenciaProdutos();
		
		String [] info = new String[5];
		info[0] = "Batata";//nome;
		info[1] = "10";//preco;
		info[2] = "100 kg";//quantidade;
		info[3] = "10/10/2022";//validade;
		info[4] = "Joao";//fornecedores;
		gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds(), info, bancoDeDados.getListaFornecedores());
		
		info[0] = "Leite";//nome;
		info[1] = "12";//preco;
		info[2] = "30 l";//quantidade;
		info[3] = "20/10/2022";//validade;
		info[4] = "Maria";//fornecedores;
		gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds(), info, bancoDeDados.getListaFornecedores());
		
		info[0] = "Pao";//nome;
		info[1] = "0.5";//preco;
		info[2] = "50 un";//quantidade;
		info[3] = "15/09/2022";//validade;
		info[4] = "Jose";//fornecedores;
		gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds(), info, bancoDeDados.getListaFornecedores());
		
		info[0] = "Salsicha";//nome;
		info[1] = "2";//preco;
		info[2] = "50 un";//quantidade;
		info[3] = "20/08/2022";//validade;
		info[4] = "Jose";//fornecedores;
		gerenciaProdutos.cadastrarProduto(bancoDeDados.getListaProdutos(), bancoDeDados.getListaIds(), info, bancoDeDados.getListaFornecedores());
	}
	
	public void PreCadastrarFornecedores (BancoDeDados bancoDeDados) {
		GerenciaFornecedor gerenciaFornecedor = new GerenciaFornecedor();
		
		String [] info = new String[3];
		info[0] = "Joao";//nome;
		info[1] = "77.994.900/0001-26";//cnpj;
		info[2] = "Rua A";//endereco;
		gerenciaFornecedor.cadastrarFornecedor(bancoDeDados.getListaFornecedores(), bancoDeDados.getListaIds(), info);
		
		info[0] = "Maria";//nome;
		info[1] = "37.889.838/0001-98";//cnpj;
		info[2] = "Rua B";//endereco;
		gerenciaFornecedor.cadastrarFornecedor(bancoDeDados.getListaFornecedores(), bancoDeDados.getListaIds(), info);
		
		info[0] = "Jose";//nome;
		info[1] = "37.889.838/0001-98";//cnpj;
		info[2] = "Rua C";//endereco;
		gerenciaFornecedor.cadastrarFornecedor(bancoDeDados.getListaFornecedores(), bancoDeDados.getListaIds(), info);
	}
	
	public void PreCadastrarPratos (BancoDeDados bancoDeDados) {
		GerenciaCardapio gerenciaCardapio = new GerenciaCardapio();
		
		String [] info = new String[5];
		
		info[0] = "Cachorro Quente";//nome;
		info[1] = "12";//preco;
		info[2] = "Cachorro Quente Simples";//descricao;
		info[3] = "Lanche";//categoria;
		info[4] = "1;un;Salsicha;1;un;Pao;";//ingredientes;
		try {
			gerenciaCardapio.cadastrarPrato(bancoDeDados.getCardapio(), bancoDeDados.getListaIds(), bancoDeDados.getListaProdutos(), info);
		} catch (NumberFormatException e) {
			
		} catch (ProdutoNaoCadastrado e) {
			
		}
		
		info[0] = "Pure de Batata";//nome;
		info[1] = "5";//preco;
		info[2] = "Pure de Batata Simples";//descricao;
		info[3] = "Acompanhamento";//categoria;
		info[4] = "0.5;kg;Batata;0.5;l;Leite;";//ingredientes;
		try {
			gerenciaCardapio.cadastrarPrato(bancoDeDados.getCardapio(), bancoDeDados.getListaIds(), bancoDeDados.getListaProdutos(), info);
		} catch (NumberFormatException e) {
			
		} catch (ProdutoNaoCadastrado e) {
			
		}
		
		
	}
}