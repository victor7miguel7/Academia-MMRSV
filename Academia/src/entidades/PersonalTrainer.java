package entidades;

import java.time.LocalDate;

public class PersonalTrainer extends Usuario{
	
	cref

	private String id;
	
	public PersonalTrainer(String nome, String email, String senha, LocalDate dtNascimento, String id) {
		super(nome, email, senha, dtNascimento);
		this.id = id;
	}

	public String getId() {
		return id;
	}
	
}
