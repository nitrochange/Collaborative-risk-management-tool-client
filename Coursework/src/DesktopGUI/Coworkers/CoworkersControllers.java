package DesktopGUI.Coworkers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CoworkersControllers implements Initializable {



    @FXML
    private ScrollPane coworkers;

    @FXML
    private VBox coworkersVBox;



    private static int quantityOfCoworkers = 10;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Node[] tasksArray = new Node[quantityOfCoworkers];
        for (int i = 0; i < quantityOfCoworkers; i++) {
            try {

                tasksArray[i] = FXMLLoader.load(getClass().getResource("../fxml/Friend.fxml"));


                //TODO: дописать обработку каждого коллеги и подгрузку с сервера
                //здесь заглушка
                coworkersVBox.getChildren().add(tasksArray[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
