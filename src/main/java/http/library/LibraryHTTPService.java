package http.library;

import utils.XMLParser;
import vo.ISBN;

/**
 * Created by Karl Evald on 17.02.2017.
 */
public class LibraryHTTPService {

    public String getBookByISBN(final ISBN isbn) {

        XMLParser.getBookFromXMLResponse("");

//        final OkHttpClient client = new OkHttpClient();
//
//        final HttpUrl.Builder urlBuilder = HttpUrl.parse("http://www.nb.no/services/search/v2/search").newBuilder();
//
//        urlBuilder.addQueryParameter("q", "9788203294709");//isbn.getValue());
//        final String url = urlBuilder.build().toString();

//        final Request request = new Request.Builder()
//                .url(url)
//                .build();

//        try {
//            final Response response = client.newCall(request).execute();

//            final String dtar = response.body().string();
        return null;

//        } catch (final IOException e) {
//            e.printStackTrace();
//        }
//        return null;
    }
}
