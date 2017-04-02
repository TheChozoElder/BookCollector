package http.library;

import vo.ISBN;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Karl Evald on 17.02.2017.
 */
public class LibraryHTTPService {

    public String getBookByISBN(final ISBN isbn) {

        final StringBuilder uri = new StringBuilder()
                .append("http://www.nb.no/services/search/v2/search?q=isbn:")
                .append(isbn.getValue());

        try {
            final URL url = new URL(uri.toString());
            final HttpURLConnection connection;
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/xml");

            return null;
        } catch (final IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
