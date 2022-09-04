import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import entidades.Cliente;
import entidades.Exercicio;
import entidades.PersonalTrainer;
import entidades.PlanoDeTreino;
import entidades.Treino;
import entidades.TreinoExecutado;
import entidades.Usuario;
import negocio.ControladorGenerico;

public class Principal {

	public static void main(String[] args) {

		ControladorGenerico cg = new ControladorGenerico();

		Usuario personal1 = new PersonalTrainer("23", "Jo�o", "joao@gmail.com", "123456", "34",
				LocalDate.of(2000, 5, 20));
		Usuario cliente1 = new Cliente("54", "Maria", "maria@gmail.com", "m12345", "F", LocalDate.of(1994, 7, 2), 80,
				1.63);
		Usuario cliente2 = new Cliente("55", "Stella", "stella@gmail.com", "m54321", "F", LocalDate.of(1995, 5, 19), 60,
				1.65);
		Usuario cliente3 = new Cliente("56", "Rafael", "rafael@gmail.com", "m32145", "M", LocalDate.of(2003, 8, 19), 75,
				1.74);

		Treino treino1 = new Treino("Superior");
		Treino treino2 = new Treino("Inferior");

		Exercicio exer1 = new Exercicio("Supino Reto", "Peito", Duration.ofMinutes(10), 4, 10);
		Exercicio exer2 = new Exercicio("Puxada Aberta", "Costas", Duration.ofMinutes(15), 4, 10);
		Exercicio exer3 = new Exercicio("Tríceps Pulley", "Tríceps", Duration.ofMinutes(7), 3, 12);
		Exercicio exer4 = new Exercicio("Agachamento Livre", "Quadríceps/Glúteos", Duration.ofMinutes(10), 4, 10);
		Exercicio exer5 = new Exercicio("Extensora", "Quadríceps", Duration.ofMinutes(12), 4, 10);
		Exercicio exer6 = new Exercicio("Stiff", "Posterior", Duration.ofMinutes(8), 3, 12);

		PlanoDeTreino planoTreino1 = new PlanoDeTreino(LocalDate.of(2022, 8, 20), Period.ofDays(45),
				(Cliente) cliente1);
		PlanoDeTreino planoTreino2 = new PlanoDeTreino(LocalDate.of(2022, 8, 20), Period.ofDays(45),
				(Cliente) cliente2);
		PlanoDeTreino planoTreino3 = new PlanoDeTreino(LocalDate.of(2022, 8, 20), Period.ofDays(45),
				(Cliente) cliente3);

		TreinoExecutado treinoExe1 = new TreinoExecutado((Cliente) cliente1, treino1, LocalDate.of(2022, 8, 21));
		TreinoExecutado treinoExe2 = new TreinoExecutado((Cliente) cliente2, treino2, LocalDate.of(2022, 8, 22));
		TreinoExecutado treinoExe3 = new TreinoExecutado((Cliente) cliente3, treino2, LocalDate.of(2022, 8, 22));
		TreinoExecutado treinoExe4 = new TreinoExecutado((Cliente) cliente3, treino1, LocalDate.of(2022, 8, 22));

		cg.getRepositorioDeExercicios().inserir(exer1);
		cg.getRepositorioDeExercicios().inserir(exer2);
		cg.getRepositorioDeExercicios().inserir(exer3);
		cg.getRepositorioDeExercicios().inserir(exer4);
		cg.getRepositorioDeExercicios().inserir(exer5);
		cg.getRepositorioDeExercicios().inserir(exer6);

		treino1.getExercicios().inserir(exer1);
		treino1.getExercicios().inserir(exer2);
		treino1.getExercicios().inserir(exer3);

		treino2.getExercicios().inserir(exer4);
		treino2.getExercicios().inserir(exer5);
		treino2.getExercicios().inserir(exer6);

		planoTreino1.getTreinos().inserir(treino1);
		planoTreino2.getTreinos().inserir(treino2);
		planoTreino3.getTreinos().inserir(treino1);
		planoTreino3.getTreinos().inserir(treino2);

		cg.getRepositorioDeTreinos().inserir(treino1);
		cg.getRepositorioDeTreinos().inserir(treino2);

		cg.getRepositorioDePlanoDetreinos().inserir(planoTreino1);
		cg.getRepositorioDePlanoDetreinos().inserir(planoTreino2);
		cg.getRepositorioDePlanoDetreinos().inserir(planoTreino3);

		cg.getRepositorioDeTreinosExecutados().inserir(treinoExe1);
		cg.getRepositorioDeTreinosExecutados().inserir(treinoExe2);
		cg.getRepositorioDeTreinosExecutados().inserir(treinoExe3);
		cg.getRepositorioDeTreinosExecutados().inserir(treinoExe4);

		System.out.println("LISTA DE TREINOS");
		System.out.println(cg.getRepositorioDeTreinos().listar());
		System.out.println("-".repeat(200));

		System.out.println("LISTA DE PLANOS DE TREINOS");
		System.out.println(cg.getRepositorioDePlanoDetreinos().listar());
		System.out.println("-".repeat(200));

		int frequencia = cg.consultarFrequenciaCliente((Cliente) cliente3, LocalDate.of(2022, 8, 20),
				LocalDate.of(2022, 11, 20));
		System.out.printf("A frequencia  de %s foi de %d dia(s) no peridodo.\n", cliente3.getNome(), frequencia);

		System.out.println("-".repeat(200));
		System.out.println("FREQUENCIA");
		List<TreinoExecutado> listaFrequencia = cg.listarFrequenciaCliente((Cliente) cliente3);
		System.out.println(listaFrequencia);

	}
}