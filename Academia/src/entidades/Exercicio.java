package entidades;

import java.time.Period;

public class Exercicio {
	
	private String nome;
	private String tipo;
	private Period intervalo;
	private int qtdDeSeries;
	private int qtdDeRepeticao;

	
	public Exercicio(String nome, String tipo, Period intervalo, int qtdDeSeries, int qtdDeRepeticao) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.intervalo = intervalo;
		this.qtdDeSeries = qtdDeSeries;
		this.qtdDeRepeticao = qtdDeRepeticao;
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
	
	public int getQtdDeRepeticao() {
		return qtdDeRepeticao;
		//testee
	}
}
