package negocio;

import dados.IRepositorioGenerico;
import entidades.Exercicio;
import entidades.PlanoDeTreino;
import entidades.Treino;
import entidades.Usuario;
import dados.RepositorioGenerico;

public class ControladorGenerico {
	
	private IRepositorioGenerico<Exercicio> RepositorioDeExercicios;
	private IRepositorioGenerico<Treino> RepositorioDeTreinos;
	private IRepositorioGenerico<PlanoDeTreino> RepositorioDePlanoDetreinos;
	private IRepositorioGenerico<Usuario> RepositorioDeUsuarios;
	private static ControladorGenerico instance;
	
	public ControladorGenerico() {
		this.RepositorioDeExercicios = new RepositorioGenerico<>();
		this.RepositorioDeTreinos = new RepositorioGenerico<>();
		this.RepositorioDePlanoDetreinos = new RepositorioGenerico<>();
		this.RepositorioDeUsuarios = new RepositorioGenerico<>();
	}
	
	public static ControladorGenerico getInstance() {
        if (instance == null) {
            instance = new ControladorGenerico();
        }
        return instance;
    }

	public IRepositorioGenerico<Exercicio> getRepositorioDeExercicios() {
		return RepositorioDeExercicios;
	}

	public IRepositorioGenerico<Treino> getRepositorioDeTreinos() {
		return RepositorioDeTreinos;
	}

	public IRepositorioGenerico<PlanoDeTreino> getRepositorioDePlanoDetreinos() {
		return RepositorioDePlanoDetreinos;
	}

	public IRepositorioGenerico<Usuario> getRepositorioDeUsuarios() {
		return RepositorioDeUsuarios;
	}
	
//	consultarFrequeciaCliente(Cliente c, Data inicio, Data fim) {
//		lista = repositorioTreinoExecutado.listar(c);
//		filtrar por data
//		return lista.size();
//	}
	
}
