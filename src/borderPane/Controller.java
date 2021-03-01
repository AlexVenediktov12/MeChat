package borderPane;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;
    @FXML
    public Button sendButton;

    public void onClickEnter() {
        textArea.appendText(textField.getText() + "\n");
        textField.clear();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sendButton.setDefaultButton(true);
        Platform.runLater(() -> textField.requestFocus());
    }
}
