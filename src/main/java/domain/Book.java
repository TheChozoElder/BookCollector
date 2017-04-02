package domain;

import vo.*;

/**
 * Created by Karl Evald on 17.02.2017.
 */
public class Book {
    private final Title title;
    private final Author author;
    private final Language language;
    private final ISBN isbn;
    private final Genre genre;
    private final Year year;
    private final Publisher publisher;
    private final Format format;

    public Book(final Title title,
                final Author author,
                final Language language,
                final ISBN isbn,
                final Genre genre,
                final Year year,
                final Publisher publisher,
                final Format format) {
        this.title = title;
        this.author = author;
        this.language = language;
        this.isbn = isbn;
        this.genre = genre;
        this.year = year;
        this.publisher = publisher;
        this.format = format;
    }

    public Title getTitle() {
        return title;
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

    public Publisher getPublisher() {
        return publisher;
    }

    public Format getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "Book{" +
                "\n title=" + title.getValue() +
                ",\n author=" + author.getValue() +
                ",\n language=" + language.getValue() +
                ",\n isbn=" + isbn.getValue() +
                ",\n genre=" + genre.getValue() +
                ",\n year=" + year.getValue() +
                ",\n publisher=" + publisher.getValue() +
                ",\n format=" + format.getValue() +
                '}';
    }
}
