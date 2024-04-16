package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Chargement du fichier FXML principal
        Parent root = FXMLLoader.load(getClass().getResource("/MainView.fxml"));

        // Configuration de la scène
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Task Manager"); // Titre de l'application
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Lancement de l'application
    }
}
