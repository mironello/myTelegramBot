import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.print.Doc;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.net.ConnectException;

public class JsonPlaceholderAPI {

    private static final String API_URL = "https://jsonplaceholder.typicode.com/users";
    private static final String POST_URL = "https://jsonplaceholder.typicode.com/users/1/posts";
    private static final String COMMENTS_URL_TEMPLATE = "https://jsonplaceholder.typicode.com/posts/%d/comments";

    private static final String TODOS_URL_TEMPLATE = "https://jsonplaceholder.typicode.com/users/%d/todos";

    // 3 Завдання. Метод для отримання всіх відкритих задач для користувача з ідентифікатором userId
    public static void getOpenTodosForUser(int userId) throws IOException {
        String todosUrl = String.format(TODOS_URL_TEMPLATE, userId);

        Document todosDocument = Jsoup.connect(todosUrl).get();

        todosDocument.select("body > div > div")
                .stream()
                .filter(element -> !element.select("input").attr("checked").equals("checked"))
                .forEach(element -> System.out.println(element.text()));
    }

//    Create new user
    public static void createUser(String json) throws IOException {
        Connection.Response response = Jsoup.connect(API_URL)
                .ignoreContentType(true)
                .requestBody(json)
                .header("Content-type", "application/json")
                .method(Connection.Method.POST)
                .execute();

        if (response.statusCode() == 201){
            System.out.println("Created user:" + response.body());
        } else {
            System.out.println("Failed to create user. Response code:" + response.statusCode());
        }
    }

//    update user by ID
    public static void updateUser(String json, int userId) throws IOException{
        Connection.Response response =  Jsoup.connect(API_URL + "/" + userId)
                .ignoreContentType(true)
                .requestBody(json)
                .header("Content-type", "application/json")
                .method(Connection.Method.PUT)
                .execute();

        if(response.statusCode()==200){
            System.out.println("Updated user: " + response.body() );
        } else {
            System.out.println("Failed to update user. Response code: " + response.statusCode());
        }
    }

//    delete user by Id method
    public static void deleteUser(int userId) throws IOException{
        Connection.Response response = Jsoup.connect(API_URL + "/" + userId)
                .ignoreContentType(true)
                .header("Content-type", "application/json")
                .method(Connection.Method.DELETE)
                .execute();

        if(response.statusCode() == 200){
            System.out.println("Deleted user with id: " + userId);
        } else {
            System.out.println("Failed to delete user. Response code: " + response.statusCode());
        }
    }

//  get  all users' data
public static void getAllUsers() throws IOException{
    Document document = Jsoup.connect(API_URL).get();
    System.out.println(document.body());
}

//get user's data by id
    public static void getUserById(int userId) throws IOException{
        Document document = Jsoup.connect(API_URL +"/" + userId).get();
        System.out.println(document.body());
    }

//    get user by userNAme
    public static void getUserByUsername(String username) throws IOException{
        Document document = Jsoup.connect(API_URL +"?username" + username).get();
        System.out.println(document.body());
    }

//    get all comments to last post of user
    public static void getAllCommentsForLastPost(int userId) throws IOException{
        Document postsDocument = Jsoup.connect(POST_URL).get();
        int lastPostId = Integer.parseInt(postsDocument.select("body > div > div").last().attr("id"));
        String commentsUrl = String.format(COMMENTS_URL_TEMPLATE, lastPostId);

        Document commentsDocument = Jsoup.connect(commentsUrl).get();
        String fileName = String.format("user-%d-post-%d-comments.json", userId, lastPostId);

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(commentsDocument.body().html());
        }

        System.out.println("Comments saved to " + fileName);
    }

    public static void main(String[] args) throws IOException {
        // Приклад використання методів
        // Створення нового користувача
        createUser("{\"name\":\"John\", \"username\":\"john_doe\", \"email\":\"john@example.com\"}");

        // Оновлення користувача за id
        updateUser("{\"name\":\"John Doe\", \"username\":\"john_doe_updated\", \"email\":\"john@example.com\"}", 1);

        // Видалення користувача за id
        deleteUser(1);

        // Отримання інформації про всіх користувачів
        getAllUsers();

        // Отримання інформації про користувача за id
        getUserById(2);

        // Отримання інформації про користувача за username
        getUserByUsername("Bret");

        // Отримання всіх коментарів до останнього поста певного користувача
        getAllCommentsForLastPost(1);

        getOpenTodosForUser(1);
    }
}
