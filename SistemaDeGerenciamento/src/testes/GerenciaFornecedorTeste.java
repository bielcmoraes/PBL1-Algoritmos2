package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controller.BancoDeDados;
import controller.GerenciaFornecedor;

class GerenciaFornecedorTeste {
	
	@Test
	void cadastrandoUmFornecedor() {
		
		BancoDeDados bd = new BancoDeDados();
		GerenciaFornecedor gf = new GerenciaFornecedor();
		String [] info = new String[3] ;
		info[0] = "Gabriel";
		info[1] = "40028922";
		info[2] = "Rua de cima";
		gf.cadastrarFornecedor(bd.getListaFornecedores(), bd.getListaIds(), info);
		assertSame(1, bd.getListaFornecedores().size(), "Cadastrando 1 fornecedor");
	}
	
	@Test
	void cadastrandoTresFornecedores() {
		
		BancoDeDados bd = new BancoDeDados();
		GerenciaFornecedor gf = new GerenciaFornecedor();
		String [] info = new String[3] ;
		info[0] = "Gabriel";
		info[1] = "40028922";
		info[2] = "Rua de cima";
		gf.cadastrarFornecedor(bd.getListaFornecedores(), bd.getListaIds(), info);
		gf.cadastrarFornecedor(bd.getListaFornecedores(), bd.getListaIds(), info);
		gf.cadastrarFornecedor(bd.getListaFornecedores(), bd.getListaIds(), info);
		
		assertSame(3, bd.getListaFornecedores().size(), "Cadastrando 3 fornecedores");
	}

}
