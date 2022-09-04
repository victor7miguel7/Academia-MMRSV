package entidades;

import java.time.LocalDate;

public class PersonalTrainer extends Usuario{

	private String cref;

	public PersonalTrainer(String id, String cref, String nome, String email, String senha, LocalDate dtNascimento) {
		super(id, nome, email, senha, dtNascimento);
		this.cref = cref;
	}

	public String getCref() {
		return cref;
	}
	
}
