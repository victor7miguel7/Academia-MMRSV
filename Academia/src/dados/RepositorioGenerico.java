package dados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioGenerico<R> implements IRepositorioGenerico {

	protected List<R> elementos;

	public RepositorioGenerico() {
		this.elementos = new ArrayList<>();
		
		if (elementos != null && elementos instanceof List<?>){
            this.elementos = (List<R>) elementos;
        }
	}

	public void inserir(Object novoObj) {

	}

	public void remover(Object obj) {

	}

	public void atualizar(Object newObj) {

	}

	public List<R> listar() {

		return null;
	}

}
