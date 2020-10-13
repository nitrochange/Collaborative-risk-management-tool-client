package DesktopGUI.Notifications;

import DesktopGUI.ProjectMenu.ProjectMenuLoader;
import DesktopGUI.primaryStageContainer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NotificationsControllers implements Initializable {


    @FXML
    private VBox notificationsVBox;

    private int equalityOfLoadedNotifications = 20;

    //TODO: написать инициализацию для уведомлений проекта
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        System.out.println("initialization block of notifications running");
        Node[] notifications = new Node[equalityOfLoadedNotifications];

        for (int i = 0; i < equalityOfLoadedNotifications ; i++) {
            try
            {
                notifications[i] = FXMLLoader.load(getClass().getResource("../fxml/Notification.fxml"));

                //TODO подтянуть с сервера таски и корректно их обработать
                //Дальше идёт заглушка
                //notifications[i]
//                notifications[i].setOnKeyPressed(()->{});

                notificationsVBox.getChildren().add(notifications[i]);
            }catch (Exception e)
            {
                e.printStackTrace();
            }


        }

    }

    @FXML
    public void backButtonPressed() throws IOException
    {
        Scene scene = new Scene(new ProjectMenuLoader().LoadProjectMenu());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }


    //TODO: доделать обработку введённых результатов здесь
    //а именно сделать класс, который будет хранить таски
    //сделать возможность продемонстрировать создание тасок
    //возможность назначить таску себе
    //работа с группами
    @FXML
    public void doneButtonPressed() throws IOException
    {
        Scene scene = new Scene(new ProjectMenuLoader().LoadProjectMenu());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }






}
