package controllers;

import domain.Book;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import vo.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class BookController
        implements Initializable {

    @FXML
    private Button addBookButton;
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

    private final ArrayList<Text> genres = new ArrayList<Text>();
    private final ArrayList<Text> formats = new ArrayList<Text>();
    private final ArrayList<Text> languages = new ArrayList<Text>();

    public void initialize(final URL fxmlFileLocation, final ResourceBundle resources) {

        genres.add(new Text("Roman"));
        genres.add(new Text("Dokumentar"));
        genres.add(new Text("Ung"));
        genres.add(new Text("Historie"));
        genres.add(new Text("Fantasy"));
        genres.add(new Text("Debatt/samfunn"));
        genres.add(new Text("New age"));
        genres.add(new Text("Selvutvikling"));
        genres.add(new Text("Mat & drikke"));
        genres.add(new Text("Økonomi"));
        genres.add(new Text("Ledelse"));
        genres.add(new Text("Reiseskildring"));
        genres.add(new Text("Reiseguide"));
        genres.add(new Text("Sport & fritid"));
        genres.add(new Text("Helse"));
        genres.add(new Text("Medier"));
        genres.add(new Text("Sex & samliv"));
        genres.add(new Text("Tro & livssyn"));
        genres.add(new Text("Personlig beretning"));
        genres.add(new Text("Skole"));
        genreComboBox.getItems().addAll(genres);

        formats.add(new Text("Pocket"));
        formats.add(new Text("Innbundet"));
        formats.add(new Text("Leseeksemplar"));
        formats.add(new Text("Boks"));
        formatComboBox.getItems().addAll(formats);

        languages.add(new Text("Norsk"));
        languages.add(new Text("Engelsk"));
        languages.add(new Text("Nynorsk"));
        languageComboBox.getItems().addAll(languages);

        addBookButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(final ActionEvent event) {
                final Book book = getBookFromFields();


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
