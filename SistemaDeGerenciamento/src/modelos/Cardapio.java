package modelos;

import java.util.ArrayList;

public class Cardapio {
	
	private int id;
	private ArrayList<Prato> pratos;
	public Cardapio(ArrayList<Prato> pratos) {
		this.pratos = pratos;
	}
	
	//Metodos
	public ArrayList<Prato> selecionaPratos(String pratos[]){
		
		ArrayList<Prato> selecionados = new ArrayList();
		
		//Fazer um código que recebe um array com nome dos pratos, procura no ArrayList
		//de pratos e adiciona em outro ArrayList e retorna esse novo ArrayList; Legal fera bem loko
		
		return selecionados;
	}
	
	//Getters e Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(ArrayList<Prato> pratos) {
		this.pratos = pratos;
	}
	
	
}
