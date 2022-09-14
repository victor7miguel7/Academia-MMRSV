package negocio;

import java.util.List;
import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import exception.ElementoJaExisteException;
import exception.ElementoNaoExisteException;
import models.PlanoDeTreino;

public class ControladorPlanoTreinos {
	private IRepositorioGenerico<PlanoDeTreino> repositorioPlanoDeTreino;
	private static ControladorPlanoTreinos instance;

	private ControladorPlanoTreinos() {
		this.repositorioPlanoDeTreino = new RepositorioGenerico<>("planoDeTreinos.dat");
	}
	
	public static ControladorPlanoTreinos getInstance() {
		if (instance == null) {
			instance = new ControladorPlanoTreinos();
		}
		return instance;
	}
	
	public void inserir(PlanoDeTreino obj) throws ElementoJaExisteException{
		this.repositorioPlanoDeTreino.inserir(obj);
	}
    
	public List<PlanoDeTreino> listar() {
		return this.repositorioPlanoDeTreino.listar();
	}
    
    public void remover(PlanoDeTreino obj) throws ElementoNaoExisteException{
    	this.repositorioPlanoDeTreino.remover(obj);
    }

    public void atualizar(PlanoDeTreino newObj) throws ElementoNaoExisteException{
    	this.repositorioPlanoDeTreino.atualizar(newObj);
    }

}
