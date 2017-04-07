package controller;

import javafx.scene.text.Text;

import java.util.ArrayList;

/**
 * Created by karl_ on 02.04.2017.
 */
public class ComboboxData {

    public ArrayList<Text> getBookGenres(){
        final ArrayList<Text> genres = new ArrayList<Text>();
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

        return genres;
    }

    public ArrayList<Text> getBookFormats(){
        final ArrayList<Text> formats = new ArrayList<Text>();
        formats.add(new Text("Pocket"));
        formats.add(new Text("Innbundet"));
        formats.add(new Text("Leseeksemplar"));
        formats.add(new Text("Boks"));

        return formats;
    }

    public ArrayList<Text> getBookLanguages(){
        final ArrayList<Text> languages = new ArrayList<Text>();
        languages.add(new Text("Norsk"));
        languages.add(new Text("Engelsk"));
        languages.add(new Text("Nynorsk"));

        return languages;
    }
}
