package entidades;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class PlanoDeTreino {
	
	private LocalDate dataInicio;
	private Period duracao;
	private Cliente cliente;
	private List<Treino> treinos;

	public PlanoDeTreino(LocalDate dataInicio, Period duracao, Cliente cliente) {
		this.dataInicio = dataInicio;
		this.duracao = duracao;
		this.cliente = cliente;
		this.treinos = new ArrayList<>();
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public Period getDuracao() {
		return duracao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Treino> getTreinos() {
		return treinos;
	}

	public String toString() {
		return "PlanoDeTreino de " + cliente + "\nData de Inicio:" + dataInicio.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
				"\nDuracao: " + duracao + ", treino: " + treinos;
	}

}
