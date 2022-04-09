package controller;

import java.util.ArrayList;

import model.Fornecedor;
import model.Funcionario;
import model.Gerente;
import model.Usuario;
import view.FornecedorView;
import view.UsuarioView;

public class GerenciaUsuario implements UsuarioCopyable {

	@Override
	public boolean cadastrarUsuario(ArrayList<Usuario> listaUsuarios, ArrayList<String> listaIds, String [] infoUsuario) {
		
		if(listaUsuarios != null && listaIds != null) {
			
			try {
				//Cria um novo Gerente e adiciona na lista
				if(infoUsuario[1].equals("1")) {
					
					for(Usuario usuario: listaUsuarios) {
						if(usuario.getLogin().equals(infoUsuario[2])) {
							System.out.println("Login repetido");
							return false;
						}
					}
					Usuario novoUsuario = new Gerente(listaIds, infoUsuario[0], infoUsuario[2], infoUsuario[3]);
					listaUsuarios.add(novoUsuario);
					return true;
				}
				//Cria um novo Funcionario e adiciona na lista
				else if(infoUsuario[1].equals("2")) {
					
					for(Usuario usuario: listaUsuarios) {
						if(usuario.getLogin().equals(infoUsuario[2])) {
							System.out.println("Login repitido");
							return false;
						}
					}
					
					Usuario novoUsuario = new Funcionario(listaIds, infoUsuario[0], infoUsuario[2], infoUsuario[3]);
					listaUsuarios.add(novoUsuario);
					return true;
					
				}else {
					System.out.println("Opção incorreta escolha 1 ou 2");
					return false;
				}
			}catch(ArrayIndexOutOfBoundsException a){
				System.out.println("Usuario não cadastrado");
				System.out.println("Problema com o array");
				return false;
			}
		}
		else {
			System.out.println("Usuario não cadastrado");
			System.out.println("Problema no array");
			return false;
		}
	}

	@Override
	public boolean editarUsuario(ArrayList<Usuario> listaUsuarios, String codigoUsuario, String [] info) {
		
		if(listaUsuarios != null) {
			
			try {
				for(Usuario usuario : listaUsuarios) {
					if(usuario.getId().equals(codigoUsuario)) {
						usuario.setNome(info[0]);
						usuario.setSenha(info[1]);
						return true;
					}else {
						System.out.println("Código de usuario não encontrado!!!");
						return false;
					}
				}
			}
			catch(ArrayIndexOutOfBoundsException a){
				System.out.println("Usuario não editado!!!");
				System.out.println("Erro com o array");
				return false;
			}
		}
		else {
			System.out.println("Não é possivel editar");
			System.out.println("Problema com o array");
		}
		return false;
	}

	@Override
	public boolean excluirUsuario(ArrayList<Usuario> listaUsuarios, ArrayList<String> listaIds, String codigoUsuario) {
		
		if(listaUsuarios != null && listaIds != null) {
	
			try {
				for(Usuario usuario : listaUsuarios) {
					if(usuario.getId().equals(codigoUsuario)) {
						int index = listaUsuarios.indexOf(usuario);
						listaUsuarios.remove(index);
						listaIds.remove(codigoUsuario);
						return true;
					}
					else {
						System.out.println("Usuario não encontrado");
						return false;
					}
				}
			}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("Usuario não removido!!!");
				System.out.println("Erro no array");
				return false;
			}
		}
		else {
			System.out.println("Não é possivel excluir");
			System.out.println("Lista vazia");
		}
		return false;
	}

}
