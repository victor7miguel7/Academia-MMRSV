package negocio;

import java.util.List;
import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import exception.ElementoJaExisteException;
import exception.ElementoNaoExisteException;
import models.PlanoDeTreino;

public class ControladorPlanoTreino {
	private IRepositorioGenerico<PlanoDeTreino> repositorioPlanoDeTreino;
	private static ControladorPlanoTreino instance;

	private ControladorPlanoTreino() {
		this.repositorioPlanoDeTreino = new RepositorioGenerico<>("planoDeTreinos.dat");
	}
	
	public static ControladorPlanoTreino getInstance() {
		if (instance == null) {
			instance = new ControladorPlanoTreino();
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
