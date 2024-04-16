package utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NavigationManager {

    public static void navigateTo(String fxmlPath) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(NavigationManager.class.getResource(fxmlPath));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) Stage.getWindows().get(0);
            stage.setScene(new Scene(root,800,800));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
