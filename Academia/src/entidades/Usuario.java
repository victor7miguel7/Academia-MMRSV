package entidades;

import java.time.LocalDate;

public class Usuario {
	id
	String nome;
	String email;
	String senha;
	LocalDate dtNascimento;
	
	public Usuario(String nome, String email, String senha, LocalDate dtNascimento) {
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
	
	public void cadastrarLogin (String Login, String senha) {
		
	}

}
