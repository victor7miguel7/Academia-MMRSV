package entidades;

import java.time.LocalDate;

public class Administrador extends Usuario{
	
	String id;

	public Administrador(String nome, String email, String senha, LocalDate dtNascimento, String id) {
		super(nome, email, senha, dtNascimento);
		this.id = id;
	}

	public String getid() {
		return id;
	}
	
}
