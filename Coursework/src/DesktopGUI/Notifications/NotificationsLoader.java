package DesktopGUI.Notifications;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class NotificationsLoader extends Application {
    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent loadNotifications() throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../fxml/Notifications.fxml"));
        return root;
    }

}
