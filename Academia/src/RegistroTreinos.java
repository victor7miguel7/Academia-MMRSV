import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RegistroTreinos {
	
	List<Treino> treinos;
	private LocalDateTime horaDeExecucao;
	
	public RegistroTreinos(List<Treino> treinos, LocalDateTime horaDeExecucao) {
		this.treinos = new ArrayList<>();
		this.horaDeExecucao = horaDeExecucao;
	}

	public List<Treino> getTreinos() {
		return treinos;
	}

	public LocalDateTime getHoraDeExecucao() {
		return horaDeExecucao;
	}
	
	public List<Treino> consultarTreinos(){
		return treinos;
		
	}
	
	public List<Treino> consultarFrequenciaNoMes(Cliente c, int mes){
		return treinos;
		
	}
	

}
