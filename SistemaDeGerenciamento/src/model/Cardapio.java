package model;

import java.util.ArrayList;

public class Cardapio {
	
	private int id;
	private ArrayList<Prato> pratos;
	
	public Cardapio(ArrayList<Prato> pratos) {
		this.pratos = pratos;
	}
	
	//Metodos
	
		
		
		//Fazer um código que recebe um array com nome dos pratos, procura no ArrayList
		//de pratos e adiciona em outro ArrayList e retorna esse novo ArrayList
	
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
