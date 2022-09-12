package models;

import java.io.Serializable;
import java.time.LocalDate;

public class TreinoExecutado implements Serializable{

	private static final long serialVersionUID = -148489282775667740L;
	
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