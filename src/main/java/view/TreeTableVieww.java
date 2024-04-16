package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.stage.Stage;

public class TreeTableVieww extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Création de la racine de l'arborescence
        TreeItem<String> root = new TreeItem<>("Tâches");

        // Création de la colonne pour afficher les tâches
        TreeTableColumn<String, String> taskColumn = new TreeTableColumn<>("Tâche");
        taskColumn.setCellValueFactory(param -> new javafx.beans.property.SimpleStringProperty(param.getValue().getValue()));

        // Création de la TreeTableView et configuration des colonnes
        TreeTableView<String> treeTableView = new TreeTableView<>(root);
        treeTableView.getColumns().add(taskColumn);

        // Ajout de quelques données de tâche de test
        TreeItem<String> task1 = new TreeItem<>("Tâche 1");
        TreeItem<String> task2 = new TreeItem<>("Tâche 2");
        TreeItem<String> task3 = new TreeItem<>("Tâche 3");

        root.getChildren().addAll(task1, task2, task3);

        // Configuration de la scène
        Scene scene = new Scene(treeTableView, 400, 300);

        // Affichage de la scène
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exemple de TreeTableView pour les tâches");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
