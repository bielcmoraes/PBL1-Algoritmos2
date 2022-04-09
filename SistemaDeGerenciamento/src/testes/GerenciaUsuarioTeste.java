package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import controller.BancoDeDados;
import controller.GerenciaUsuario;
import model.Funcionario;
import model.Gerente;
import model.Usuario;

class GerenciaUsuarioTeste {
	
	@Test
	void cadastrandoGerenteComListaUsuarioNaoInstanciada() {
		BancoDeDados bd  = new BancoDeDados();
		GerenciaUsuario gu = new GerenciaUsuario();
		String [] info = new String[4];
		info[0] = "User1";
		info[1] = "1";
		info[2] = "login";
		info[3] = "senha";
		assertFalse(gu.cadastrarUsuario(null, bd.getListaIds(), info), "Cadastrando gerente com lista de gerente não instanciada");
	}

	@Test
	void cadastrandoFuncionarioComListaUsuarioNaoInstanciada() {
		BancoDeDados bd  = new BancoDeDados();
		GerenciaUsuario gu = new GerenciaUsuario();
		String [] info = new String[4];
		info[0] = "User1";
		info[1] = "2";
		info[2] = "login";
		info[3] = "senha";
		assertFalse(gu.cadastrarUsuario(null, bd.getListaIds(), info),"Cadastrando funcionario com lista de funcionarios não instanciada");
	}
	
	@Test
	void cadastrandoGerenteComListaIdsNaoInstanciada() {
		BancoDeDados bd  = new BancoDeDados();
		GerenciaUsuario gu = new GerenciaUsuario();
		String [] info = new String[4];
		info[0] = "User1";
		info[1] = "1";
		info[2] = "login";
		info[3] = "senha";
		assertFalse(gu.cadastrarUsuario(bd.getListaUsuarios(), null, info), "Cadastrando gerente com lista de Ids não instanciada");
	}
	
	@Test
	void cadastrandoFuncionarioComListaIdsNaoInstanciada() {
		BancoDeDados bd  = new BancoDeDados();
		GerenciaUsuario gu = new GerenciaUsuario();
		String [] info = new String[4];
		info[0] = "User1";
		info[1] = "2";
		info[2] = "login";
		info[3] = "senha";
		assertFalse(gu.cadastrarUsuario(bd.getListaUsuarios(), null, info),"Cadastrando funcionario com lista de Ids não instanciada");
	}
	
	@Test
	void cadastrandoVariosGerentesMesmoLogin(){
		BancoDeDados bd  = new BancoDeDados();
		GerenciaUsuario gu = new GerenciaUsuario();
		Usuario g1 = new Gerente();
		String [] info = new String[4];
		info[0] = "User1";
		info[1] = "1";
		info[2] = "admin";
		info[3] = "admin";
		
		bd.getListaUsuarios().add(g1);
		assertFalse(gu.cadastrarUsuario(bd.getListaUsuarios(), bd.getListaIds(), info), "Cadastrando gerente com mesmo login");
		
	}
	
	@Test
	void cadastrandoVariosFuncionariosMesmoLogin(){
		BancoDeDados bd  = new BancoDeDados();
		GerenciaUsuario gu = new GerenciaUsuario();
		Usuario f1 = new Funcionario(bd.getListaIds(), "Abacaxi", "admin", "admin");
		bd.getListaUsuarios().add(f1);
		
		String [] info = new String[4];
		info[0] = "User1";
		info[1] = "2";
		info[2] = "admin";
		info[3] = "admin";
		assertFalse(gu.cadastrarUsuario(bd.getListaUsuarios(), bd.getListaIds(), info), "Cadastrando funcionario com mesmo login");
	}
	
	@Test
	void cadastrandoGerenteComSucesso(){
		BancoDeDados bd  = new BancoDeDados();
		GerenciaUsuario gu = new GerenciaUsuario();
		String [] info = new String[4];
		info[0] = "Pernalonga";
		info[1] = "1";
		info[2] = "velhinho";
		info[3] = "queqha";
		assertTrue(gu.cadastrarUsuario(bd.getListaUsuarios(), bd.getListaIds(), info), "Cadastrando gerente com mesmo login");
		
	}
	
	@Test
	void cadastrandoFuncionarioComSucesso(){
		BancoDeDados bd  = new BancoDeDados();
		GerenciaUsuario gu = new GerenciaUsuario();
		String [] info = new String[4];
		info[0] = "Patolino";
		info[1] = "2";
		info[2] = "omago";
		info[3] = "pato";
		assertTrue(gu.cadastrarUsuario(bd.getListaUsuarios(), bd.getListaIds(), info), "Cadastrando gerente com mesmo login");
		
	}
}
