package DesktopGUI.CommonFiles;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static DesktopGUI.primaryStageContainer.logger;
import static DesktopGUI.primaryStageContainer.notificationMessage;

public class CommonFilesControllers implements Initializable {

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private VBox commonFilesVBox;

    @FXML
    private Button find;

    @FXML
    private Button upload;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    @FXML
    void findButtonPressed(ActionEvent event) {

    }

    @FXML
    void uploadButtonPressed(ActionEvent event) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");

        File file = fileChooser.showOpenDialog(new Stage());
        logger.info("File dialog opened");
        if (file != null) {
            notificationMessage = "File with name: " + file.getName() + " added";
            Node fileName = FXMLLoader.load(getClass().getResource("../fxml/Notification.fxml"));
            commonFilesVBox.getChildren().add(fileName);
            System.out.println("notification message was changed");
            logger.info("notification message was changed");
        }
    }


}
