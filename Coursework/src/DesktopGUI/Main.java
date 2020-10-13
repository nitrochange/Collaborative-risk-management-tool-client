package DesktopGUI;

import DesktopGUI.StartMenu.StartMenuLoader;
import DesktopGUI.authorization.authorizationLoader;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStageContainer.primaryStage = primaryStage;
        Scene projectChoose = new Scene(new authorizationLoader().loadAuthorization());
        primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStage.setScene(projectChoose);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
