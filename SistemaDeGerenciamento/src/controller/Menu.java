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
			
		}else {
			System.out.println("Saindo...");
		}
		return decisoes;
	}
	
}
