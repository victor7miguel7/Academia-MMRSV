package entidades;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;

public class Treino {

	private String tipo;
	private IRepositorioGenerico<Exercicio> exercicios;

	public Treino(String tipo) {
		this.tipo = tipo;
		this.exercicios = new RepositorioGenerico<>();
	}

	public String getTipo() {
		return tipo;
	}

	public IRepositorioGenerico<Exercicio> getExercicios() {
		return exercicios;
	}

	@Override
	public String toString() {
		return "\n\nTreino " + tipo  + "\n" + exercicios.listar();
	}
}