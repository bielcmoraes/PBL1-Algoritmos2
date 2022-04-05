package model;

import java.util.ArrayList;

import controller.CardapioCopyable;
import controller.FornecedorCopyable;
import controller.GerenciaCardapio;
import controller.GerenciaFornecedor;
import controller.GerenciaUsuario;
import controller.UsuarioCopyable;

public class Gerente extends Usuario implements FornecedorCopyable, UsuarioCopyable, CardapioCopyable{
	
	//Atributos
	
	//Construtores
	public Gerente() {
		super();
	}
	
	public Gerente(ArrayList<String> listaIds, String nome, String login, String senha) {
		super(listaIds, nome, login, senha);
	}
	
	//Metodos do gerenciamento de fornecedores
	@Override
	public boolean cadastrarFornecedor(ArrayList<Fornecedor> listaFornecedores, ArrayList<String> listaIds) {
		
		GerenciaFornecedor gerenciamentoFornecedor = new GerenciaFornecedor();
		return gerenciamentoFornecedor.cadastrarFornecedor(listaFornecedores, listaIds);
	}

	@Override
	public boolean editarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		
		GerenciaFornecedor gerenciamentoFornecedor = new GerenciaFornecedor();
		return gerenciamentoFornecedor.editarFornecedor(listaFornecedores);
	}

	@Override
	public boolean excluirFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		
		GerenciaFornecedor gerenciamentoFornecedor = new GerenciaFornecedor();
		return gerenciamentoFornecedor.excluirFornecedor(listaFornecedores);
	}
	
	//Metodos do gerenciamento de Usuario
	@Override
	public boolean cadastrarUsuario(ArrayList<Usuario> listaUsuarios, ArrayList<String> listaIds) {
		//Istancia o gerenciamento de usuario
		GerenciaUsuario gerenciamentoUsuario = new GerenciaUsuario();
		//Retorna o cadastro de usuari0
		return gerenciamentoUsuario.cadastrarUsuario(listaUsuarios, listaIds);
	}

	@Override
	public boolean editarUsuario(ArrayList<Usuario> listaUsuarios) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluirUsuario(ArrayList<Usuario> listaUsuarios) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cadastrarPrato(ArrayList<Prato> cardapio, ArrayList<String> listaIds) {
		GerenciaCardapio g1 = new GerenciaCardapio();
		g1.cadastrarPrato(cardapio, listaIds);
		return false;
	}

	@Override
	public boolean editarPrato(ArrayList<Prato> cardapio) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean excluirPrato(ArrayList<Prato> cardapio) {
		// TODO Auto-generated method stub
		return false;
	}


}