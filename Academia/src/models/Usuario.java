package models;

import java.time.LocalDate;

public abstract class Usuario {
	
	private String id;
	private String nome;
	private String email;
	private String senha;
	private LocalDate dtNascimento;
	
	public Usuario(String id, String nome, String email, String senha, LocalDate dtNascimento) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public String getId() {
		return id;
	}
	
	

}
	
