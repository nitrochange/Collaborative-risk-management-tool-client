package DesktopGUI.Profile;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileLoader extends Application {
    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent loadProfile() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../fxml/Profile.fxml"));
        return root;
    }

}
