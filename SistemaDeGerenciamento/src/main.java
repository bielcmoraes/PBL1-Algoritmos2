
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import controller.Gerente;
import controller.Login;
import modelos.Fornecedor;
import modelos.Produto;

//Fazer uma herança entre o main o BancoDeDados
public class main {

	public static void main(String[] args) {
		
		//Intaciar um usuario;
		//Add esse usuario na lista de usuarios;
		
		Produto p1 = new Produto("Carne", 300.0, LocalDate.of(2023, 01, 30));
		Produto p2 = new Produto("Cerveja", 200.0, LocalDate.of(2023, 02, 10));
		Produto p3 = new Produto("Calabresa", 150.0, LocalDate.of(2022, 12, 20));
		
		
	}

}
