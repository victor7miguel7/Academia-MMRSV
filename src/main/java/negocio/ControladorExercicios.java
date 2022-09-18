package negocio;

import java.util.List;

import dados.IRepositorioGenerico;
import dados.RepositorioGenerico;
import exception.ElementoJaExisteException;
import exception.ElementoNaoExisteException;
import models.Exercicio;

public class ControladorExercicios {
    private IRepositorioGenerico<Exercicio> repositorioDeExercicios;
    private static ControladorExercicios instance;

    private ControladorExercicios() {
        this.repositorioDeExercicios = new RepositorioGenerico<>("exercicios.dat");
    }

    public static ControladorExercicios getInstance() {
        if (instance == null) {
            instance = new ControladorExercicios();
        }
        return instance;
    }

    public void inserir(Exercicio obj) throws ElementoJaExisteException{
        this.repositorioDeExercicios.inserir(obj);
    }

    public List<Exercicio> listar() {
        return this.repositorioDeExercicios.listar();
    }

    public void remover(Exercicio obj) throws ElementoNaoExisteException{
        this.repositorioDeExercicios.remover(obj);
    }

    public void atualizar(Exercicio newObj) throws ElementoNaoExisteException{
        this.repositorioDeExercicios.atualizar(newObj);
    }

}