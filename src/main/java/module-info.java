module com.example.shakki {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shakki to javafx.fxml;
    exports com.example.shakki;
}