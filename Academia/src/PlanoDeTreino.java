import java.time.LocalDate;
import java.time.LocalDateTime;

public class PlanoDeTreino {
	
	private LocalDate dataInicio;
	private LocalDateTime duracao;
	private String tipoTreino;
	private Cliente cliente;
	private Treino treino;
	
	public PlanoDeTreino(LocalDate dataInicio, LocalDateTime duracao, String tipoTreino, Cliente cliente,
			Treino treino) {
		this.dataInicio = dataInicio;
		this.duracao = duracao;
		this.tipoTreino = tipoTreino;
		this.cliente = cliente;
		this.treino = treino;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public LocalDateTime getDuracao() {
		return duracao;
	}

	public String getTipoTreino() {
		return tipoTreino;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Treino getTreino() {
		return treino;
	}

}
