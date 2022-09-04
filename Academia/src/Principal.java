import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

import entidades.Cliente;
import entidades.Exercicio;
import entidades.PersonalTrainer;
import entidades.PlanoDeTreino;
import entidades.Treino;
import entidades.Usuario;
import negocio.ControladorGenerico;

public class Principal {

	public static void main(String[] args) {
		
		ControladorGenerico cg = new ControladorGenerico();	
		
		Usuario personal1 = new PersonalTrainer("23", "Jo�o", "joao@gmail.com", "123456", "34", LocalDate.of(2000, 5, 20));
		Usuario cliente1 = new Cliente("54", "Maria", "maria@gmail.com", "m12345", "F", LocalDate.of(1994, 7, 2), 80, 1.63);
		
		Treino treino1 = new Treino("Superior");
		Treino treino2 = new Treino("Inferior");		
		
		Exercicio exer1 = new Exercicio("Supino Reto", "Peito", Duration.ofMinutes(10), 4, 10);
		Exercicio exer2 = new Exercicio("Puxada Aberta", "Costas", Duration.ofMinutes(15), 4, 10);
		Exercicio exer3 = new Exercicio("Tríceps Pulley", "Tríceps", Duration.ofMinutes(7), 3, 12);
		Exercicio exer4 = new Exercicio("Agachamento Livre", "Quadríceps/Glúteos", Duration.ofMinutes(10), 4, 10);
		Exercicio exer5 = new Exercicio("Extensora", "Quadríceps", Duration.ofMinutes(12), 4, 10);
		Exercicio exer6 = new Exercicio("Stiff", "Posterior", Duration.ofMinutes(8), 3, 12);
		
		PlanoDeTreino planoTreino = new PlanoDeTreino(LocalDate.of(2022, 8, 20), Period.ofDays(45), (Cliente) cliente1);
		
		cg.getRepositorioDeExercicios().inserir(exer1);
		cg.getRepositorioDeExercicios().inserir(exer2);
		cg.getRepositorioDeExercicios().inserir(exer3);
		cg.getRepositorioDeExercicios().inserir(exer4);
		cg.getRepositorioDeExercicios().inserir(exer5);
		cg.getRepositorioDeExercicios().inserir(exer6);
		
		treino1.getExercicios().inserir(exer1);
		treino1.getExercicios().inserir(exer4);
		treino1.getExercicios().inserir(exer6);
		
		treino2.getExercicios().inserir(exer2);
		treino2.getExercicios().inserir(exer3);
		treino2.getExercicios().inserir(exer5);
		
		cg.getRepositorioDeTreinos().inserir(treino1);
		cg.getRepositorioDeTreinos().inserir(treino2);
		cg.getRepositorioDePlanoDetreinos().inserir(planoTreino);
		
		for(int i=0; i<cg.getRepositorioDeTreinos().listar().size(); i++) {
			System.out.println(cg.getRepositorioDeTreinos().listar().get(i).toString());
		}
		
//		int frequencia = cg.consultarFrequenciaCliente((Cliente) cliente1 , LocalDate.of(2022, 8, 20), LocalDate.of(2022, 11, 20));
//		System.out.printf("A frequencia foi de %d dia no mes de Setembro\n", frequencia);			
	}
}