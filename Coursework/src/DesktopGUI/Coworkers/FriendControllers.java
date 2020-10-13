package DesktopGUI.Coworkers;

import DesktopGUI.ProjectMenu.MessengerLoader;
import DesktopGUI.StartMenu.Controller;
import DesktopGUI.primaryStageContainer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

import static DesktopGUI.primaryStageContainer.ISDIALOG;
import static DesktopGUI.primaryStageContainer.primaryStage;

public class FriendControllers implements Initializable {

    @FXML
    private Label name;

    @FXML
    private Label status;

    @FXML
    private Label message;

    @FXML
    private ImageView photo;

    private List<String> names = Arrays.asList(
            "Angelina Biryukova",
            "Alexander Grachev",
            "Daniel Ivanov",
            "Krasnova Vera",
            "Lukina Anastasia",
            "Oleg Melnikov",
            "Alena Morozova",
            "Nikolayev Nikita",
            "Artur Vasiliev",
            "Vladislav Volkov",
            "Gorbachev's Eve",
            "Karina Davydova",
            "Drozdov Maxim",
            "Egor Kozlov",
            "Eva Maksimova",
            "Yaroslav Petrov"
    );

    private List<String> statuses = Arrays.asList(
            "online",
            "on work",
            "offine",
            "on vacation",
            "at the meeting",
            "not disturb",
            "lunch"
    );

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

        Random rnd = new Random();

        name.setText(names.get(rnd.nextInt(names.size())));
        status.setText(statuses.get(rnd.nextInt(statuses.size())));

        photo.setImage(new Image(photos.get(rnd.nextInt(photos.size()))));


        message.setOnMouseClicked(me -> {

            ISDIALOG = true;

            Scene scene = null;
            try {
                scene = new Scene(new MessengerLoader().LoadMessenger());
            } catch (IOException e) {
                e.printStackTrace();
            }
            primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
            primaryStageContainer.primaryStage.setScene(scene);
            primaryStageContainer.primaryStage.show();
        });


    }
}
