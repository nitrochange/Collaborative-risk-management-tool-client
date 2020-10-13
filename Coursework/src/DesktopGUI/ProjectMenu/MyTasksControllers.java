package DesktopGUI.ProjectMenu;

import DesktopGUI.primaryStageContainer;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MyTasksControllers implements Initializable {

    @FXML
    private Button backButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }


    @FXML
    public void BackButtonHandler() {
        try {
            loadProjectMenu();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    public void loadProjectMenu() throws IOException {
        Scene scene = new Scene(new ProjectMenuLoader().LoadProjectMenu());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }
}
