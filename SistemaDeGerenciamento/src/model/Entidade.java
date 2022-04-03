package model;

import java.util.ArrayList;
import java.util.Random;

public abstract class Entidade {
	
	// Attributes
	private String id;
	
	// Constructor
	public Entidade (ArrayList<String> listaIds) {
		Random aleatorio = new Random();
		do {
			this.id = Integer.toString(aleatorio.nextInt(10000));
		}while(listaIds.contains(id) != false);
		
	}
	
	//O construtor vazio é necessário para setar o id do primeiro usuario na classe Usuario
	public Entidade () {
		this.id = "99999";
	}
	
	// Methods
	public String getId() {
		return id;
	}
}
