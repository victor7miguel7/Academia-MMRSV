package entidades;

import java.util.List;

public class TreinosExecutados {
	
	private PlanoDeTreino plano;
	
	//Construtor
	public TreinosExecutados(PlanoDeTreino plano) {
		this.plano = plano;
	}
	// Gets
	public PlanoDeTreino getPlano() {
		return plano;
	}
	
	//Métodos
	public int consultarFrequenciaNoMês(int mes) {
		return 0;		
	}
	
	public List<PlanoDeTreino> acompanharMassaCorporal(){
		return null;
		
	}
	
	public void executarTreino() {
		
	}

}
