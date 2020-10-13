package DesktopGUI.Analytics;


import DesktopGUI.ProjectMenu.ProjectMenuLoader;
import DesktopGUI.primaryStageContainer;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import DesktopGUI.MyTasks.MyTasksControllers;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class AnalyticsControllers implements Initializable {

    @FXML
    private TableView<Risk> leftTable;

    @FXML
    private PieChart tasksChart;

    @FXML
    private TableView<Risk> rigthTable;

    @FXML
    public PieChart progressChart;


    private ObservableList<PieChart.Data> pieChartProgressData;
    private ObservableList<PieChart.Data> pieChartTasksData;
    private ObservableList<Risk> leftTableData;
    private ObservableList<Risk> rightTableData;


    {
        GetPieChartProgressData();
        GetPieChartTasksData();
//        GetLeftTableData();
//        GetRightTableData();
    }

//    private void GetLeftTableData() {
//
//        TableColumn firstTableColumn = new TableColumn("Category");
//        TableColumn secondTableColumn = new TableColumn("Name");
//        TableColumn thirdTableColumn = new TableColumn("Impact");
//        TableColumn fouthTableColumn = new TableColumn("Danger");
//
//        firstTableColumn.setCellValueFactory(
//                new PropertyValueFactory<Risk, String>("category")
//        );
//        secondTableColumn.setCellValueFactory(
//                new PropertyValueFactory<Risk, String>("name")
//        );
//        thirdTableColumn.setCellValueFactory(
//                new PropertyValueFactory<Risk, String>("impact")
//        );
//        fouthTableColumn.setCellValueFactory(
//                new PropertyValueFactory<Risk, String>("riskClass")
//        );
//        if (leftTable == null) leftTable = new TableView<>();
//        leftTable.getColumns().addAll(firstTableColumn, secondTableColumn,
//                thirdTableColumn, fouthTableColumn);
//    }



    private void GetPieChartProgressData() {
        pieChartProgressData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Tasks in progress", 2),
                        new PieChart.Data("Finished tasks in current project", 1)
                );
    }

    private void GetPieChartTasksData() {
        pieChartTasksData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Failed risks", 30),
                        new PieChart.Data("Successful controlled risks", 20),
                        new PieChart.Data("Risks in processing",20)
                );
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        progressChart.setData(pieChartProgressData);
        tasksChart.setData(pieChartTasksData);
        Random rnd = new Random();

        leftTableData =
                FXCollections.observableArrayList(
                        new Risk("Organizational",
                                "The stakeholder requirements could be in conflict with each other.",
                                "New",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                        new Risk("Technical",
                                "Team members are allocated to multiple projects",
                                "In work",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                        new Risk("External",
                                "The project was approved without team buy-in",
                                "mitigated",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                        new Risk("HR",
                                "A 3rd party may not deliver their part.",
                                "mitigated",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                        new Risk("HR",
                                "High reliance on the human factor",
                                "mitigated",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                        new Risk("External",
                                "Detailed risk management process",
                                "In work",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                        new Risk("Organizational",
                                "Very large software system",
                                "New",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                        new Risk("Organizational",
                                "Inappropriate customer representative",
                                "mitigated",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                        new Risk("Distributed development environment",
                                "Scope creep",
                                "In work",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                        new Risk("Technical",
                                "Underestimation of time and other resources\n" +
                                        "required for each increment",
                                "New",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                        new Risk("External",
                                "Delayed requirements implementation",
                                "mitigated",
                                rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) )
                );

        if (rnd.nextDouble() > 0.5)
            leftTableData =
                    FXCollections.observableArrayList(
                            new Risk("Organizational",
                                    "The stakeholder requirements could be in conflict with each other.",
                                    "New",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                            new Risk("Technical",
                                    "Team members are allocated to multiple projects",
                                    "In work",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                            new Risk("External",
                                    "The project was approved without team buy-in",
                                    "mitigated",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                            new Risk("HR",
                                    "A 3rd party may not deliver their part.",
                                    "mitigated",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                            new Risk("HR",
                                    "High reliance on the human factor",
                                    "mitigated",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                            new Risk("External",
                                    "Detailed risk management process",
                                    "In work",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                            new Risk("Organizational",
                                    "Very large software system",
                                    "New",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                            new Risk("Organizational",
                                    "Inappropriate customer representative",
                                    "mitigated",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                            new Risk("Distributed development environment",
                                    "Scope creep",
                                    "In work",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                            new Risk("Technical",
                                    "Underestimation of time and other resources\n" +
                                            "required for each increment",
                                    "New",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) ),
                            new Risk("External",
                                    "Delayed requirements implementation",
                                    "mitigated",
                                    rnd.nextInt(4),rnd.nextInt(10),rnd.nextInt(10) )
                    );

        TableColumn firstTableColumn = new TableColumn("Category");
        TableColumn secondTableColumn = new TableColumn("Name");
        TableColumn thirdTableColumn = new TableColumn("Impact");
        TableColumn fouthTableColumn = new TableColumn("managerHazardAssesment");
        TableColumn fifthTableColumn = new TableColumn("status");
        TableColumn sixTableColumn = new TableColumn("staffHazardAssessment");

        firstTableColumn.setCellValueFactory(
                new PropertyValueFactory<Risk, String>("category")
        );
        secondTableColumn.setCellValueFactory(
                new PropertyValueFactory<Risk, String>("name")
        );
        thirdTableColumn.setCellValueFactory(
                new PropertyValueFactory<Risk, String>("impact")
        );
        fouthTableColumn.setCellValueFactory(
                new PropertyValueFactory<Risk, String>("riskClass")
        );
        fifthTableColumn.setCellValueFactory(
                new PropertyValueFactory<Risk, String>("status")
        );
        sixTableColumn.setCellValueFactory(
                new PropertyValueFactory<Risk, String>("customHazardAssessment")
        );
        if (leftTable == null) leftTable = new TableView<>();
        leftTable.getColumns().addAll(firstTableColumn, secondTableColumn,
                thirdTableColumn, fouthTableColumn, fifthTableColumn, sixTableColumn);
        leftTable.setItems(leftTableData);
    }


    @FXML
    public void BackButtonHandler() {
        try {
            loadProjectMenu();
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private void loadProjectMenu() throws IOException {
        Scene scene = new Scene(new ProjectMenuLoader().LoadProjectMenu());
        primaryStageContainer.primaryStage.setTitle("Collaborative Risk Management Tool");
        primaryStageContainer.primaryStage.setScene(scene);
        primaryStageContainer.primaryStage.show();
    }
}

