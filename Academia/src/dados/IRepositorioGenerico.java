package dados;

import java.util.List;

public interface IRepositorioGenerico<R> {

	void inserir(R obj);

	void remover(R obj);

	void atualizar(R newObj);

	List<R> listar();

}
