package entidades;

import java.util.ArrayList;
import java.util.List;

public class Treino {
	
	private List<Exercicio> exercicios;

	public Treino(List<Exercicio> exercicios) {
		super();
		this.exercicios = new ArrayList<>();
	}

	public List<Exercicio> getExercicios() {
		return exercicios;
	}	
}
