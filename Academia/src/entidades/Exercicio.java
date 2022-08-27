package entidades;

public class Exercicio {
	
	private String nome;
	private String tipo;
	
	public Exercicio(String nome, String tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public String getTipo() {
		return tipo;
	}

}
