package gui;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import dados.RepositorioFileUtil;
import exception.ElementoJaExisteException;
import models.Cliente;
import models.Exercicio;
import models.PersonalTrainer;
//import models.PersonalTrainer;
import models.PlanoDeTreino;
import models.Treino;
import models.TreinoExecutado;
import models.Usuario;
import negocio.ControladoGenerico;
import negocio.ServidorAcademia;

public class Principal {

	public static void main(String[] args){

		ServidorAcademia servidor = ServidorAcademia.getInstance();

		Usuario personal1 = new PersonalTrainer("23", "João", "joao@gmail.com", "123456", "34", LocalDate.of(2000, 5, 20));
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

		try {
		servidor.inserir(exer1);
		servidor.inserir(exer2);
		servidor.inserir(exer3);
		servidor.inserir(exer4);
		servidor.inserir(exer5);
		servidor.inserir(exer6);

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

//		servidor.getRepositorioDeTreinos().inserir(treino1);
//		servidor.getRepositorioDeTreinos().inserir(treino2);
//
//		servidor.getRepositorioDePlanoDeTreinos().inserir(planoTreino1);
//		servidor.getRepositorioDePlanoDeTreinos().inserir(planoTreino2);
//		servidor.getRepositorioDePlanoDeTreinos().inserir(planoTreino3);
//
//		servidor.getRepositorioDeTreinosExecutados().inserir(treinoExe1);
//		servidor.getRepositorioDeTreinosExecutados().inserir(treinoExe2);
//		servidor.getRepositorioDeTreinosExecutados().inserir(treinoExe3);
//		servidor.getRepositorioDeTreinosExecutados().inserir(treinoExe4);
		
		} catch (ElementoJaExisteException jaExiste) {
            System.out.println("Elemento já existente");
            jaExiste.printStackTrace();
        }
		
//		List<Exercicio> exercicios = ControladoGenerico.getInstance().getRepositorioDeExercicios().listar();
//		List<Treino> treinos = ControladorGenerico.getInstance().getRepositorioDeTreinos().listar();
//		List<PlanoDeTreino> planos = ControladorGenerico.getInstance().getRepositorioDePlanoDeTreinos().listar();
//		List<TreinoExecutado> treinosExecutados = ControladorGenerico.getInstance().getRepositorioDeTreinosExecutados().listar();
//		List<Usuario> usuarios = ControladorGenerico.getInstance().getRepositorioDeUsuarios().listar();
		
//		List<Exercicio> exercicios = ControladorGenerico.getInstance().getExercicios();
		
//		RepositorioFileUtil.salvarArquivo(exercicios, "exercicios.dat");
//		RepositorioFileUtil.salvarArquivo(treinos, "treinos.dat");
//		RepositorioFileUtil.salvarArquivo(planos, "planoDeTreinos.dat");
//		RepositorioFileUtil.salvarArquivo(treinosExecutados, "treinosExecutados.dat");
//		RepositorioFileUtil.salvarArquivo(usuarios, "usuarios.dat");
		
//		Object obj1 = RepositorioFileUtil.lerDoArquivo("exercicios.dat");
//		System.out.println(exercicios);
		
//		Object obj2 = RepositorioFileUtil.lerDoArquivo("treinos.dat");
//		Object obj3 = RepositorioFileUtil.lerDoArquivo("planoDeTreinos.dat");
//		Object obj4 = RepositorioFileUtil.lerDoArquivo("treinosExecutados.dat");
//		Object obj5 = RepositorioFileUtil.lerDoArquivo("usuarios.dat");
		
//		System.out.println(obj2);
//		System.out.println(obj3);
//		System.out.println(obj4);
//		System.out.println(obj5);

//		System.out.println("LISTA DE TREINOS");
//		System.out.println(servidor.getRepositorioDeTreinos().listar());
//		System.out.println("-".repeat(200));
//
//		System.out.println("LISTA DE PLANOS DE TREINOS");
//		System.out.println(servidor.getRepositorioDePlanoDeTreinos().listar());
//		System.out.println("-".repeat(200));
//
//		int frequencia = servidor.consultarFrequenciaCliente((Cliente) cliente3, LocalDate.of(2022, 8, 20),
//				LocalDate.of(2022, 11, 20));
//		System.out.printf("A frequencia  de %s foi de %d dia(s) no peridodo.\n", cliente3.getNome(), frequencia);
//
//		System.out.println("-".repeat(200));
//		System.out.println("FREQUENCIA");
//		List<TreinoExecutado> listaFrequencia = servidor.listarFrequenciaCliente((Cliente) cliente3);
//		System.out.println(listaFrequencia);

	}
}