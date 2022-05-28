package model;

import java.util.ArrayList;

public interface ClienteCopyable {
	
	public boolean cadastrarCliente(ArrayList<Cliente> listaClientes, ArrayList<String> listaIds, String [] info);
	
	public boolean editarCliente(ArrayList<Cliente> listaClientes, String codigoCliente, String [] info);
	
	public boolean excluirCliente(ArrayList<Cliente> listaClientes, ArrayList<String> listaIds, String codigoCliente);
}
