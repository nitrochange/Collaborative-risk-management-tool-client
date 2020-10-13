package DesktopGUI.ProjectMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class MessengerLoader extends Application {


    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent LoadMessenger() throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/Messenger.fxml"));
        System.out.println("FXML Messenger loaded");
        return root;
    }
}
