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
	public boolean editarFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		
		String codigoFornecedor = FornecedorView.buscaFornecedor();
		try {
			for(Fornecedor fornecedor : listaFornecedores) {
				if(fornecedor.getId() == codigoFornecedor) {
					String [] info = FornecedorView.cadastrarFornecedor();
					fornecedor.setNome(info[0]);
					fornecedor.setCnpj(info[1]);
					fornecedor.setEndereco(info[2]);
					
					return true;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Fornecedor não editado!!!");
			System.out.println("Erro com o array");
		}
		return false;
	}

	@Override
	public boolean excluirFornecedor(ArrayList<Fornecedor> listaFornecedores) {
		
		String codigoFornecedor = FornecedorView.buscaFornecedor();
		
		try {
			for(Fornecedor fornecedor : listaFornecedores) {
				if(fornecedor.getId() == codigoFornecedor) {
					int index = listaFornecedores.indexOf(fornecedor);
					listaFornecedores.remove(index);
					return true;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Fornecedor não removido!!!");
			System.out.println("Erro no array");
		}
		return false;
	}


}