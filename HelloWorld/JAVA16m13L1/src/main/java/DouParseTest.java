import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DouParseTest    {
    public static void main(String[] args) throws IOException, InterruptedException {


//    https://dou.ua/lenta/sitenews/winter-survey-2023/?from=recent_pinned

        String url = "https://dou.ua/lenta/sitenews/winter-survey-2023/?from=recent_pinned";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();

        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());




    System.out.println("responce.StatusCode() " + response.statusCode());
    System.out.println("responce.headers() " + response.headers());

        FileWriter fw = new FileWriter("dou.html");
        fw.write(response.body());
        fw.close();
    }
}
