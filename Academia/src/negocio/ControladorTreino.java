package negocio;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import models.Treino;

public class ControladorTreino {
	
	private static ControladorTreino instance;
	private IRepositorioGenerico<Treino> repositorioDeTreinos;

	private ControladorTreino() {
		
		this.repositorioDeTreinos = new RepositorioGenerico<>("Treinos.dat");
	}
	public static ControladorTreino getInstance() {
		if (instance == null) {
			instance = new ControladorTreino();
		}
		return instance;
	}
	public IRepositorioGenerico<Treino> getRepositorioDeTreinos() {
		return repositorioDeTreinos;
	}
	
	
	

}
