package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

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
        LoginDAO usuario = new LoginDAO();

        String usuarioDigitado = txtUsuario.getText();
        String senhaDigitada = txtSenha.getText();

        boolean autenticado = usuario.autenticar(usuarioDigitado,senhaDigitada);

        if (autenticado == true) {
            labelLogin.setText("Login realizado com sucesso!");

        } else {
            labelLogin.setText("Usuario e senha incorretas!");

        }
    }
    @FXML
    protected void irParaTelaDeCadastro() throws IOException {
        HelloApplication.trocadorDeTelas("Cadastro.fxml");
    }
}
