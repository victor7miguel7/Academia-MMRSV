package entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Cliente extends Usuario {

	private String genero;
	private double peso;
	private double altura;
	private double imc;

	public Cliente(String id, String nome, String genero, String email, String senha, LocalDate dtNascimento,
			double peso, double altura) {
		super(id, nome, email, senha, dtNascimento);
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public String getGenero() {
		return genero;
	}

	public double getAltura() {
		return altura;
	}

	public int calcularIdade(LocalDate dtNascimento) {
		LocalDate hoje = LocalDate.now();
		int idade = (int) dtNascimento.until(hoje, ChronoUnit.YEARS);
		return idade;
	}

	public String toString() {
		return "Imc " + imc;
	}

}
