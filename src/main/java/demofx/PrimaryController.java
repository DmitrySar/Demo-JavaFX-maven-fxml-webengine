package demofx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    private TextArea code;
    @FXML
    private WebView web;
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void viewHTML() {
        web.getEngine().loadContent(code.getText());
    }

}
