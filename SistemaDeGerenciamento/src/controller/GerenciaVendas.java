package controller;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.Prato;
import model.Venda;
import model.VendaCopyable;
import view.VendaView;

public class GerenciaVendas implements VendaCopyable {

	@Override
	public boolean cadastrarVenda(ArrayList<Venda> listaVendas, ArrayList<String> listaIds, ArrayList<Prato> cardapio, String [] info) {
	
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data;
		try {
			data = LocalDate.parse(info[0], formatoData);
		} catch (java.time.format.DateTimeParseException a) {
			System.out.println("Venda nao cadastrada!!!");
			System.out.println("Data invalida");
			return false;
		}
		
		DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime horario;
		try {
			horario = LocalTime.parse(info[1], formatoHorario);
		} catch (java.time.format.DateTimeParseException a) {
			System.out.println("Venda nao cadastrada!!!");
			System.out.println("Horario invalido");
			return false;
		}
		
		ArrayList<Prato> pratos = new ArrayList<Prato>();
		for (String pratoNome : info[2].split(", ")) {
			for (Prato prato : cardapio) {
				if (pratoNome.equals(prato.getNome())) {
					pratos.add(prato);
				}
			}
		}
		
		if (pratos.size() != info[2].split(", ").length) {
			System.out.println("Venda nao cadastrada!!!");
			System.out.println("Pratos invalidos");
			return false;
		}
		
		Double precoTotal = 0.0;
		for (Prato prato : pratos) {
			precoTotal += prato.getPreco();
		}
		
		Venda novaVenda = new Venda(listaIds, data, horario, pratos, precoTotal, info[3]);
		
		try {
			listaVendas.add(novaVenda);
			return true;
		} 
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Venda nao cadastrada!!!");
			System.out.println("Problema ao acessar o ArrayList");
			return false;
		}
	}

	@Override
	public boolean editarVenda(ArrayList<Venda> listaVendas, ArrayList<Prato> cardapio, String codigoVenda, String [] info) {
		
		try {
			for(Venda venda : listaVendas) {
				if(codigoVenda.equals(venda.getId())) {
					
					DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					LocalDate data;
					try {
						data = LocalDate.parse(info[0], formatoData);
					} catch (java.time.format.DateTimeParseException a) {
						System.out.println("Venda nao cadastrada!!!");
						System.out.println("Data invalida");
						return false;
					}
					
					DateTimeFormatter formatoHorario = DateTimeFormatter.ofPattern("HH:mm");
					LocalTime horario;
					try {
						horario = LocalTime.parse(info[1], formatoHorario);
					} catch (java.time.format.DateTimeParseException a) {
						System.out.println("Venda nao cadastrada!!!");
						System.out.println("Horario invalido");
						return false;
					}
					
					ArrayList<Prato> pratos = new ArrayList<Prato>();
					for (String pratoNome : info[2].split(", ")) {
						for (Prato prato : cardapio) {
							if (pratoNome.equals(prato.getNome())) {
								pratos.add(prato);
							}
						}
					}
					
					if (pratos.size() != info[2].split(", ").length) {
						System.out.println("Venda nao cadastrada!!!");
						System.out.println("Pratos invalidos");
						return false;
					}
					
					Double precoTotal = 0.0;
					for (Prato prato : pratos) {
						precoTotal += prato.getPreco();
					}
						
					venda.setData(data);
					venda.setHorario(horario);
					venda.setPratos(pratos);
					venda.setPrecoTotal(precoTotal);
					venda.setMetodoDePagamento(info[3]);
					
					return true;
				}
			}
			System.out.println("Codigo da venda nao encontrado!!!");
		}
		catch(ArrayIndexOutOfBoundsException a){
			System.out.println("Venda nao editada!!!");
			System.out.println("Erro com o array");
		}
		return false;
	}

	@Override
	public boolean excluirVenda(ArrayList<Venda> listaVendas, ArrayList<String> listaIds, String codigoVenda) {
		
		try {
			for(Venda venda : listaVendas) {
				if(codigoVenda.equals(venda.getId())) {
					int index = listaVendas.indexOf(venda);
					listaVendas.remove(index);
					return true;
				}
			}
			System.out.println("Codigo de venda nao encontrado!!!");
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Venda nao removida!!!");
			System.out.println("Erro no array");
		}
		return false;
	}
}
