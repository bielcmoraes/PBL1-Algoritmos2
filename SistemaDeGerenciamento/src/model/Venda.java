package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Venda extends Entidade{
	
	// Attributes
	private LocalDate data;
	private LocalTime horario;
	private ArrayList<Prato> pratos;
	private Double precoTotal;
	private String metodoDePagamento;
	
	// Constructor
	public Venda(ArrayList<String> listaIds, LocalDate data, LocalTime horario, ArrayList<Prato> pratos, Double precoTotal, String metodoDePagamento) {
		
		super(listaIds);
		this.data = data;
		this.horario = horario;
		this.pratos = pratos;
		this.precoTotal = precoTotal;
		this.metodoDePagamento = metodoDePagamento;
	}

	// Getters and Setters
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	public ArrayList<Prato> getPratos() {
		return pratos;
	}

	public void setPratos(ArrayList<Prato> pratos) {
		this.pratos = pratos;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}

	public String getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(String metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}
}

