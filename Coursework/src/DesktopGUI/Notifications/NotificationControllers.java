package DesktopGUI.Notifications;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static DesktopGUI.primaryStageContainer.notificationMessage;

public class NotificationControllers implements Initializable {
    @FXML
    private TextField receiver;

    @FXML
    private TextField notification;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (!notificationMessage.isEmpty()) {
            notification.setText(notificationMessage);
            receiver.setText("[SYSTEM]");
            notificationMessage = "";
        }

    }
}
