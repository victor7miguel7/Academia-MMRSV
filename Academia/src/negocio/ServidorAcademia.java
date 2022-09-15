package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import exception.ElementoJaExisteException;
import exception.ElementoNaoExisteException;
import models.Cliente;
import models.Exercicio;
import models.PlanoDeTreino;
import models.Treino;
import models.TreinoExecutado;
import models.Usuario;

public class ServidorAcademia {

	private static ServidorAcademia instance;

	private ControladorExercicios controladorExercicios;
	private ControladorUsuarios controladorUsuarios;
	private ControladorPlanoTreinos controladorPlanoTreino;
	private ControladorTreinos controladorTreino;
	private ControladorTreinosExecutados controladorTreinoExecutado;

	private ServidorAcademia() {
		this.controladorExercicios = controladorExercicios.getInstance();
		this.controladorUsuarios = controladorUsuarios.getInstance();
		this.controladorPlanoTreino = controladorPlanoTreino.getInstance();
		this.controladorTreino = controladorTreino.getInstance();
		this.controladorTreinoExecutado = controladorTreinoExecutado.getInstance();
	}

	public static ServidorAcademia getInstance() {
		if (instance == null) {
			instance = new ServidorAcademia();
		}
		return instance;
	}

	public void inserir(Exercicio obj) throws ElementoJaExisteException {
		controladorExercicios.inserir(obj);
	}

	public List<Exercicio> listar() {
		return controladorExercicios.listar();
	}

	public void remover(Exercicio obj) throws ElementoNaoExisteException {
		controladorExercicios.remover(obj);
	}

	public void atualizar(Exercicio newObj) throws ElementoNaoExisteException {
		this.controladorExercicios.atualizar(newObj);
	}

	public void inserir(Usuario obj) throws ElementoJaExisteException {
		controladorUsuarios.inserir(obj);
	}

	public List<Usuario> usuarioListar() {
		return controladorUsuarios.listar();
	}

	public void remover(Usuario obj) throws ElementoNaoExisteException {
		controladorUsuarios.remover(obj);
	}

	public void atualizar(Usuario newObj) throws ElementoNaoExisteException {
		this.controladorUsuarios.atualizar(newObj);
	}

	public void inserir(PlanoDeTreino obj) throws ElementoJaExisteException {
		this.controladorPlanoTreino.inserir(obj);
	}

	public List<PlanoDeTreino> planoTreinoListar() {
		return this.controladorPlanoTreino.listar();
	}

	public void remover(PlanoDeTreino obj) throws ElementoNaoExisteException {
		this.controladorPlanoTreino.remover(obj);
	}

	public void atualizar(PlanoDeTreino newObj) throws ElementoNaoExisteException {
		this.controladorPlanoTreino.atualizar(newObj);
	}

	public void inserir(Treino obj) throws ElementoJaExisteException {
		this.controladorTreino.inserir(obj);
	}

	public List<Treino> treinoListar() {
		return this.controladorTreino.listar();
	}

	public void remover(Treino obj) throws ElementoNaoExisteException {
		this.controladorTreino.remover(obj);
	}

	public void atualizar(Treino newObj) throws ElementoNaoExisteException {
		this.controladorTreino.atualizar(newObj);
	}

	public void inserir(TreinoExecutado obj) throws ElementoJaExisteException {
		this.controladorTreinoExecutado.inserir(obj);
	}

	public List<TreinoExecutado> treinoExecutadoListar() {
		return this.controladorTreinoExecutado.listar();
	}

	public void remover(TreinoExecutado obj) throws ElementoNaoExisteException {
		this.controladorTreinoExecutado.remover(obj);
	}

	public void atualizar(TreinoExecutado newObj) throws ElementoNaoExisteException {
		this.controladorTreinoExecutado.atualizar(newObj);
	}

	public int consultarFrequenciaCliente(Cliente c, LocalDate inicio, LocalDate fim) {
		List<TreinoExecutado> lista = controladorTreinoExecutado.listar();
		int frequencia = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCliente().equals(c) && lista.get(i).getData().isAfter(inicio.minusDays(1))
					&& lista.get(i).getData().isBefore(fim.plusDays(1))) {
				frequencia++;
			}
		}
		return frequencia;
	}

	public List<TreinoExecutado> listarFrequenciaCliente(Cliente c) {
		List<TreinoExecutado> lista = controladorTreinoExecutado.listar();
		List<TreinoExecutado> novaLista = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getCliente().equals(c)) {
				novaLista.add(lista.get(i));
			}
		}
		return novaLista;
	}
	
	public boolean validarLogin(String email, String senha) {
		boolean achou = false;

		for (int i = 0; i < controladorUsuarios.listar().size(); i++) {
			if (controladorUsuarios.listar().get(i).getEmail().equals(email)) {
				if (controladorUsuarios.listar().get(i).getSenha().equals(senha)) {
					achou = true;
				}
			}

		}
		return achou;
	}

}
