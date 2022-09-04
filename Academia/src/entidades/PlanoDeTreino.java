package entidades;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PlanoDeTreino {
	
	private LocalDate dataInicio;
	private String duracao;
	private Cliente cliente;
	private List<Treino> treinos; // Alteração

	public PlanoDeTreino(LocalDate dataInicio, String duracao, Cliente cliente, List<Treino> treinos) {
		this.dataInicio = dataInicio;
		this.duracao = duracao;
		this.cliente = cliente;
		this.treinos = treinos;
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

	public List<Treino> getTreinos() {
		return treinos;
	}

	public String consultarPlano() {
		return "PlanoDeTreino de " + cliente + "\nData de Inicio:" + dataInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
				"\nDuracao: " + duracao;
	}

}
