package negocio;

import java.util.List;

import exception.ElementoJaExisteException;
import exception.ElementoNaoExisteException;
import models.Exercicio;

public class ServidorAcademia {
	
	private static ServidorAcademia instance;
	
	private ControladorExercicios controladorExercicios;

	public ServidorAcademia() {
		this.controladorExercicios = controladorExercicios.getInstance();
	}
	
	public static ServidorAcademia getInstance() {
        if (instance == null) {
            instance = new ServidorAcademia();
        }
        return instance;
    }
	
	public void inserir(Exercicio obj) throws ElementoJaExisteException{
		controladorExercicios.inserir(obj);
	}
    
	public List<Exercicio> listar() {
		return controladorExercicios.listar();
	}
    
    public void remover(Exercicio obj) throws ElementoNaoExisteException{
    	controladorExercicios.remover(obj);
    }

    public void atualizar(Exercicio newObj) throws ElementoNaoExisteException{
    	this.controladorExercicios.atualizar(newObj);
    }

}
