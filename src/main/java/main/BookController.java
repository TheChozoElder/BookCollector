package main;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller
        implements Initializable {

    @FXML //  fx:id="addBookButton"
    private Button addBookButton;


    public void initialize(final URL fxmlFileLocation, final ResourceBundle resources) {
        assert addBookButton != null : "fx:id=\"addBookButton\" was not injected: check your FXML file 'simple.fxml'.";

        // initialize your logic here: all @FXML variables will have been injected

        addBookButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(final ActionEvent event) {
                final Parent root;
                try {
                    root = FXMLLoader.load(getClass().getClassLoader().getResource("AddBook.fxml"), resources);
                    final Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.show();
                } catch (final IOException e) {
                    e.printStackTrace(); // TODO: much errorhandling
                }
            }
        });
    }

}
