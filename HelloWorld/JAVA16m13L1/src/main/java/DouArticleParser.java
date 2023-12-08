import org.jsoup.select.Elements;

import org.jsoup.nodes.Element;

public class DouArticleParser {
    private Element article;

    public DouArticleParser(Element article) {
        this.article = article;
    }

    public String getTitle(){
        return article.select("h2.title").text();
    }

    public int getViews(){
        return Integer.valueOf(article.select("span.pageviews").text());
    }
}
