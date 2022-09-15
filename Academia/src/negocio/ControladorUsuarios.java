package negocio;

import java.util.ArrayList;
import java.util.List;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import exception.ElementoJaExisteException;
import exception.ElementoNaoExisteException;
import models.Usuario;

public class ControladorUsuarios {

	private IRepositorioGenerico<Usuario> repositorioDeUsuarios;
	private static ControladorUsuarios instance;

	private ControladorUsuarios() {
		this.repositorioDeUsuarios = new RepositorioGenerico<>("exercicios.dat");
	}

	public static ControladorUsuarios getInstance() {
		if (instance == null) {
			instance = new ControladorUsuarios();
		}
		return instance;
	}

	public void inserir(Usuario obj) throws ElementoJaExisteException {
		this.repositorioDeUsuarios.inserir(obj);
	}

	public List<Usuario> listar() {
		return this.repositorioDeUsuarios.listar();
	}

	public void remover(Usuario obj) throws ElementoNaoExisteException {
		this.repositorioDeUsuarios.remover(obj);
	}

	public void atualizar(Usuario newObj) throws ElementoNaoExisteException {
		this.repositorioDeUsuarios.atualizar(newObj);
	}

	public boolean validarLogin(String email, String senha) {
		boolean achou = false;

		for (int i = 0; i < repositorioDeUsuarios.listar().size(); i++) {
			if (repositorioDeUsuarios.listar().get(i).getEmail().equals(email)) {
				if (repositorioDeUsuarios.listar().get(i).getSenha().equals(senha)) {
					achou = true;
				}
			}

		}
		return achou;
	}

}