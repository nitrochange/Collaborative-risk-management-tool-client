package DesktopGUI.NewTask;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class NewTaskLoader extends Application {
    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent loadNewTask() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../fxml/NewTask.fxml"));
        return root;
    }

}
