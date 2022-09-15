package gui;

import negocio.ServidorAcademia;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
public class LogIn {

    public LogIn() {

    }

    @FXML
    private Button button;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;



    public void userLogIn(ActionEvent event) throws IOException {
        checkLogin();

    }

    private void checkLogin() throws IOException {
        Main m = new Main();
        
        
        if(ServidorAcademia.getInstance().validarLogin(username.getText(), password.getText()) == true) {

            m.changeScene("afterLogin.fxml");
        }

        else if(username.getText().isEmpty() && password.getText().isEmpty()) {
            wrongLogIn.setText("Por favor, preencha os espaços em branco.");
        }


        else {
            wrongLogIn.setText("Login ou senha incorretos!");
        }
    }


}