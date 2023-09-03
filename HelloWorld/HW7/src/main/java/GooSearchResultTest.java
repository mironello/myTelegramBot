import java.util.Locale;

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}class GooSearchResult{
    private String url;
    public GooSearchResult(String url){
        this.url = url;
    }
    public String getUrl (){
        return url;
    }

    public String parseDomain(){
        int indexStartsDomain = getUrl().indexOf("://")+3;
        int indexEndsDomain = getUrl().indexOf("/", indexStartsDomain);
        if(indexEndsDomain!=-1){
            return url.substring(indexStartsDomain,indexEndsDomain);
        }else {
            return url.substring(indexStartsDomain);
        }
    }
}