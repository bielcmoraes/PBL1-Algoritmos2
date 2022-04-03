package controller;

import java.util.ArrayList;

import model.Fornecedor;
import model.Usuario;

public class PermissoesGerente implements FornecedorCopyable, UsuarioCopyable{
	
	//Metodos do gerenciamento de fornecedores
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


}