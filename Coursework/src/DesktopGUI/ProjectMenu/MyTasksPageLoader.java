package DesktopGUI.ProjectMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class MyTasksPageLoader extends Application {

    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent LoadStartMenu() throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/MyTasks.fxml"));
        return root;
    }

}
