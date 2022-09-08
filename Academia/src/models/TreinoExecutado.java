package models;

import java.time.LocalDate;
import java.util.ArrayList;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;

public class TreinoExecutado {

	private Cliente cliente;
	private Treino treino;
	private LocalDate data;	

	
	//Construtor
	public TreinoExecutado(Cliente cliente, Treino treino, LocalDate data) {
		this.cliente = cliente;
		this.treino = treino;
		this.data = data;
	}
	
	// Gets
	public Cliente getCliente() {
		return cliente;
	}

	public Treino getTreino() {
		return treino;
	}

	public LocalDate getData() {
		return data;
	}


	@Override
	public String toString() {
		return "\nTreino Executado de " + cliente  + treino + "\ndata: " + data ;
	}
	
	 
	
}