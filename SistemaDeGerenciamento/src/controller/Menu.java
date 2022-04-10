package controller;

import view.MenuView;
import view.SubMenuView;

/**Classe reponsável por organizar as telas dos diferente menus, de Gerente e Funcionário, que serão exibidas no sistema.
 * 
 * @author Gabriel Moraes e Luis Fernando Cintra
 *
 */
public class Menu {
	
	/**Metódo estático que implementa e organiza o menu de gerente.
	 * 
	 * @return vetor de inteiros de tamanho dois que contém os valores correspondentes às escolhas do usuário que está acessando o menu de gerentes.
	 */
	public static int[] gerente() {
		int escolha = MenuView.primeiraTelaGerente();
		int [] decisoes = new int[2];
		
		if(escolha != 6 && escolha != 7) {
			int resposta = SubMenuView.telaMenuGerenciamentos();
			decisoes[0] = escolha;
			decisoes[1] = resposta;
	
		}else if(escolha == 6) {
			int resposta = SubMenuView.telaMenuListagem();
			decisoes[0] = escolha;
			decisoes[1] = resposta;
			
		}else if(escolha == 7){
			decisoes[0] = escolha;
		}else {
			System.out.println("Escolha uma opção válida");
		}
		return decisoes;
	}
	
	/**Metódo estático que implementa e organiza o menu de funcionários.
	 * 
	 * @return vetor de inteiros de tamanho dois que contém os valores correspondentes às escolhas do usuário que está acessando o menu de funcionários.
	 */
	public static int[] funcionario() {
		
		int escolha = MenuView.primeiraTelaFuncionario();
		int [] decisoes = new int[2];
		
		if(escolha == 1) {
			int resposta = SubMenuView.telaMenuGerenciamentos();
			decisoes[0] = escolha;
			decisoes[1] = resposta;
			
		}else if(escolha == 2) {
			
			int resposta = SubMenuView.telaMenuListagem();
			decisoes[0] = escolha;
			decisoes[1] = resposta;
			
		}else if(escolha == 3) {
			
			decisoes[0] = escolha;
			
		}else {
			System.out.println("Digite uma opção válida");
		}
		
		return decisoes;
	}
}
