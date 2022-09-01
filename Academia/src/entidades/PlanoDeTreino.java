package entidades;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PlanoDeTreino {
	
	private LocalDate dataInicio;
	private String duracao;
	private Cliente cliente;
	private Treino treino;
	
	public PlanoDeTreino(LocalDate dataInicio, String duracao, Cliente cliente,
			Treino treino) {
		this.dataInicio = dataInicio;
		this.duracao = duracao;
		this.cliente = cliente;
		this.treino = treino;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public String getDuracao() {
		return duracao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Treino getTreino() {
		return treino;
	}

	public String consultarPlano() {
		return "PlanoDeTreino de " + cliente + "\nData de Inicio:" + dataInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
				"\nDuracao: " + duracao + "\nTreino: " + treino;
	}

}
