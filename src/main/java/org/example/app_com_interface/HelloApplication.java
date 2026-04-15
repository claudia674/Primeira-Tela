package org.example.app_com_interface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;

        // Carrega a tela inicial
        trocadorDeTelas("Login.fxml");

        primaryStage.setTitle("Sistema genérico");
        primaryStage.show();
    }

    // Método para trocar de tela
    public static void trocadorDeTelas(String telaFxml) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(telaFxml)
        );

        Scene scene = new Scene(loader.load(), 800, 600);

        primaryStage.setScene(scene); //
    }

    public static void main(String[] args) {
        launch();
    }
}