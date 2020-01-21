module demofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    opens demofx to javafx.fxml;
    exports demofx;
}