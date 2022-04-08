package controller;

import java.util.ArrayList;

import model.Usuario;

public interface UsuarioCopyable {
	
	public boolean cadastrarUsuario(ArrayList<Usuario> listaUsuarios, ArrayList<String> listaIds, String [] info);
	public boolean editarUsuario(ArrayList<Usuario> listaUsuarios, String codigoUsuario, String [] info);
	public boolean excluirUsuario(ArrayList<Usuario> listaUsuarios, ArrayList<String> listaIds, String codigoUsuario);
}
