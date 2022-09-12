package models;

import java.io.Serializable;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;

public class Treino implements Serializable{

	private static final long serialVersionUID = -4377520538484301959L;
	
	private String tipo;
	private IRepositorioGenerico<Exercicio> exercicios;

	public Treino(String tipo) {
		this.tipo = tipo;
		this.exercicios = new RepositorioGenerico<>("treinos.dat");
	}

	public String getTipo() {
		return tipo;
	}

	public IRepositorioGenerico<Exercicio> getExercicios() {
		return exercicios;
	}

	@Override
	public String toString() {
		return "\nTreino " + tipo  + "\n" + exercicios.listar();
	}
}