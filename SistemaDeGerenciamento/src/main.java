
import java.util.ArrayList;

import controller.BancoDeDados;
import controller.Gerente;
import controller.Login;
import model.Fornecedor;

//Fazer uma herança entre o main o BancoDeDados
public class main {

	public static void main(String[] args) {
		
		//Intaciar um usuario;
		//Add esse usuario na lista de usuarios;
		BancoDeDados b1 = new BancoDeDados();
		
		Gerente g1 = new Gerente();
		g1.cadastrarFornecedor(b1.getListaFornecedores());
		
		
	}

}
