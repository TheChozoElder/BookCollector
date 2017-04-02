package main;

import http.library.LibraryHTTPService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private LibraryHTTPService libraryHTTPService;

    @Override
    public void start(final Stage primaryStage) throws Exception {
        final Parent root = FXMLLoader.load(getClass().getResource("/Library.fxml"));
        primaryStage.setTitle("Book Collector");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();

        window = primaryStage;
        window.setTitle("Book Collection");

        final GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);

        window.show();


    }


    public static void main(final String[] args) {
        launch(args);
    }
}
