package entidades;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlanoDeTreino {
	
	private LocalDate dataInicio;
	private LocalDateTime duracao;
	private Cliente cliente;
	private Exercicio exercicio;
	
	public PlanoDeTreino(LocalDate dataInicio, LocalDateTime duracao, Cliente cliente,
			Exercicio exercicio) {
		this.dataInicio = dataInicio;
		this.duracao = duracao;
		this.cliente = cliente;
		this.exercicio = exercicio;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDateTime getDuracao() {
		return duracao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Exercicio getTreino() {
		return exercicio;
	}

	public String consultarPlano() {
		return "PlanoDeTreino de " + cliente + "\nData de Inicio:" + dataInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
				"\nDuracao: " + duracao + "\nExercicio: " + exercicio;
	}

}
