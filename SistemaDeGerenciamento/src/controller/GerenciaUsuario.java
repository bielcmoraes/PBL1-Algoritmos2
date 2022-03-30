package controller;

import java.util.ArrayList;

import modelos.Usuario;
import view.UsuarioView;

public class GerenciaUsuario implements UsuarioCopyable {

	@Override
	public boolean cadastrarUsuario(ArrayList<Usuario> listaUsuarios) {
		String [] infoUsuario = UsuarioView.cadastraUsuario();
		if(infoUsuario[2] == "1") {
			Gerente novoGerente = new Gerente(infoUsuario[0], infoUsuario[1]);
			listaUsuarios.add(novoGerente);
			return true;
		}else if(infoUsuario[2] == "2"){
			Funcionario novoFuncionario = new Funcionario(infoUsuario[0], infoUsuario[1]);
			listaUsuarios.add(novoFuncionario);
			return true;
		}
		return false;
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
