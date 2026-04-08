package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField txtUsuario;
    @FXML
    PasswordField txtSenha;
    @FXML
    Button btnLogin;
    @FXML
    Label labelLogin;

    @FXML
    protected void onButtonLoginClick(){
        labelLogin.setText("Login realizado com sucesso!");
    }
}
