package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ImcMedido {
	private LocalDate data;
	private Cliente cliente;
	private double medidaImc;

	public ImcMedido(LocalDate data, Cliente cliente) {
		this.data = data;
		this.cliente = cliente;
	}

	public LocalDate getData() {
		return data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getMedidaImc() {
		return medidaImc;
	}

	

//	public void atualizarImc() {
//		listaImc.add(calcularImc());
//		
//	}
//
//	public List<Double> acompanharMassaCorporal() {
//		List<Double> imc = new ArrayList<>();
//		for (int i = 0; i < this.listaImc.size(); i++) {
//			imc.add(listaImc.get(i));
//		}
//		return imc;
//	}

	@Override
	public String toString() {
		return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " + cliente ;
	}
	
	

}
