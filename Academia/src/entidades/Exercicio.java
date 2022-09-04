package entidades;

import java.time.Period;

public class Exercicio {
	
	// Alteração
	private String nome;
	private String tipo;
	private Period intervalo;
	private int qtdDeSeries;

	public Exercicio(String nome, String tipo, Period intervalo, int qtdDeSeries) {
		this.nome = nome;
		this.tipo = tipo;
		this.intervalo = intervalo;
		this.qtdDeSeries = qtdDeSeries;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

	public Period getIntervalo() {
		return intervalo;
	}

	public int getQtdDeSeries() {
		return qtdDeSeries;
	}

}
