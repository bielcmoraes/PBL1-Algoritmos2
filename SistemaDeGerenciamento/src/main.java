
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import controller.BancoDeDados;
import controller.Login;
import controller.Menu;
import model.Fornecedor;
import model.Gerente;
import model.Produto;
import model.Usuario;
import view.CardapioView;
import view.FornecedorView;
import view.MenuView;
import view.ProdutosView;
import view.SubMenuView;
import view.UsuarioView;
import view.VendaView;


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
		
		
		//Intancio as listas
		BancoDeDados dados = new BancoDeDados();
		//Loga o Usuario no sistema
		Login login = new Login(dados.getListaUsuarios());
		
		Usuario usuarioLogado = login.autenticarLogin(dados.getListaUsuarios());
		
		while(true) {
			if(usuarioLogado instanceof Gerente) {
				
				int decisao[] = Menu.gerente();
				if(decisao[0] == 1) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Cadastrando Fornecedor");
						String[] infoCadastroFornecedor = FornecedorView.cadastrarFornecedor();
						((Gerente) usuarioLogado).cadastrarFornecedor(dados.getListaFornecedores(), dados.getListaIds(), infoCadastroFornecedor);
						break;
					case 2:
						System.out.println("Editando Fornecedor");
						String codigoFornecedorEdit = FornecedorView.buscaFornecedor();
						String [] infoEditFornecedor = FornecedorView.cadastrarFornecedor();
						((Gerente) usuarioLogado).editarFornecedor(dados.getListaFornecedores(), codigoFornecedorEdit, infoEditFornecedor);
						break;
					case 3:
						System.out.println("Excluindo Fornecedor");
						String codigoFornecedorDel = FornecedorView.buscaFornecedor();
						((Gerente) usuarioLogado).excluirFornecedor(dados.getListaFornecedores(),dados.getListaIds(), codigoFornecedorDel);
						break;
					case 4:
						break;
					}
					
				}
				
				else if(decisao[0] == 2) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Cadastrando Vendas");
						String[] info = VendaView.cadastrarVenda();
						((Gerente) usuarioLogado).cadastrarVenda(dados.getListaVendas(), dados.getListaIds(), dados.getCardapio(), info);
						break;
					case 2:
						System.out.println("Editando Vendas");
						String codigoVendaEdit = VendaView.buscaVenda();
						String [] infoEditVenda = VendaView.editarVenda();
						((Gerente) usuarioLogado).editarVenda(dados.getListaVendas(), dados.getCardapio(),codigoVendaEdit, infoEditVenda);
						break;
					case 3:
						System.out.println("Excluindo Vendas");
						String codigoVendaDel = VendaView.buscaVenda();
						((Gerente) usuarioLogado).excluirVenda(dados.getListaVendas(), dados.getListaIds(), codigoVendaDel);
						break;
					case 4:
						break;
					}
				}
				else if(decisao[0] == 3) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Cadastrando Usuario");
						String [] infoUsuario = UsuarioView.cadastraUsuario();
						((Gerente) usuarioLogado).cadastrarUsuario(dados.getListaUsuarios(), dados.getListaIds(), infoUsuario);
						break;
					case 2:
						System.out.println("Editando Usuario");
						String codigoUsuarioEdit = UsuarioView.buscaUsuario();
						String [] infoEditUsuario = UsuarioView.editaUsuario();
						((Gerente) usuarioLogado).editarUsuario(dados.getListaUsuarios(), codigoUsuarioEdit, infoEditUsuario);
					case 3:
						System.out.println("Excluindo Usuario");
						String codigoUsuarioDel = UsuarioView.buscaUsuario();
						((Gerente) usuarioLogado).excluirUsuario(dados.getListaUsuarios(), dados.getListaIds(), codigoUsuarioDel);
					case 4:
						break;
					}
				}
				else if(decisao[0] == 4) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Cadastrando Prato");
						String[] infoCadastro = CardapioView.cadastrarPrato();
						((Gerente) usuarioLogado).cadastrarPrato(dados.getCardapio(), dados.getListaIds(), dados.getListaProdutos(), infoCadastro);
						break;
					case 2:
						System.out.println("Editando Prato");
						String codigoPratoEdit = CardapioView.buscaPrato();
						String [] infoEdicao = CardapioView.editarPrato();
						((Gerente) usuarioLogado).editarPrato(dados.getCardapio(), dados.getListaProdutos(), codigoPratoEdit, infoEdicao);
						break;
					case 3:
						System.out.println("Excluindo Prato");
						String codigoPratoDel = CardapioView.buscaPrato();
						((Gerente) usuarioLogado).excluirPrato(dados.getCardapio(), dados.getListaIds(), codigoPratoDel);
						break;
					case 4:
						break;
					}
				}
				else if(decisao[0] == 5) {
					switch(decisao[1]) {
					case 1:
						System.out.println("Cadastrando Produtos");
						String[] infoCadastroProduto = ProdutosView.cadastrarProduto();
						((Gerente) usuarioLogado).cadastrarProduto(dados.getListaProdutos(), dados.getListaIds(), infoCadastroProduto);
						break;
					case 2:
						System.out.println("Editando Produtos");
						String codigoProdutoEdit = ProdutosView.buscaProduto();
						String [] infoProdutoEdit = ProdutosView.editarProduto();
						((Gerente) usuarioLogado).editarProduto(dados.getListaProdutos(), codigoProdutoEdit, infoProdutoEdit);
						break;
					case 3:
						System.out.println("Excluindo Produtos");
						String codigoProdutoDel = ProdutosView.buscaProduto();
						((Gerente) usuarioLogado).excluirProduto(dados.getListaProdutos(), dados.getListaIds(), codigoProdutoDel);
						break;
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

