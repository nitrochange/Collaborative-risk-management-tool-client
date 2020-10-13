package DesktopGUI.ProjectMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjectMenuLoader extends Application {

    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent LoadProjectMenu() throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/ProjectMenu.fxml"));
        System.out.println("FXML loaded");
        return root;
    }
}
