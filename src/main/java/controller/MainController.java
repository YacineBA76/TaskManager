package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import utils.NavigationManager;
public class MainController {

    @FXML
    private Label welcomeLabel;

    @FXML
    private Text welcomeText;

    @FXML
    private Text headerTitle;

    @FXML
    private Text footer1Text;

    @FXML
    private Text footerText;


    @FXML
    private Button startButton;

    @FXML
    public void initialize() {
        headerTitle.setText("Gestion des tâches");
        welcomeText.setText("Bienvenue dans votre application de gestion des tâches !");
        welcomeLabel.setText("Ici, vous avez la liberté de vous organiser à votre propre rythme");
        startButton.setText("Commencer");
        footerText.setText("Application réalisée par Toubal Zine-Eddine et Benahmed Yacine");
        footer1Text.setText("© 2024 Tous droits réservés");
        startButton.setOnAction(event -> {
            System.out.println("Le bouton 'Commencer' a été cliqué ! navigate to taskListView");
            NavigationManager.navigateTo("/TaskListView.fxml");
        });
    }

    @FXML
    private void onStartButtonClick(ActionEvent event) {
        // Code à exécuter lorsque le bouton "Commencer" est cliqué
        System.out.println("Le bouton 'Commencer' a été cliqué !");
    }
}
