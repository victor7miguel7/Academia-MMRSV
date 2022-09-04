import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;
import entidades.Exercicio;
import entidades.ImcMedido;
import entidades.PersonalTrainer;
import entidades.PlanoDeTreino;
import entidades.Treino;
import entidades.TreinoExecutado;
import entidades.Usuario;
import negocio.ControladorGenerico;

public class Principal {

	public static void main(String[] args) {
		
		ControladorGenerico cg = new ControladorGenerico();	
		
		Usuario p = new PersonalTrainer("João", "joao@gmail.com", "123456", LocalDate.of(2000, 5, 20), "34");
		Usuario c = new Cliente("Maria", "maria@gmail.com", "m12345", LocalDate.of(1994, 7, 2), "F", 80, 1.63);
		Exercicio e1 = new Exercicio("Costas", "A");
		Exercicio e2 = new Exercicio("Pernas", "B");
		Exercicio e3 = new Exercicio("Braços", "C");
		Treino t = new Treino(e1, e2, e3);
		PlanoDeTreino pt = new PlanoDeTreino(LocalDate.of(2022, 8, 20), "2h", (Cliente) c, t);
		TreinoExecutado te = new TreinoExecutado();
		ImcMedido i = new ImcMedido(LocalDate.of(2022, 7, 4), (Cliente) c);
		
		
		cg.getExercicios().inserir(e1);
		cg.getExercicios().inserir(e2);
		cg.getExercicios().inserir(e3);
		
		cg.getTreinos().inserir(t);
		cg.getPlanoDetreinos().inserir(pt);
		
		te.executarTreino();
		
		i.atualizarImc();
		((Cliente) c).setPeso(70);
		i.atualizarImc();
		((Cliente) c).setPeso(80);
		i.atualizarImc();
		
		int frequencia = te.consultarFrequenciaNoMês(9);
		System.out.printf("A frequencia foi de %d dia no mês de Setembro\n", frequencia);
		
		List<Double> imc = i.getlistaImc();
		for (int a = 0; a<imc.size(); a++) {
			System.out.println(imc.get(a).toString());
		}
	}

}
