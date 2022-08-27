import java.time.LocalDate;

public class PersonalTrainer extends Usuario{

	private String iD;
	
	public PersonalTrainer(String nome, String email, String senha, LocalDate dtNascimento, String iD) {
		super(nome, email, senha, dtNascimento);
		this.iD = iD;
	}
}
