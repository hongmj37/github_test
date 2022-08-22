module com.example.github_test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.github_test to javafx.fxml;
    exports com.example.github_test;
}