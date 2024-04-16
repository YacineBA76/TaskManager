package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.time.Duration;
import java.util.Date;

import javafx.stage.Stage;
import models.Priority;
import models.SimpleTask;

public class MainController {
    @FXML
    private TextField taskNameTextField;

    @FXML
    private Label taskNameLabel;

    // Méthode appelée lors du clic sur le bouton "Add Task"
    @FXML
    private void onAddTaskButtonClick() {
        String taskName = taskNameTextField.getText();
        SimpleTask task = new SimpleTask("Task 1", 20, Priority.URGENT, Duration.ofHours(2), new Date());
        taskNameLabel.setText("New task added: " + task.getDescription());
    }

    @FXML
    private void onCloseButtonClick(ActionEvent event) {
        // Récupérer la scène à partir de n'importe quel nœud de la vue
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        // Fermer la scène
        stage.close();
    }
}
