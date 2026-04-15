package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Button btnLogin;

    @FXML
    private Label labelLogin;

    @FXML
    protected void onButtonLoginClick() {
        LoginDAO usuario = new LoginDAO();

        String usuarioDigitado = txtUsuario.getText();
        String senhaDigitada = txtSenha.getText();

        boolean autenticado = usuario.autenticar(usuarioDigitado, senhaDigitada);

        if (autenticado) {
            labelLogin.setText(" senha correta");
        } else {
            labelLogin.setText("senha incorreta");
        }
    }

    @FXML
    protected void irParaTelaDeCadastro() throws IOException {
        HelloApplication.trocadorDeTelas("cadastro.fxml");
    }
}