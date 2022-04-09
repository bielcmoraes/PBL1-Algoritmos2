package controller;

import java.util.ArrayList;

import model.Fornecedor;
import view.FornecedorView;

public class GerenciaFornecedor implements FornecedorCopyable {

	@Override
	public boolean cadastrarFornecedor(ArrayList<Fornecedor> listaFornecedores, ArrayList<String> listaIds, String [] info) {
		
		Fornecedor novoFornecedor = new Fornecedor(listaIds, info[0], info[1], info[2]);
		
		if (listaFornecedores != null) {
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
		else {
			System.out.println("Fornecedor não cadastrado!!!");
			System.out.println("Problema ao acessar o ArrayList");
			return false;
		}
		
	}

	@Override
	public boolean editarFornecedor(ArrayList<Fornecedor> listaFornecedores, String codigoFornecedor, String [] info) {
		
		if(listaFornecedores != null && info!= null) {
			
			try {
				for(Fornecedor fornecedor : listaFornecedores) {
					if(fornecedor.getId().equals(codigoFornecedor)) {
						fornecedor.setNome(info[0]);
						fornecedor.setCnpj(info[1]);
						fornecedor.setEndereco(info[2]);
						return true;
					}else {
						System.out.println("Código de fornecedor não encontrado!!!");
						return false;
					}
				}
			}
			catch(ArrayIndexOutOfBoundsException a){
				System.out.println("Fornecedor não editado!!!");
				System.out.println("Erro com o array");
				return false;
			}
			
		}else {
			System.out.println("Não é possivel editar");
			System.out.println("Problema ao acessar o ArrayList");
		}
		return false;
	}

	@Override
	public boolean excluirFornecedor(ArrayList<Fornecedor> listaFornecedores, ArrayList<String> listaIds, String codigoFornecedor) {
		
		if(listaFornecedores != null && listaIds!= null) {
			
			try {
				for(Fornecedor fornecedor : listaFornecedores) {
					if(fornecedor.getId().equals(codigoFornecedor)) {
						int index = listaFornecedores.indexOf(fornecedor);
						listaFornecedores.remove(index);
						listaIds.remove(codigoFornecedor);
						return true;
					}
					else {
						System.out.println("Codigo de Fornecedor Inválido");
						return false;
					}
				}
			}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("Fornecedor não removido!!!");
				System.out.println("Erro no array");
				return false;
			}
		}
		else {
			System.out.println("Erro no array");
		}
		return false;
	}

}
