package org.example.app_com_interface;

import
import javafx.application.Application;
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
        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(telaFxml)
        );

        // Cria a cena com o conteúdo carregado
        Scene scene = new Scene(loader.load());

        // Define a cena no Stage principal
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch();
    }
}



