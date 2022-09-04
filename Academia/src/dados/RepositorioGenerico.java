package dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositorioGenerico<R> implements IRepositorioGenerico<R> {

	protected List<R> elementos;

	public RepositorioGenerico() {
		this.elementos = new ArrayList<>();

		if (elementos != null && elementos instanceof List<?>) {
			this.elementos = (List<R>) elementos;
		}
	}

	public void inserir(R newObj) {
		if (!this.elementos.contains(newObj)) {
			this.elementos.add(newObj);
		}
	}

	public void remover(R obj) {
		if(this.elementos.contains(obj)) {
			this.elementos.remove(this.elementos.indexOf(obj));
		}
	}

	public void atualizar(R newObj) {
		if (this.elementos.contains(newObj)) {
			int indice = this.elementos.indexOf(newObj);
			this.elementos.set(indice,newObj);
		}
	}

	public List<R> listar() {
		return Collections.unmodifiableList(this.elementos);
	}
}
