module com.example.settlersofcatan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.settlersofcatan to javafx.fxml;
    exports com.example.settlersofcatan;
}