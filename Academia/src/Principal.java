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
		
		Usuario p = new PersonalTrainer("23", "João", "joao@gmail.com", "123456", "34", LocalDate.of(2000, 5, 20));
		Usuario c = new Cliente("54", "Maria", "maria@gmail.com", "m12345", "F", LocalDate.of(1994, 7, 2), 80, 1.63);
		Exercicio e1 = new Exercicio("Costas", "A", null, 0);
		Exercicio e2 = new Exercicio("Pernas", "B", null, 0);
		Exercicio e3 = new Exercicio("Braços", "C", null, 0);
		Treino t = new Treino();
		PlanoDeTreino pt = new PlanoDeTreino(LocalDate.of(2022, 8, 20), "2h", (Cliente) c, t);
		TreinoExecutado te = new TreinoExecutado(null, t, null, null);
		ImcMedido i = new ImcMedido(LocalDate.of(2022, 7, 4), (Cliente) c);
		
		
		cg.getRepositorioDeExercicios().inserir(e1);
		cg.getRepositorioDeExercicios().inserir(e2);
		cg.getRepositorioDeExercicios().inserir(e3);
		
		cg.getRepositorioDeTreinos().inserir(t);
		cg.getRepositorioDePlanoDetreinos().inserir(pt);
		
		te.executarTreino();
		
		i.atualizarImc();
		((Cliente) c).setPeso(70);
		i.atualizarImc();
		((Cliente) c).setPeso(80);
		i.atualizarImc();
		
		int frequencia = te.consultarFrequenciaNoMês(9);
		System.out.printf("A frequencia foi de %d dia no mês de Setembro\n", frequencia);
		
		List<Double> imc;
		for (int a = 0; a<imc.size(); a++) {
			System.out.println(imc.get(a).toString());
		}
	}

}
