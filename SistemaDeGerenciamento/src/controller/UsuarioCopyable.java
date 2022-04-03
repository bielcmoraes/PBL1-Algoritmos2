package controller;

import java.util.ArrayList;

import model.Usuario;

public interface UsuarioCopyable {
	
	public boolean cadastrarUsuario(ArrayList<Usuario> listaUsuarios, ArrayList<String> listaIds);
	public boolean editarUsuario(ArrayList<Usuario> listaUsuarios);
	public boolean excluirUsuario(ArrayList<Usuario> listaUsuarios);
}
