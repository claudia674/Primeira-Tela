package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class CadastroController {

    @FXML
    private PasswordField txtSenha;

    @FXML
    private PasswordField txtConfirmarSenha;

    @FXML
    private Label lblMensagem;

    @FXML
    public void criarConta() {

        String senha = txtSenha.getText();
        String confirmar = txtConfirmarSenha.getText();

        if (!senha.equals(confirmar)) {
            lblMensagem.setText("Senhas não conferem!");
            return;
        }

        lblMensagem.setText("Conta criada com sucesso!");
    }
}