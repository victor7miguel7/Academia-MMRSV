package models;

import java.time.LocalDate;

public abstract class Usuario {

	private String id;
	private String nome;
	private Login login;
	private LocalDate dtNascimento;

	public Usuario(String id, String nome, Login login, LocalDate dtNascimento) {
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.dtNascimento = dtNascimento;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public String getId() {
		return id;
	}

}
