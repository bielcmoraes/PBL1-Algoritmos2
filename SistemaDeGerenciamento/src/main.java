
import java.util.ArrayList;

import controller.Funcionario;
import controller.Gerente;
import modelos.Fornecedor;
import modelos.Venda;

//Fazer uma herança entre o main o BancoDeDados
public class main {

	public static void main(String[] args) {
		//Instancia o ArrayList (somente para teste)
		ArrayList<Fornecedor> listaDeFornecedores = new  ArrayList();
		
		//Cria um objeto do tipo gerente(falta o sistema de login)
		Gerente g1 = new Gerente();
		
		//Cadastra um fornecedor(Tá rodando aleluia)
		g1.cadastrarFornecedor(listaDeFornecedores);
		System.out.println(listaDeFornecedores.get(0).getNome());
		
		//Edita um fornecedor (Não vai funcionar pq não implementamos um metodo de gerar id)
		g1.editarFornecedor(listaDeFornecedores);
		System.out.println(listaDeFornecedores.get(0).getNome());
		
	}

}
