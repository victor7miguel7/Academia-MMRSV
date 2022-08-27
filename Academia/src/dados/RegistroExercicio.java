package dados;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entidades.Exercicio;

public class RegistroExercicio {
	
	List<Exercicio> exercicios;
	private LocalDateTime horaDeExecucao;
	
	public RegistroExercicio(List<Exercicio> treinos, LocalDateTime horaDeExecucao) {
		this.exercicios = new ArrayList<>();
		this.horaDeExecucao = horaDeExecucao;
	}

	public List<Exercicio> getTreinos() {
		return exercicios;
	}

	public LocalDateTime getHoraDeExecucao() {
		return horaDeExecucao;
	}
	
}
