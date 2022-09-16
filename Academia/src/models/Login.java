package models;

public class Login {

	private String email;
	private String senha;
	
	public Login(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public boolean compare(Login l) {
		
			return this.email.equals(l.email) && this.senha.equals(l.senha);
		
	}
}
