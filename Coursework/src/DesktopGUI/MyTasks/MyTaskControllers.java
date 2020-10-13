package DesktopGUI.MyTasks;
import DesktopGUI.primaryStageContainer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;


public class MyTaskControllers implements Initializable {

    private int magicNumber = 7;

    private ZonedDateTime deadline;

    @FXML
    private ImageView receiverPhoto;

    @FXML
    private TextField taskMessage;

    @FXML
    private TextField dateField;

    @FXML
    private Button done;

    private List<String> photos = Arrays.asList(
            "DesktopGUI/images/profileDefaultAvatar.png",
            "DesktopGUI/images/man.png",
            "DesktopGUI/images/nip.png",
            "DesktopGUI/images/eye.png",
            "DesktopGUI/images/github1.png",
            "DesktopGUI/images/github2.png",
            "DesktopGUI/images/github3.png",
            "DesktopGUI/images/github4.png"

    );




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        File tasksContainer = new File("src/DesktopGUI/MyTasks/tasks.txt");
        List<String> tasks = null;
        try {
            tasks = Arrays.asList(FileUtils.readFileToString(tasksContainer).split("\n"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Random rnd = new Random();

        taskMessage.setText(tasks.get(rnd.nextInt(tasks.size())));
        dateField.setText("Due to: " + ZonedDateTime.now().
                plusMinutes(rnd.nextInt(magicNumber)).
                plusHours(rnd.nextInt(magicNumber)).
                plusDays(rnd.nextInt(magicNumber)).
                plusMonths(rnd.nextInt(magicNumber)).toString().split("T")[0]
                );

        receiverPhoto.setImage(new Image(photos.get(rnd.nextInt(photos.size()))));

    }

    @FXML
    void doneButtonPressed(ActionEvent event) {
        primaryStageContainer.logger.info("Task: " + taskMessage.getText() + " Done");
        System.out.println("Task:  " + taskMessage.getText() + " Done");

    }
}