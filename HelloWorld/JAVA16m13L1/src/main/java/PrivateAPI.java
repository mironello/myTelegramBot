import org.jsoup.Jsoup;

import java.io.IOException;

public class PrivateAPI {
    public static void main(String[] args) throws IOException {

        String url = "https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=5";

        String text = Jsoup.connect(url)
                .ignoreContentType(true)
                .get()
                .body()
                .text();
        System.out.println(text);
    }
}
