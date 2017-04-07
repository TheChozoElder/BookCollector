package controller;

import domain.Book;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LibraryController
        implements Initializable {

    @FXML
    private Button openAddBookWindowButton;

    @FXML
    private TableView<Book> libraryView = new TableView<Book>();

    public void initialize(final URL fxmlFileLocation, final ResourceBundle resources) {

        openAddBookWindowButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(final ActionEvent event) {
                final Parent root;
                try {
                    root = FXMLLoader.load(getClass().getClassLoader().getResource("AddBook.fxml"), resources);
                    final Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.initModality(Modality.APPLICATION_MODAL);
                    stage.show();
                } catch (final IOException e) {
                    e.printStackTrace(); // TODO: much errorhandling
                }
            }
        });
    }

    public void addBookToLibrary(final Book book) {
        libraryView.getItems().addAll(book);
        libraryView.refresh();
    }


}
