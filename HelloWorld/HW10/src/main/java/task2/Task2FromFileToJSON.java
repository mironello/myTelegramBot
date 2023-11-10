package task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task2FromFileToJSON  {


    public List<User> readUsersFromFile(String filePath) {
        List<User> userList = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String headerLine = reader.readLine();
                String [] headers = headerLine.split("\\s+");

                String line;

                while((line=reader.readLine())!=null){
                    String [] values = line.split("\\s+");
                User user = new User();
                    for (int i = 0; i < Math.min(headers.length, values.length); i++) {
                        user.setProperty(headers[i], values[i]);
                    }
                    userList.add(user);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
            return userList;
    }

    public void writeUsersToJSONFile(List<User> userList, String filePathToJson){
        try(FileWriter writer = new FileWriter(filePathToJson)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(userList, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String inputFile = "file.txt";
        String outputFile = "user.json";
        Task2FromFileToJSON t2 = new Task2FromFileToJSON();

        List<User> userList = t2.readUsersFromFile(inputFile);// reading file and return List<User> userList

        t2.writeUsersToJSONFile(userList, outputFile);// input userList into user.json
    }
}
