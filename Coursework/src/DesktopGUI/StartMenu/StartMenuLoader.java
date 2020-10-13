package DesktopGUI.StartMenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class StartMenuLoader extends Application {

    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent LoadStartMenu() throws IOException
    {
        //BorderPane root = new BorderPane();
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/MainMenu.fxml"));
//      Parent root = FXMLLoader.load(getClass().getResource("../fxml/OldProjectMenu.fxml"));
        return root;
    }

}
