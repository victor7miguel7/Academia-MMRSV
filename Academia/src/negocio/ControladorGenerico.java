package negocio;

import dados.IRepositorioGenerico;
import entidades.Exercicio;
import entidades.PlanoDeTreino;
import entidades.Treino;
import dados.RepositorioGenerico;

public class ControladorGenerico {
	
	singleton
	
	private IRepositorioGenerico<Exercicio> exercicios;
	private IRepositorioGenerico<Treino> treinos;
	private IRepositorioGenerico<PlanoDeTreino> PlanoDetreinos;
	
	public ControladorGenerico() {
		this.exercicios = new RepositorioGenerico<>();
		this.treinos = new RepositorioGenerico<>();
		this.PlanoDetreinos = new RepositorioGenerico<>();
	}

	public IRepositorioGenerico<Exercicio> getExercicios() {
		return exercicios;
	}

	public IRepositorioGenerico<Treino> getTreinos() {
		return treinos;
	}

	public IRepositorioGenerico<PlanoDeTreino> getPlanoDetreinos() {
		return PlanoDetreinos;
	}
	
	consultarFrequeciaCliente(Cliente c, Data inicio, Data fim) {
		lista = repositorioTreinoExecutado.listar(c);
		filtrar por data
		return lista.size();
	}
	
}
