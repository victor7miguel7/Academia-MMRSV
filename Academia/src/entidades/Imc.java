package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Imc {
	private LocalDate data;
	private Cliente cliente;
	private List<Double> listaImc;

	public Imc(LocalDate data, Cliente cliente) {
		this.data = data;
		this.cliente = cliente;
		this.listaImc = new ArrayList<>();
//		cliente.setImc(calcularImc());
//		atualizarImc();
	}

	public LocalDate getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public List<Double> getlistaImc() {
		return listaImc;
	}

	public double calcularImc() {
		double peso = cliente.getPeso();
		double altura = cliente.getAltura();
		double imc = peso / (altura * altura);

		return imc;
	}

	public void atualizarImc() {
		listaImc.add(calcularImc());
		
	}

	public List<Double> acompanharMassaCorporal() {
		List<Double> imc = new ArrayList<>();
		for (int i = 0; i < this.listaImc.size(); i++) {
			imc.add(listaImc.get(i));
		}
		return imc;
	}

	@Override
	public String toString() {
		return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " + cliente ;
	}
	
	

}
