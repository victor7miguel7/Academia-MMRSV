package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import models.Cliente;
import models.Login;
import models.Usuario;
import negocio.ServidorAcademia;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ClienteController implements Initializable {

    @FXML
    private Button logout;
    @FXML
    private Label lblID;
    @FXML
    private Label lblDtNascimento;
    @FXML
    private Label lblNome;
    @FXML
    private Label lblPeso;
    @FXML
    private Label lblAltura;
    @FXML
    private Label lblGenero;

    //ServidorAcademia servidor = ServidorAcademia.getInstance();
    //ServidorAcademia.
    Login login = new Login("maria", "123");
    Usuario cliente = new Cliente("32", "Maria Beatriz", "F", login, LocalDate.of(2000, 2,14),57,1.57);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblID.setText(String.valueOf((cliente.getId())));
        lblNome.setText(String.valueOf(cliente.getNome()));
        lblID.setText(String.valueOf((cliente.getId())));
        lblPeso.setText(String.valueOf((((Cliente)cliente).getPeso())));
        lblAltura.setText(String.valueOf((((Cliente)cliente).getAltura())));
        lblGenero.setText(String.valueOf((((Cliente) cliente).getGenero())));
        lblDtNascimento.setText(String.valueOf(cliente.getDtNascimento()));

    }

    public void userLogOut(ActionEvent event) throws IOException {
        Application m = new Application();
        m.changeScene("login.fxml");
    }

    //public  void importarCliente() {

        //Usuario u = ServidorAcademia.getInstance().usuarioListar().get(0);


//        String id = u.getId();
//        String peso =  String.valueOf(((Cliente) u).getPeso());
//        String altura = String.valueOf(((Cliente)u).getAltura());
//        String genero = ((Cliente)u).getGenero();

//        lblID.setText(id);
//        lblPeso.setText(peso);
//        lblAltura.setText(altura);
//        lblGenero.setText(genero);
//}
}
