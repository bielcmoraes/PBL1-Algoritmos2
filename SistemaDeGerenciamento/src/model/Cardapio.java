package model;

import java.util.ArrayList;

/**Classe que contém os atributos e métodos referentes ao Cardápio.
 * 
 * @author Gabriel Moraes e Luis Fernando Cintra
 *
 */
public class Cardapio extends Entidade {
	
	private ArrayList<Prato> pratos;
	
	/**O construtor recebe um ArrayList de pratos e atribui ao atributo pratos.
	 * 
	 * @param pratos
	 */
	public Cardapio(ArrayList<String> listaIds, ArrayList<Prato> pratos) {
		super(listaIds);
		this.pratos = pratos;
	}
	
	/**Metódo para retorno de lista de pratos
	 * 
	 * @return ArrayList<Prato> - Lista de pratos
	 */
	public ArrayList<Prato> getPratos() {
		return pratos;
	}
}
