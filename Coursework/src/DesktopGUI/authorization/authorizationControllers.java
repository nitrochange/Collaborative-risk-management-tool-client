package DesktopGUI.authorization;

import DesktopGUI.StartMenu.StartMenuLoader;
import DesktopGUI.primaryStageContainer;
import javafx.fxml.FXML;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class authorizationControllers {



    private static final double WIDTH = 1000;
    private static final double HEIGHT = 650;


    private Button forgotPassword;
    private TextField loginField;
    private PasswordField passwordField;

    @FXML
    public void passwordEntered() {
        try {
            LoadStartMenu();
        } catch (IOException e)
        {
            System.out.println(e.fillInStackTrace());
        }
    }


    private void LoadStartMenu() throws IOException {

        Scene scene = new Scene(new StartMenuLoader().LoadStartMenu());

        //setting startmenu to the center os the screen
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        primaryStageContainer.primaryStage.setX((screenBounds.getWidth() - WIDTH) / 2);
        primaryStageContainer.primaryStage.setY((screenBounds.getHeight() - HEIGHT) / 2);

        //primaryStageContainer.primaryStage.
        primaryStageContainer.primaryStage.setResizable(false);
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }

    @FXML
    public void forgotPassword()
    {
        Random rnd = new Random();
        System.out.println(rnd.nextInt(100));
    }



}
