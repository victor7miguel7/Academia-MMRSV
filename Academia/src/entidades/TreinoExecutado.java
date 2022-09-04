package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class TreinoExecutado {

	private Cliente cliente;
	private Treino treino;
	private LocalDate data;
	
	private ArrayList<TreinoExecutado> executados;
	
	//Construtor
	public TreinoExecutado(Cliente cliente, Treino treino, LocalDate data) {
		this.cliente = cliente;
		this.treino = treino;
		this.data = data;
		this.executados = new ArrayList<>();
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

	public ArrayList<TreinoExecutado> getExecutados() {
		return executados;
	}
}