package DesktopGUI;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class primaryStageContainer {

    public static boolean ISDIALOG;

    public static BorderPane borderPane;
    public static Stage primaryStage;
    public static VBox tasksVBox;
    public static Logger logger = LoggerFactory.getLogger(primaryStageContainer.class);
    public static String notificationMessage = "";

}
