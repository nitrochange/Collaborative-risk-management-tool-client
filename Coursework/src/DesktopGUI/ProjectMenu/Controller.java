package DesktopGUI.ProjectMenu;

import DesktopGUI.Analytics.AnalyticsPageLoader;
import DesktopGUI.CommonFiles.CommonFilesLoader;
import DesktopGUI.MyTasks.MyTasksLoader;
import DesktopGUI.NewTask.NewTaskLoader;
import DesktopGUI.Notifications.NotificationsLoader;
import DesktopGUI.StartMenu.StartMenuLoader;
import DesktopGUI.primaryStageContainer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.util.Random;

public class Controller {

    private Button button;
    private Button info;
    @FXML
    private Button back;
    @FXML
    private Button analytics;
    @FXML
    private Pane pane;
    @FXML
    private BorderPane borderPane;
    @FXML
    private Button mytasks;
    @FXML
    private Button commonFiles;


    @FXML
    public void initialize() throws IOException {
        primaryStageContainer.borderPane = borderPane;
        borderPane.setCenter(new startSubSceneLoader().LoadMainDiagrams());
    }

    @FXML
    public void onClickMethod() {
        Random rnd = new Random();
        System.out.println(rnd.nextInt(100));

    }


    @FXML
    public void BackButtonHandler() {
        try {
            loadMainMenu();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private void loadMainMenu() throws IOException {
        Scene scene = new Scene(new StartMenuLoader().LoadStartMenu());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }

    @FXML
    public void MessengerButtonHandler() {
        try {
            loadMessenger();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    @FXML
    public void AnalyticsButtonHandler() {
        try {
            loadAnalyticsMenu();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }


    @FXML
    public void notificationsButtonPressed() {
        try {
            loadNotifications();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void loadNotifications() throws IOException {
        borderPane.setCenter(new NotificationsLoader().loadNotifications());
    }


    @FXML
    public void commonFilesButtonPressed() {
        try {
            loadCommonFiles();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void loadCommonFiles() throws IOException {
        borderPane.setCenter(new CommonFilesLoader().loadCommonFiles());
    }


    @FXML
    public void myTasksButtonPressed() {
        try {
            loadMyTasks();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void loadMyTasks() throws IOException {
        borderPane.setCenter(new MyTasksLoader().loadMyTasks());
    }

    @FXML
    public void newTaskButtonPressed() {
        try {
            loadNewTaskMeny();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @FXML
    public void analyticsButtonPressed() {
        try {
            loadAnalyticsMenu();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    public void MyTasksButtonHandler() {
        try {

            FXMLLoader.load(getClass().getResource("../fxml/MyTasks.fxml"));
            System.out.println("Still not null yet(4)");

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }


    private void loadScene(String scene) {
        try {

            if (scene.equalsIgnoreCase("Analytics"))
                loadAnalyticsMenu();
            else if (scene.equalsIgnoreCase("MyTasks"))
                loadMytaskMenu();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    @Deprecated
    private void loadMytaskMenu() throws IOException {
        Scene scene = new Scene(new MyTasksLoader().loadMyTasks());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }

    private void loadAnalyticsMenu() throws IOException {
        Scene scene = new Scene(new AnalyticsPageLoader().LoadAnalyticsPage());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }

    public void loadMessenger() throws IOException {
        Scene scene = new Scene(new MessengerLoader().LoadMessenger());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }

    private void loadNewTaskMeny() throws IOException {
        Scene scene = new Scene(new NewTaskLoader().loadNewTask());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }

    private void LoadProjectMenu() throws IOException {

        Scene scene = new Scene(new ProjectMenuLoader().LoadProjectMenu());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }


}
