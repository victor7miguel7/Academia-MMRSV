package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TreinosExecutados {
	
	private ArrayList<LocalDate> executados;
	
	//Construtor
	public TreinosExecutados() {
		executados = new ArrayList<>();
	}
	// Gets
	public ArrayList<LocalDate> getExecutados() {
		return executados;
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
	
	public void executarTreino() {
		LocalDate hoje = LocalDate.now();
		executados.add(hoje);
	}

}
