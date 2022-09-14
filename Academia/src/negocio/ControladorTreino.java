package negocio;

import java.util.List;
import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import exception.ElementoJaExisteException;
import exception.ElementoNaoExisteException;
import models.Treino;

public class ControladorTreino {
	private IRepositorioGenerico<Treino> repositorioTreino;
	private static ControladorTreino instance;

	private ControladorTreino() {
		this.repositorioTreino = new RepositorioGenerico<>("treinos.dat");
	}
	
	public static ControladorTreino getInstance() {
		if (instance == null) {
			instance = new ControladorTreino();
		}
		return instance;
	}
	
	public void inserir(Treino obj) throws ElementoJaExisteException{
		this.repositorioTreino.inserir(obj);
	}
    
	public List<Treino> listar() {
		return this.repositorioTreino.listar();
	}
    
    public void remover(Treino obj) throws ElementoNaoExisteException{
    	this.repositorioTreino.remover(obj);
    }

    public void atualizar(Treino newObj) throws ElementoNaoExisteException{
    	this.repositorioTreino.atualizar(newObj);
    }

}


