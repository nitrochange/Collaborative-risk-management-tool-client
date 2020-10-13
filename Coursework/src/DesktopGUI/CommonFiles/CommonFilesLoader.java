package DesktopGUI.CommonFiles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class CommonFilesLoader extends Application {
    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent loadCommonFiles() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../fxml/CommonFIles.fxml"));
        return root;
    }

}
