package controller;

import java.util.ArrayList;

import modelos.Fornecedor;
import modelos.Usuario;
import view.FornecedorView;

public class Gerente extends Usuario implements FornecedorCopyable{

	@Override
	public boolean cadastrarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		String[] info = FornecedorView.cadastrarFornecedor();
		Fornecedor novoFornecedor = new Fornecedor(info[0], info[1], info[2]);
		
		try {
			listaFornecedores.add(novoFornecedor);
			return true;
		} 
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Fornecedor não cadastrado!!!");
			System.out.println("Problema ao acessar o ArrayList");
			return false;
		}
	}

	@Override
	public void editarFornecedor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirFornecedor() {
		// TODO Auto-generated method stub
		
	}


}