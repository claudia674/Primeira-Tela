package org.example.app_com_interface;

import
import javafx.application.Application;
<<<<<<< HEAD
import javafx.stage.Stage;...

public class HelloApplication extends Application {
    //Guarda o Stage principal para ser acessado de qualquer controller
    private static Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage =stage
        Application.setUserAgentStylesheet(new primelight().getUserAgentStyleshee());
        // Carrega a tela inicial (login.fxml)
        trocadorDeTelas("fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Metodo estático para trocar de tela a partir de qualquer controller.
     *
     * @param telaFxml Nome do arquivo .fxml (ex: "cadastro.fxml")
     */
    public static void trocadorDeTelas(String telaFxml) throws IOException {
        // Carrega o arquivo .fxml do diretório resources/com/example/demo/
=======
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

>>>>>>> 91fbd1fba846cb64341be728e6681f4fec1dd9d0
        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(telaFxml)
        );

<<<<<<< HEAD
        // Cria a cena com o conteúdo carregado
        Scene scene = new Scene(loader.load());

        // Define a cena no Stage principal
        primaryStage.setScene(scene);
=======
        Scene scene = new Scene(loader.load(), 800, 600);

        primaryStage.setScene(scene); //
>>>>>>> 91fbd1fba846cb64341be728e6681f4fec1dd9d0
    }

    public static void main(String[] args) {
        launch();
    }
<<<<<<< HEAD
}



=======
}
>>>>>>> 91fbd1fba846cb64341be728e6681f4fec1dd9d0
