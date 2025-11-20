module com.example.labpracticeclick {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labpracticeclick to javafx.fxml;
    exports com.example.labpracticeclick;
}