package controller;

import java.util.ArrayList;

import controller.BancoDeDados;
import controller.Login;
import controller.Menu;
import model.Funcionario;
import model.Gerente;
import model.Prato;
import model.Usuario;
import view.CardapioView;
import view.FornecedorView;
import view.LoginView;
import view.ProdutosView;
import view.SubMenuView;
import view.UsuarioView;
import view.VendaView;


//Fazer uma herança entre o main o BancoDeDados
public class Main {

	public static void main(String[] args) {
	
		//Intancio as listas
		BancoDeDados dados = new BancoDeDados();
		
		while(true) {
			
			//Loga o Usuario no sistema
			Login login = new Login(dados.getListaUsuarios());
			Usuario usuarioLogado;
			do{
				String[] infoLogin = LoginView.logar();
				usuarioLogado = login.autenticarLogin(dados.getListaUsuarios(), infoLogin);
				if(usuarioLogado == null) {
					LoginView.erroLogin();
				}
			}while(usuarioLogado == null);
			boolean logado = true;
			
			while(logado) {
				if(usuarioLogado instanceof Gerente) {
					
					int decisao[] = Menu.gerente();
					if(decisao[0] == 1) {
						switch(decisao[1]) {
						case 1:
							System.out.println("Cadastrando Fornecedor");
							String[] infoCadastroFornecedor = FornecedorView.cadastrarFornecedor();
							boolean cadastrarFornecedor = ((Gerente) usuarioLogado).cadastrarFornecedor(dados.getListaFornecedores(), dados.getListaIds(), infoCadastroFornecedor);
							if(cadastrarFornecedor == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 2:
							System.out.println("Editando Fornecedor");
							String codigoFornecedorEdit = FornecedorView.buscaFornecedor();
							String [] infoEditFornecedor = FornecedorView.cadastrarFornecedor();
							boolean editarFornecedor = ((Gerente) usuarioLogado).editarFornecedor(dados.getListaFornecedores(), codigoFornecedorEdit, infoEditFornecedor);
							if(editarFornecedor == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 3:
							System.out.println("Excluindo Fornecedor");
							String codigoFornecedorDel = FornecedorView.buscaFornecedor();
							boolean excluirFornecedor = ((Gerente) usuarioLogado).excluirFornecedor(dados.getListaFornecedores(),dados.getListaIds(), codigoFornecedorDel);
							if(excluirFornecedor == false) {
								SubMenuView.erroGerenciamentos();
							}
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
							boolean cadastrarVenda = ((Gerente) usuarioLogado).cadastrarVenda(dados.getListaVendas(), dados.getListaIds(), dados.getCardapio(), info);
							if(cadastrarVenda == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 2:
							System.out.println("Editando Vendas");
							String codigoVendaEdit = VendaView.buscaVenda();
							String [] infoEditVenda = VendaView.editarVenda();
							boolean editarVenda = ((Gerente) usuarioLogado).editarVenda(dados.getListaVendas(), dados.getCardapio(),codigoVendaEdit, infoEditVenda);
							if(editarVenda == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 3:
							System.out.println("Excluindo Vendas");
							String codigoVendaDel = VendaView.buscaVenda();
							boolean excluirVenda = ((Gerente) usuarioLogado).excluirVenda(dados.getListaVendas(), dados.getListaIds(), codigoVendaDel);
							if(excluirVenda == false) {
								SubMenuView.erroGerenciamentos();
							}
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
							boolean cadastrarUsuario = ((Gerente) usuarioLogado).cadastrarUsuario(dados.getListaUsuarios(), dados.getListaIds(), infoUsuario);
							if(cadastrarUsuario == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 2:
							System.out.println("Editando Usuario");
							String codigoUsuarioEdit = UsuarioView.buscaUsuario();
							String [] infoEditUsuario = UsuarioView.editaUsuario();
							boolean editarUsuario =((Gerente) usuarioLogado).editarUsuario(dados.getListaUsuarios(), codigoUsuarioEdit, infoEditUsuario);
							if(editarUsuario == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 3:
							System.out.println("Excluindo Usuario");
							String codigoUsuarioDel = UsuarioView.buscaUsuario();
							boolean excluirUsuario =((Gerente) usuarioLogado).excluirUsuario(dados.getListaUsuarios(), dados.getListaIds(), codigoUsuarioDel);
							if(excluirUsuario == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 4:
							break;
						}
					}
					else if(decisao[0] == 4) {
						switch(decisao[1]) {
						case 1:
							System.out.println("Cadastrando Prato");
							String[] infoCadastro = CardapioView.cadastrarPrato();
							boolean cadastrarPrato = ((Gerente) usuarioLogado).cadastrarPrato(dados.getCardapio(), dados.getListaIds(), dados.getListaProdutos(), infoCadastro);
							if(cadastrarPrato == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 2:
							System.out.println("Editando Prato");
							String codigoPratoEdit = CardapioView.buscaPrato();
							String [] infoEdicao = CardapioView.editarPrato();
							boolean editarPrato = ((Gerente) usuarioLogado).editarPrato(dados.getCardapio(), dados.getListaProdutos(), codigoPratoEdit, infoEdicao);
							if(editarPrato == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 3:
							System.out.println("Excluindo Prato");
							String codigoPratoDel = CardapioView.buscaPrato();
							boolean excluirPrato = ((Gerente) usuarioLogado).excluirPrato(dados.getCardapio(), dados.getListaIds(), codigoPratoDel);
							if(excluirPrato == false) {
								SubMenuView.erroGerenciamentos();
							}
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
							boolean cadastrarProduto = ((Gerente) usuarioLogado).cadastrarProduto(dados.getListaProdutos(), dados.getListaIds(), infoCadastroProduto);
							if(cadastrarProduto == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 2:
							System.out.println("Editando Produtos");
							String codigoProdutoEdit = ProdutosView.buscaProduto();
							String [] infoProdutoEdit = ProdutosView.editarProduto();
							boolean editarProduto = ((Gerente) usuarioLogado).editarProduto(dados.getListaProdutos(), codigoProdutoEdit, infoProdutoEdit);
							if(editarProduto == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 3:
							System.out.println("Excluindo Produtos");
							String codigoProdutoDel = ProdutosView.buscaProduto();
							boolean excluirProduto = ((Gerente) usuarioLogado).excluirProduto(dados.getListaProdutos(), dados.getListaIds(), codigoProdutoDel);
							if(excluirProduto == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 4:
							break;
						}
					}
					else if(decisao[0] == 6) {
						switch(decisao[1]) {
						case 1:
							((Gerente) usuarioLogado).mostrarCardapio(dados.getCardapio());
							break;
						case 2:
							((Gerente) usuarioLogado).listarProduto(dados.getListaProdutos());
							break;
						case 3:
							((Gerente) usuarioLogado).listarVenda(dados.getListaVendas());
							break;
						case 4:
							((Gerente) usuarioLogado).listarFornecedor(dados.getListaFornecedores());
							break;
						case 5:
							((Gerente) usuarioLogado).listarUsuario(dados.getListaUsuarios());
							break;
						case 6:
							break;
						}
					}
					else if(decisao[0] == 7) {
						logado = false;
						}
				}
				else if(usuarioLogado instanceof Funcionario) {
					//Menu de Funcionario
					int decisao[] = Menu.funcionario();
					if(decisao[0] == 1) {
						switch(decisao[1]) {
						case 1:
							System.out.println("Cadastrando Vendas");
							String[] info = VendaView.cadastrarVenda();
							boolean cadastrarVenda = ((Funcionario) usuarioLogado).cadastrarVenda(dados.getListaVendas(), dados.getListaIds(), dados.getCardapio(), info);
							if(cadastrarVenda == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 2:
							System.out.println("Editando Vendas");
							String codigoVendaEdit = VendaView.buscaVenda();
							String [] infoEditVenda = VendaView.editarVenda();
							boolean editarVenda = ((Funcionario) usuarioLogado).editarVenda(dados.getListaVendas(), dados.getCardapio(),codigoVendaEdit, infoEditVenda);
							if(editarVenda == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 3:
							System.out.println("Excluindo Vendas");
							String codigoVendaDel = VendaView.buscaVenda();
							boolean excluirVenda = ((Funcionario) usuarioLogado).excluirVenda(dados.getListaVendas(), dados.getListaIds(), codigoVendaDel);
							if(excluirVenda == false) {
								SubMenuView.erroGerenciamentos();
							}
							break;
						case 4:
							break;
						}
					}else if(decisao[0] == 2) {
							switch(decisao[1]) {
							case 1:
								((Funcionario) usuarioLogado).mostrarCardapio(dados.getCardapio());
								break;
							case 2:
								((Funcionario) usuarioLogado).listarProduto(dados.getListaProdutos());
								break;
							case 3:
								((Funcionario) usuarioLogado).listarVenda(dados.getListaVendas());
								break;
							case 4:
								((Funcionario) usuarioLogado).listarFornecedor(dados.getListaFornecedores());
								break;
							case 5:
								((Funcionario) usuarioLogado).listarUsuario(dados.getListaUsuarios());
								break;
							case 6:
								break;
							}
						}
						else if(decisao[0] == 3) {
							logado = false;
							}
					}

				}
			}
			}
		}

