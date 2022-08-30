package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TreinosExecutados {
	
	private PlanoDeTreino plano;
	private ArrayList<LocalDate> executados;
	
	//Construtor
	public TreinosExecutados(PlanoDeTreino plano) {
		this.plano = plano;
		executados = new ArrayList<>();
	}
	// Gets
	public PlanoDeTreino getPlano() {
		return plano;
	}
	
	//Métodos
	public int consultarFrequenciaNoMês(int mes) {
		int frequencia = 0;
		for(int i = 0; i < executados.size(); i++) {    
            if((executados.get(i)).getMonthValue() == mes) {
                frequencia++;
            }                 
        }
		return frequencia;		
	}
	
	public List<PlanoDeTreino> acompanharMassaCorporal(){
		return null;
		
	}
	
	public void executarTreino() {
		LocalDate hoje = LocalDate.now();
		executados.add(hoje);
	}

}
