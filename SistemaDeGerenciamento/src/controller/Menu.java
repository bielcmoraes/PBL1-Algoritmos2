package controller;

import view.MenuView;
import view.SubMenuView;

public class Menu {
	
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
