package student;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GSonTest {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Student student = new Student("Van", 23);

        Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson1.toJson(student);

        System.out.println("jsonString.toString() = " + jsonString.toString());
    }
}
