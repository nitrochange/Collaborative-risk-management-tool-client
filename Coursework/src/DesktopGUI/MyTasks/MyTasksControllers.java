package DesktopGUI.MyTasks;

import DesktopGUI.primaryStageContainer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

import static DesktopGUI.primaryStageContainer.*;

public class MyTasksControllers implements Initializable {

    @FXML
    private Button todoButton;

    @FXML
    private Button doneButton;

    @FXML
    private Button markAllAsDoneButton;

    @FXML
    private VBox tasksVBox;

    private Node[] doneTasks = new Node[0];
    private Node[] todoTasks = new Node[quantityOfTasks];

    private static int countDoneTasks = 0;
    private static int countToDoTasks = 20;

    public static int GetCountDoneTasks() {
        return countDoneTasks;
    }
    public static int GetCountToDoTasks()
    {
        return countToDoTasks;
    }


    @FXML
    void allDone(ActionEvent event) {
        tasksVBox.getChildren().clear();
    }

    @FXML
    void doneButtonPressed(ActionEvent event) {
        tasksVBox.getChildren().clear();
        for (Node doneTask: doneTasks)
            tasksVBox.getChildren().add(doneTask);
    }

    @FXML
    void todoButtonPressed(ActionEvent event) {
        tasksVBox.getChildren().clear();
        for (Node todoTask: todoTasks)
            tasksVBox.getChildren().add(todoTask);
    }

    public VBox getTasksVBox()
    {
        return tasksVBox;
    }

    public void insertDoneTaskIntoDoneList(Node task) {
        //очень неудачная реализация
        //перекопирование массивов каждый раз
        //TODO исправить
        countDoneTasks++;
        Node[] templateArray = Arrays.copyOf(doneTasks, countDoneTasks);

        doneTasks = new Node[countDoneTasks];
        doneTasks = Arrays.copyOf(templateArray, templateArray.length);

        doneTasks[doneTasks.length - 1] = task;
        logger.info("Task was added to DONE section" );
    }

    public void removeDoneTaskFromToDoList(Node task) {
        countToDoTasks--;
        Node[] templateArray = new Node[countToDoTasks];
        int k = 0;
        for (int i = 0; i < todoTasks.length; i++) {
            if (todoTasks[k] == task) k++;
            templateArray[i] = todoTasks[k];
            k++;
        }
    }


    private static int quantityOfTasks = 20;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        primaryStageContainer.tasksVBox = tasksVBox;

        Node[] tasksArray = new Node[quantityOfTasks];
        todoTasks = tasksArray;
        for (int i = 0; i < quantityOfTasks; i++) {
            try {
                tasksArray[i] = FXMLLoader.load(getClass().getResource("../fxml/Task.fxml"));
                //TODO: дописать обработку каждой таски и подгрузку с сервера
                //здесь заглушка
                final int j = i;
                tasksArray[i].setOnMouseClicked(mouseEvent -> {
                    tasksVBox.getChildren().remove(tasksArray[j]);
                    insertDoneTaskIntoDoneList(tasksArray[j]);
                    removeDoneTaskFromToDoList(tasksArray[j]);
                });
                tasksVBox.getChildren().add(tasksArray[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
