package DesktopGUI.Coworkers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class CoworkersLoader extends Application {
    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent loadCoworkers() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../fxml/Coworkers.fxml"));
        return root;
    }

}
