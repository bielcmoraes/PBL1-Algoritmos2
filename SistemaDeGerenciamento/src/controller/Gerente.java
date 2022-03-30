package controller;

import java.util.ArrayList;

import modelos.Fornecedor;
import modelos.Usuario;

public class Gerente extends Usuario implements FornecedorCopyable, UsuarioCopyable{
	
	//Contrutores
	public Gerente() {
		super();
	}
	
	public Gerente(String login, String senha) {
		super(login, senha);
	}
	
	@Override
	public boolean cadastrarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		
		GerenciaFornecedor gerenciamentoFornecedor = new GerenciaFornecedor();
		return gerenciamentoFornecedor.cadastrarFornecedor(listaFornecedores);
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

	@Override
	public boolean cadastrarUsuario(ArrayList<Usuario> listaUsuarios) {
		//Istancia o gerenciamento de usuario
		GerenciaUsuario gerenciamentoUsuario = new GerenciaUsuario();
		//Retorna o cadastro de usuario
		return gerenciamentoUsuario.cadastrarUsuario(listaUsuarios);
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


}