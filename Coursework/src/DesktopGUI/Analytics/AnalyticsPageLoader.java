package DesktopGUI.Analytics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class AnalyticsPageLoader extends Application {

    @Override
    public void start(Stage stage) throws Exception {

    }

    public Parent LoadAnalyticsPage() throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/Analytics.fxml"));

        return root;
    }

}
