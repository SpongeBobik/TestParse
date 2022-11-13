module java.testparse {
    requires javafx.controls;
    requires javafx.fxml;


    opens java.testparse to javafx.fxml;
    exports java.testparse;
}