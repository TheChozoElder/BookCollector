package domain;

import vo.*;

/**
 * Created by Karl Evald on 17.02.2017.
 */
public class Book {
    private final Title title;
    private final Summary summary;
    private final Author author;
    private final Language language;
    private final ISBN isbn;
    private final Genre genre;
    private final Year year;

    public Book(final Title title,
                final Summary summary,
                final Author author,
                final Language language,
                final ISBN isbn,
                final Genre genre,
                final Year year) {
        this.title = title;
        this.summary = summary;
        this.author = author;
        this.language = language;
        this.isbn = isbn;
        this.genre = genre;
        this.year = year;
    }

    public Title getTitle() {
        return title;
    }

    public Summary getSummary() {
        return summary;
    }

    public Author getAuthor() {
        return author;
    }

    public Language getLanguage() {
        return language;
    }

    public ISBN getIsbn() {
        return isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    public Year getYear() {
        return year;
    }
}
