package controller;

import domain.Book;
import http.library.LibraryHTTPService;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import vo.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class BookController
        implements Initializable {

    @FXML
    private Button addBookButton;
    @FXML
    private Button searchBook;
    @FXML
    private TextField ISBNField;
    @FXML
    private TextField titleField;
    @FXML
    private TextField authorField;
    @FXML
    private ComboBox<Text> genreComboBox;
    @FXML
    private ComboBox<Text> languageComboBox;
    @FXML
    private TextField releaseYearField;
    @FXML
    private TextField seriesField;
    @FXML
    private TextField publisherField;
    @FXML
    private ComboBox<Text> formatComboBox;

    private LibraryHTTPService libraryHTTPService;

    private ComboboxData comboboxData = new ComboboxData();

    public void initialize(final URL fxmlFileLocation, final ResourceBundle resources) {

        genreComboBox.getItems().addAll(comboboxData.getBookGenres());
        formatComboBox.getItems().addAll(comboboxData.getBookFormats());
        languageComboBox.getItems().addAll(comboboxData.getBookLanguages());

        libraryHTTPService = new LibraryHTTPService();

        addBookButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(final ActionEvent event) {
                final Book book = getBookFromFields();


            }
        });

        searchBook.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(final ActionEvent event) {

                libraryHTTPService.getBookByISBN(new ISBN(ISBNField.getText()));

            }
        });
    }

    private Book getBookFromFields() {
        return new Book(
                new Title(titleField.getText()),
                new Author(authorField.getText()),
                new Language(languageComboBox.getValue().getText()),
                new ISBN(ISBNField.getText()),
                new Genre(genreComboBox.getValue().getText()),
                new Year(releaseYearField.getText()),
                new Publisher(publisherField.getText()),
                new Format(formatComboBox.getValue().getText())
        );
    }
}
