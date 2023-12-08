import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class DouArtParser {

    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://dou.ua/lenta/").get();

        Element topArticlesDiv = doc.getElementsByClass("b-lenta    ").first();
        Elements articles = topArticlesDiv.getElementsByTag("article");

        for(Element article :articles){
            DouArticleParser douArticleParser = new DouArticleParser(article);
            System.out.println("douArticleParser.getTitle() = " + douArticleParser.getTitle());
            System.out.println("douArticleParser.getViews() = " + douArticleParser.getViews());
            System.out.println("*************");
        }
    }
}
