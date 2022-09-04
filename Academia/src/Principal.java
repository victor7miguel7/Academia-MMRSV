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
		
		Usuario personal1 = new PersonalTrainer("23", "João", "joao@gmail.com", "123456", "34", LocalDate.of(2000, 5, 20));
		Usuario cliente1 = new Cliente("54", "Maria", "maria@gmail.com", "m12345", "F", LocalDate.of(1994, 7, 2), 80, 1.63);
		Exercicio exer1 = new Exercicio("Supino Reto", "Peito", null , 4, 10);
		Exercicio exer2 = new Exercicio("Puxada Aberta", "Costas", null, 4, 10);
		Exercicio exer3 = new Exercicio("Tríceps Pulley", "Tríceps", null, 3, 12);
		Exercicio exer4 = new Exercicio("Agachamento Livre", "Quadríceps/Glúteos", null, 4, 10);
		Exercicio exer5 = new Exercicio("Extensora", "Quadríceps", null, 4, 10);
		Exercicio exer6 = new Exercicio("Stiff", "Posterior", null, 3, 12);
		Treino treino1 = new Treino("Superior");
		Treino treino2 = new Treino("Inferior");
		PlanoDeTreino planoTreino = new PlanoDeTreino(LocalDate.of(2022, 8, 20), null, (Cliente) cliente1);
		TreinoExecutado treinoExe = new TreinoExecutado((Cliente) cliente1, treino1, null);
		TreinoExecutado treinoExe2 = new TreinoExecutado((Cliente) cliente1, treino2, null);
		ImcMedido imc = new ImcMedido(LocalDate.of(2022, 7, 4), (Cliente) cliente1);
		
		
		cg.getRepositorioDeExercicios().inserir(exer1);
		cg.getRepositorioDeExercicios().inserir(exer2);
		cg.getRepositorioDeExercicios().inserir(exer3);
		cg.getRepositorioDeExercicios().inserir(exer4);
		cg.getRepositorioDeExercicios().inserir(exer5);
		cg.getRepositorioDeExercicios().inserir(exer6);
		
		cg.getRepositorioDeTreinos().inserir(treino1);
		cg.getRepositorioDePlanoDetreinos().inserir(planoTreino);
		

		int frequencia = cg.consultarFrequenciaCliente((Cliente) cliente1 , LocalDate.of(2022, 8, 20), LocalDate.of(2022, 11, 20));
		System.out.printf("A frequencia foi de %d dia no mês de Setembro\n", frequencia);
			
	}

}
