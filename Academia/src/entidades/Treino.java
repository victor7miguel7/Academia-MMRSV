package entidades;

public class Treino {
	
	private Exercicio e1;
	private Exercicio e2;
	private Exercicio e3;
	
	public Treino(Exercicio e1, Exercicio e2, Exercicio e3) {
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}

	public Exercicio getE1() {
		return e1;
	}

	public Exercicio getE2() {
		return e2;
	}

	public Exercicio getE3() {
		return e3;
	}

}
