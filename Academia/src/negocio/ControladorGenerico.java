package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dados.IRepositorioGenerico;
import entidades.Cliente;
import entidades.Exercicio;
import entidades.PersonalTrainer;
import entidades.PlanoDeTreino;
import entidades.Treino;
import entidades.TreinoExecutado;
import entidades.Usuario;
import dados.RepositorioGenerico;

public class ControladorGenerico {

	private IRepositorioGenerico<Exercicio> RepositorioDeExercicios;
	private IRepositorioGenerico<Treino> RepositorioDeTreinos;
	private IRepositorioGenerico<PlanoDeTreino> RepositorioDePlanoDetreinos;
	private IRepositorioGenerico<Usuario> RepositorioDeUsuarios;
	private IRepositorioGenerico<TreinoExecutado> RepositorioDeTreinosExecutados;
	private IRepositorioGenerico<PersonalTrainer> RepositorioDePersonalTrainers;
	private static ControladorGenerico instance;

	public ControladorGenerico() {
		this.RepositorioDeExercicios = new RepositorioGenerico<>();
		this.RepositorioDeTreinos = new RepositorioGenerico<>();
		this.RepositorioDePlanoDetreinos = new RepositorioGenerico<>();
		this.RepositorioDeUsuarios = new RepositorioGenerico<>();
		this.RepositorioDeTreinosExecutados = new RepositorioGenerico<>();
		this.RepositorioDePersonalTrainers = new RepositorioGenerico<>();
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

	public IRepositorioGenerico<TreinoExecutado> getRepositorioDeTreinosExecutados() {
		return RepositorioDeTreinosExecutados;
	}

	public IRepositorioGenerico<PersonalTrainer> getRepositorioDePersonalTrainers() {
		return RepositorioDePersonalTrainers;
	}

	public int consultarFrequeciaCliente(Cliente c, LocalDate inicio, LocalDate fim) {
		List<TreinoExecutado> lista = RepositorioDeTreinosExecutados.listar();
		int frequencia = 0;
		for(int i = 0; i < lista.size(); i++) {			
			if (lista.get(i).getCliente().equals(c) && lista.get(i).getData().isAfter(inicio.minusDays(1)) 
				&& lista.get(i).getData().isBefore(fim.plusDays(1))) {
				frequencia++;
			}
		}
		return frequencia;
	}

	public List<TreinoExecutado> listarFrequenciaCliente(Cliente c) {
		List<TreinoExecutado> lista = RepositorioDeTreinosExecutados.listar();
		List<TreinoExecutado> novaLista = new ArrayList<>();
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getCliente().equals(c)) {
				novaLista.add(lista.get(i));
			}
		}
		return novaLista;
	}
}