package http.library;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import vo.ISBN;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Karl Evald on 17.02.2017.
 */
public class LibraryHTTPService {

    public String getBookByISBN(final ISBN isbn) {

        OkHttpClient client = new OkHttpClient();

        HttpUrl.Builder urlBuilder = HttpUrl.parse("http://www.nb.no/services/search/v2/search").newBuilder();

        urlBuilder.addQueryParameter("q", "9788203294709");//isbn.getValue());
        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try {
            Response response = client.newCall(request).execute();

            String dtar = response.body().string();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
