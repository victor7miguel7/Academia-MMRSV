package entidades;

import java.util.ArrayList;
import java.util.List;

public class Treino {

	private String tipo;
	private List<Exercicio> exercicios;

	public Treino(String tipo) {
		this.tipo = tipo;
		this.exercicios = new ArrayList<>();
	}

	public String getTipo() {
		return tipo;
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}
}
