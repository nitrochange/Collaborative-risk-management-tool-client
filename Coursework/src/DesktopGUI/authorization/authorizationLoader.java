package DesktopGUI.authorization;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public final class authorizationLoader extends Application {

    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent loadAuthorization() throws IOException {

//      Parent root = FXMLLoader.load(getClass().getResource("../fxml/Search.fxml"));
      Parent root = FXMLLoader.load(getClass().getResource("../fxml/Authorization.fxml"));
//      Parent root = FXMLLoader.load(getClass().getResource("../fxml/Analytics.fxml"));
      return root;
    }

}
