import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class DouJsoupParser {

    public static void main(String[] args) throws IOException {
        String url = "https://dou.ua/lenta/sitenews/winter-survey-2023/?from=recent_pinned";

        Document doc = Jsoup.connect(url).get();

        Element bode = doc.body();
        String text = doc.text();
        Element article = doc.getElementsByTag("article ").first();

        Elements h1 = article.getElementsByTag("h1");

        System.out.println("h1 = " + h1.text());

        Elements h2s = article.getElementsByTag("h2");

        for(Element h2: h2s){
            System.out.println("h2.text() = " + h2.text());
        }
    }
}
