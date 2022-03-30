package controller;

import java.util.ArrayList;

import modelos.Usuario;

public interface UsuarioCopyable {
	
	public boolean cadastrarUsuario(ArrayList<Usuario> listaUsuarios);
	public boolean editarUsuario(ArrayList<Usuario> listaUsuarios);
	public boolean excluirUsuario(ArrayList<Usuario> listaUsuarios);
}
