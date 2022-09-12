package models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;

public class PlanoDeTreino implements Serializable{

	private static final long serialVersionUID = 4967484128939616324L;
	
	private LocalDate dataInicio;
	private Period duracao;
	private Cliente cliente;
	private IRepositorioGenerico<Treino> treinos;

	public PlanoDeTreino(LocalDate dataInicio, Period duracao, Cliente cliente) {
		this.dataInicio = dataInicio;
		this.duracao = duracao;
		this.cliente = cliente;
		this.treinos = new RepositorioGenerico<>("planoDeTreinos.dat");
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public Period getDuracao() {
		return duracao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public IRepositorioGenerico<Treino> getTreinos() {
		return treinos;
	}

	public String toString() {
		return "\nPlanoDeTreino de " + cliente + "\nData de Inicio:" + dataInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
				"\nDuracao: " + duracao.getDays() + " dias"  + treinos.listar();
	}

}
