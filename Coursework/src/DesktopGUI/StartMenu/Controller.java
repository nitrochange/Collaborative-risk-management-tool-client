package DesktopGUI.StartMenu;

import DesktopGUI.Coworkers.CoworkersLoader;
import DesktopGUI.Notifications.NotificationsLoader;
import DesktopGUI.Profile.ProfileLoader;
import DesktopGUI.ProjectMenu.ProjectMenuLoader;
import DesktopGUI.primaryStageContainer;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Random;

public class Controller {

    private Button button;
    @FXML
    private Button info;
    @FXML
    private Button projects;
    @FXML
    private BorderPane borderPaneMainMenu;
    @FXML

    private ComboBox<String> projectType;



    public void profileButtonPressed() {
        try
        {
            loadProfile();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void loadProfile() throws IOException {
        borderPaneMainMenu.setCenter(new ProfileLoader().loadProfile());
    }


    @FXML
    public void coworkersButtonPressed() {
        try {
            loadCoworkers();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
    public void loadCoworkers() throws IOException {
        borderPaneMainMenu.setCenter(new CoworkersLoader().loadCoworkers());
    }

    @FXML
    public void notificationsButtonPressed(){
        try {
            loadNotifications();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadNotifications() throws IOException{
        borderPaneMainMenu.setCenter(new NotificationsLoader().loadNotifications());
    }

    @FXML
    public void initialize(){
        projectType.getItems().addAll(
                "Agile",
                "Scrum",
                "Simple programmnig project",
                "ML",
                "AR/VR",
                "UX/UI",
                "Other"
        );
    }

    @FXML
    public void onClickMethod(){
        Random rnd = new Random();
        System.out.println(rnd.nextInt(100));

    }

    @FXML
    public void BackButtonHandler()
    {
        try
        {
            loadMainMenu();
        } catch (Exception e)
        {
            System.out.println(e.fillInStackTrace());
        }
    }

    private void loadMainMenu() throws IOException
    {
        Scene scene = new Scene(new StartMenuLoader().LoadStartMenu());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }


    @FXML
    public void projectPressed() {
        try {
            System.out.println("Loading project menu");
            LoadProjectMenu();
        } catch (IOException e)
        {
            System.out.println(e.fillInStackTrace());
        }
    }

    @FXML
    public void projectSelected() {
        try {
            System.out.println("Loading project menu");
            LoadProjectMenu();
        } catch (IOException e)
        {
            System.out.println(e.fillInStackTrace());
        }
    }


    private void LoadProjectMenu() throws IOException {

        Scene scene = new Scene(new ProjectMenuLoader().LoadProjectMenu());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }
}
