package org.example.app_com_interface;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class CadastroController {

    @FXML
    public TextField campoUsuario;

    @FXML
    public TextField campoEmail;
    @FXML PasswordField campoSenha;

    @FXML
    public PasswordField campoConfirmarSenha;

    @FXML
    public Button btnVoltar;

    @FXML
    public  Button btnCriarConta;

    @FXML
    protected void onVoltarClick() throws IOException {
        HelloApplication.trocadorDeTelas("Login.fxml");

    }

    @FXML
    protected void onCadastrarClick(){
        String usuario = campoUsuario.getText();
        String email = campoEmail.getText();
        String senha = campoSenha.getText();
        String confirmarsenha = campoConfirmarSenha.getText();

// VALIDACAO BÁSICA - verifica se algum campo esta vazia
// isBlank() RETORNA TRUE SE A STRING FOR VAZIA OU SE  TIVER ESPAÇOS
        if (usuario.isBlank() || senha.isBlank() || confirmarsenha.isBlank()) {

            //EXIBE UMA JANELA DE AVISO PARA O USUÁRIO
            Alert alerta = new Alert (Alert.AlertType.WARNING);
            alerta.setTitle("Campos Obrigatórios");
            alerta.setHeaderText(null);
            alerta.setContentText("Por favor, Preencha todos os Campos antes de Cadastrar");
            alerta.showAndWait();
            return;
        }
        if (!(senha.equals(confirmarsenha))){
            Alert alerta = new Alert (Alert.AlertType.WARNING);
            alerta.setTitle("SUAS SENHAS INSERIDAS NÃO CONFEREM!!");
            alerta.setHeaderText(null);
            alerta.setContentText("As Senhas não conferem, Por favor Digite a sua Senha Novamente!");
            alerta.showAndWait();

            return;
        }
        CadastroDAO dao = new CadastroDAO();
        dao.cadastrarUsuario( usuario, email, senha);

        Alert alerta = new Alert (Alert.AlertType.INFORMATION);
        alerta.setTitle("CADASTRO REALIZADO ");
        alerta.setHeaderText(null);
        alerta.setContentText("CADASTRO REALIZADO COM SUCESSO ");
        alerta.showAndWait();

        campoUsuario.clear();
        campoEmail.clear();
        campoSenha.clear();
        campoConfirmarSenha.clear();

    }
}


