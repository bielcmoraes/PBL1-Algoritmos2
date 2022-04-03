
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import controller.BancoDeDados;
import controller.Login;
import controller.Menu;
import controller.PermissoesGerente;
import model.Fornecedor;
import model.Produto;
import model.Usuario;
import view.MenuView;
import view.SubMenuView;


//Fazer uma herança entre o main o BancoDeDados
public class main {

	public static void main(String[] args) {
		
		//Intaciar um usuario;
		//Add esse usuario na lista de usuarios;
		BancoDeDados b1 = new BancoDeDados();
		
		//Gerente g1 = new Gerente();
		//g1.cadastrarFornecedor(b1.getListaFornecedores());
		
		//Produto p1 = new Produto("Carne", 300.0, LocalDate.of(2023, 01, 30));
		//Produto p2 = new Produto("Cerveja", 200.0, LocalDate.of(2023, 02, 10));
		//Produto p3 = new Produto("Calabresa", 150.0, LocalDate.of(2022, 12, 20));
		
		//Fornecedor f1 = new Fornecedor(b1.getListaIds(), "Marcos", "sddjds");
		//System.out.println(f1.getId());
		
		BancoDeDados dados = new BancoDeDados();
		//Loga o Usuario no sistema
		Login login = new Login(dados.getListaUsuarios());
			
		Usuario usuarioLogado = login.autenticarLogin(dados.getListaUsuarios());
		
		while(true) {
			if(usuarioLogado.getCargo().equals("Gerente")) {
				
				int decisao[] = Menu.gerente();
				if(decisao[0] == 1) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Cadastrando Fornecedor");
						break;
					case 2:
						//Editando Fornecedor;
					case 3:
						//Excluindo Fornecedor;
					case 4:
						break;
					}
					
				}
				
				else if(decisao[0] == 2) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Cadastrando Vendas");
						break;
					case 2:
						//Editando Fornecedor;
					case 3:
						//Excluindo Fornecedor;
					case 4:
						break;
					}
				}
				else if(decisao[0] == 3) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Cadastrando Vendas");
						break;
					case 2:
						//Editando Fornecedor;
					case 3:
						//Excluindo Fornecedor;
					case 4:
						break;
					}
				}
				else if(decisao[0] == 4) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Cadastrando Vendas");
						break;
					case 2:
						//Editando Fornecedor;
					case 3:
						//Excluindo Fornecedor;
					case 4:
						break;
					}
				}
				else if(decisao[0] == 5) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Cadastrando Vendas");
						break;
					case 2:
						//Editando Fornecedor;
					case 3:
						//Excluindo Fornecedor;
					case 4:
						break;
					}
				}
				else if(decisao[0] == 6) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Mostrando Cardapio");
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						break;
					}
				}
				else if(decisao[0] == 7) {
					System.exit(0);
					}
			}
			}
		}
		
	}

