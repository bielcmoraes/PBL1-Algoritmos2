package controller;

import java.util.ArrayList;

import model.Fornecedor;
import model.Usuario;
import view.FornecedorView;
import view.UsuarioView;

public class GerenciaUsuario implements UsuarioCopyable {

	@Override
	public boolean cadastrarUsuario(ArrayList<Usuario> listaUsuarios) {
		String [] infoUsuario = UsuarioView.cadastraUsuario();
		if(infoUsuario[3] == "1") {
			//Cria um novo Gerente e adiciona na lista
			Gerente novoGerente = new Gerente(infoUsuario[0], infoUsuario[1], infoUsuario[2]);
			listaUsuarios.add(novoGerente);
			return true;
			
		}else if(infoUsuario[3] == "2"){
			//Cria um novo Funcionario e adiciona na lista
			Funcionario novoFuncionario = new Funcionario(infoUsuario[0], infoUsuario[1], infoUsuario[2]);
			listaUsuarios.add(novoFuncionario);
			return true;
		}
		return false;
	}

	@Override
	public boolean editarUsuario(ArrayList<Usuario> listaUsuarios) {
		
		String codigoUsuario = UsuarioView.buscaUsuario();
		try {
			for(Usuario usuario : listaUsuarios) {
				if(usuario.getId() == codigoUsuario) {
					String [] info = FornecedorView.cadastrarFornecedor();
					usuario.setNome(info[0]);
					usuario.setSenha(info[1]);
					return true;
				}else {
					System.out.println("Código de usuario não encontrado!!!");
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Usuario não editado!!!");
			System.out.println("Erro com o array");
		}
		return false;
	}

	@Override
	public boolean excluirUsuario(ArrayList<Usuario> listaUsuarios) {
		
		String codigoUsuario = UsuarioView.buscaUsuario();
		
		try {
			for(Usuario usuario : listaUsuarios) {
				if(usuario.getId() == codigoUsuario) {
					int index = listaUsuarios.indexOf(usuario);
					listaUsuarios.remove(index);
					return true;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Usuario não removido!!!");
			System.out.println("Erro no array");
		}
		return false;
	}

}
