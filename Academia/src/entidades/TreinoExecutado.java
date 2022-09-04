package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TreinoExecutado {

	// Atualização
	private Cliente cliente;
	private Treino treino;
	private LocalDate data;
	
	private ArrayList<TreinoExecutado> executados;
	
	//Construtor
	public TreinoExecutado(Cliente cliente, Treino treino, LocalDate data, ArrayList<TreinoExecutado> executados) {
		this.cliente = cliente;
		this.treino = treino;
		this.data = data;
		this.executados = executados;
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
	
	//Métodos
	public int consultarFrequenciaNoMês(int mes) {
		int frequencia = 0;
		for(int i = 0; i < executados.size(); i++) {    
            if((executados.get(i)).getMonthValue() == mes) {
                frequencia++;
            }                 
        }
		return frequencia;		
	}

	public void executarTreino() {
		LocalDate hoje = LocalDate.now();
		executados.add(hoje);
	}

}
