package modelos;

public abstract class Entidade {
	
	// Attributes
	private int id;
	
	// Constructor
	public Entidade(int id) {
		this.id = id+1;
	}
	
	// Methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
