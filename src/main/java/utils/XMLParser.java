package utils;


import domain.Book;
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Karl Evald on 08.04.2017.
 */
public class XMLParser {

    public static Book getBookFromXMLResponse(final String response) {

        try {
            final File inputFile = new File("src\\main\\resources\\bookresponse.txt");
            final SAXBuilder saxBuilder = new SAXBuilder();

            final Document document = saxBuilder.build(inputFile);

            System.out.println("Root element :"
                    + document.getRootElement().getName());

            final Element classElement = document.getRootElement();

            final List<Element> bookResponse = classElement.getChildren();
            System.out.println("----------------------------");

            for (int temp = 0; temp < bookResponse.size(); temp++) {
                final Element bookElement = bookResponse.get(temp);
                if (bookElement.getName() != "entry") {
                    continue;
                }
                final List<Content> bookDetails = bookElement.getContent();
                return getBookFromContentList(bookDetails);
            }
        } catch (final JDOMException e) {
            e.printStackTrace();
        } catch (final IOException ioe) {
            ioe.printStackTrace();
        }

        return null;

    }

    private static Book getBookFromContentList(final List<Content> bookDetails) {
        return new Book()

    }
}
