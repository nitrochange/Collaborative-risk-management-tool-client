package DesktopGUI.ProjectMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class startSubSceneLoader extends Application {
    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent LoadMainDiagrams() throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/Diagrams.fxml"));
        System.out.println("Loaded Diagrams");
        return root;
    }
}
