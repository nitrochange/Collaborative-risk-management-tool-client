package DesktopGUI.NewTask;

import DesktopGUI.ProjectMenu.ProjectMenuLoader;
import DesktopGUI.primaryStageContainer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewTaskControllers implements Initializable {


    @FXML
    private Button doneButton;
    @FXML
    private Button back;
    @FXML
    private TextField addUser;
    @FXML
    private TextArea listUsers;

    //TODO: написать нормальную инициализацию
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        listUsers.setEditable(false);
        System.out.println("initialization block of NewTask running");

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

    //TODO: доделать правильную обработку групп
    @FXML
    public void addButtonPressed(KeyEvent e)
    {
        if(e.getCode().toString().equals("ENTER"))
        {
            listUsers.appendText(addUser.getText() + "\n");
            addUser.clear();
        }
    }




}
