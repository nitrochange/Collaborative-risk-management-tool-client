package DesktopGUI.Analytics;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Risk {
    private final SimpleStringProperty category;
    private final SimpleStringProperty name;
    private final SimpleIntegerProperty impact;
    private final SimpleIntegerProperty riskClass;
    private final SimpleStringProperty status;
    private final SimpleIntegerProperty customHazardAssessment;



    Risk(String category,
         String name,
         String status,
         Integer impact,
         Integer assesment,
         Integer riskClass) {
        this.category = new SimpleStringProperty(category);
        this.name = new SimpleStringProperty(name);
        this.impact = new SimpleIntegerProperty(impact);
        this.riskClass = new SimpleIntegerProperty(riskClass);
        this.status = new SimpleStringProperty(status);
        this.customHazardAssessment = new SimpleIntegerProperty(assesment);
    }


    public String getCategory() {
        return category.get();
    }

    public SimpleStringProperty categoryProperty() {
        return category;
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public int getImpact() {
        return impact.get();
    }

    public SimpleIntegerProperty impactProperty() {
        return impact;
    }

    public int getRiskClass() {
        return riskClass.get();
    }

    public SimpleIntegerProperty riskClassProperty() {
        return riskClass;
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public int getCustomHazardAssessment() {
        return customHazardAssessment.get();
    }

    public SimpleIntegerProperty customHazardAssessmentProperty() {
        return customHazardAssessment;
    }
}
