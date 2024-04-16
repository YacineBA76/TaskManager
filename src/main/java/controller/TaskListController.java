package controller;

import javafx.fxml.FXML;

public class TaskListController {

    @FXML
    private void addTask() {
        System.out.println("Le bouton 'add task' a été cliqué !");
    }

    @FXML
    private void deleteTask() {
        System.out.println("Le bouton 'delete task' a été cliqué !");
    }
}
