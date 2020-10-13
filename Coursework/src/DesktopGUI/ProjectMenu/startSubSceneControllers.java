package DesktopGUI.ProjectMenu;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class startSubSceneControllers implements Initializable {


    @FXML
    private VBox commonFilesVBox;

    @FXML
    private Label projectStatusLabel;

    @FXML
    private PieChart mainPieChart;

    private ObservableList<PieChart.Data> dataForMainPieChart;

    private List<Integer> consts = Arrays.asList(30,12,12,7);

    private void GetPieChartProgressData()
    {
        dataForMainPieChart =
                FXCollections.observableArrayList(
                        new PieChart.Data("Dangerous risks",30),
                        new PieChart.Data( "Controlled risks",12),
                        new PieChart.Data( "Processing risks",12),
                        new PieChart.Data( "Undefined risks",7)
                );
    }

    public void labelInit()
    {
        Integer sum = consts.stream().mapToInt(Integer::intValue).sum() / 2;
        if (consts.get(0) > sum / 2)
            projectStatusLabel.setText("Project status: under threat of failure");
        else if (consts.get(0) > sum / 4)
            projectStatusLabel.setText("Project status: serious difficulties");
        else if (consts.get(0) > sum / 6)
            projectStatusLabel.setText(("Project status: small problems"));
        else
            projectStatusLabel.setText(("Project status: everything is cool"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        GetPieChartProgressData();
        mainPieChart.setData(dataForMainPieChart);
        labelInit();

    }
}
