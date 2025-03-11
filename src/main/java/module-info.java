module edu.farmingdale.weatherdataanalyzer {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.weatherdataanalyzer to javafx.fxml;
    exports edu.farmingdale.weatherdataanalyzer;
}