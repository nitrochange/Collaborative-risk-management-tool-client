package DesktopGUI.ProjectMenu;

import DesktopGUI.Messenger.Dialog;
import DesktopGUI.StartMenu.StartMenuLoader;
import DesktopGUI.primaryStageContainer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import static DesktopGUI.primaryStageContainer.ISDIALOG;
import static DesktopGUI.primaryStageContainer.logger;

public class MessengerController implements Initializable {

    @FXML
    private TextArea messagingArea;

    @FXML
    private Button addFile;

    @FXML
    private TextField messageType;

    private String message = "";

    private List<String> simpleResponces = Arrays.asList(
            "Ok",
            "I understand you",
            "nice",
            "Thank you",
            "I get it"
    );

    private List<String> scenaries = Arrays.asList(
            "src/DesktopGUI/ProjectMenu/scenary1.txt",
            "src/DesktopGUI/ProjectMenu/scenary2.txt",
            "src/DesktopGUI/ProjectMenu/scenary3.txt"
    );

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Random rnd = new Random();
        File scenaryLoader = new File(scenaries.get(rnd.nextInt(scenaries.size())));
        try {
            if (ISDIALOG)
                messagingArea.appendText(FileUtils.readFileToString(scenaryLoader));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void BackButtonHandler() {
        try {
            LoadMenu(ISDIALOG);
            if (ISDIALOG) ISDIALOG = false;

            System.out.println("Loading project menu");

        } catch (IOException e) {
            System.out.println(e.fillInStackTrace());
        }
    }


    private void LoadMenu(boolean isDialog) throws IOException {

        Scene scene = null;
        if (isDialog)
            scene = new Scene(new StartMenuLoader().LoadStartMenu());
        else
            scene = new Scene(new ProjectMenuLoader().LoadProjectMenu());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }


    private void typeResponce() {
        Random rnd = new Random();
        //messagingArea.appendText("col> " + simpleResponces.get(rnd.nextInt(simpleResponces.size())) + "\n");
    }

    @FXML
    void messageTyped() {
        message = messageType.getText();
        messageType.clear();
        typeMessage();
    }

    private void typeMessage() {
        messagingArea.appendText("you> " + message + "\n");
        Random rnd = new Random();
        if (rnd.nextDouble() > 0.5) typeResponce();
    }


    @FXML
    void startAddFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");

        File file = fileChooser.showOpenDialog(new Stage());
        logger.info("File dialog opened");
        if (file != null) {
            message = file.getName();
            typeMessage();
        }
    }

}
