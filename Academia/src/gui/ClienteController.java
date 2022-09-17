package gui;

import java.awt.Label;

import javafx.fxml.FXML;
import models.Cliente;
import models.Usuario;
import negocio.ServidorAcademia;

public class ClienteController {
	
	@FXML
	private Label lblID;
	@FXML
	private Label lblPeso;
	@FXML
	private Label lblAltura;
	@FXML
	private Label lblGenero;
	
	
	public  void importarCliente() {
		
	 Usuario u = ServidorAcademia.getInstance().usuarioListar().get(0);
	 
	 String id = u.getId();
	 String peso =  String.valueOf(((Cliente) u).getPeso());
	 String altura = String.valueOf(((Cliente)u).getAltura());
	 String genero = ((Cliente)u).getGenero();
	 
	
	 
	 lblID.setText(id);
	 lblPeso.setText(peso);
	 lblAltura.setText(altura);
	 lblGenero.setText(genero);
	 
	}
	
	
	
	
	
 }
