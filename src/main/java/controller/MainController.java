package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.time.Duration;
import java.util.Date;

import com.types.Priority;
import com.types.SimpleTask;

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
}
