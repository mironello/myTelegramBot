package task3;

import java.io.*;
import java.util.*;

public class WordRepeatCounter {

    //read text from file to ArrayList
    public ArrayList<String> readFileToArray(String filePath) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        StringJoiner sj = new StringJoiner(" ");
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                sj.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arr = sj.toString().split(" ");
        for (String el :
                arr) {
            list.add(el);
        }
        return list;
    }


// count and output count of word's repeat
    public void repeatCount(String filePath) throws IOException {
        ArrayList<String> arr = readFileToArray(filePath);

        HashMap<String, Integer> wordCounter = new HashMap<>();
        for(String word: arr){
            wordCounter.put(word, wordCounter.getOrDefault(word, 0)+1);
        }

        for (String word :
                wordCounter.keySet()){
            System.out.println(word + " " + wordCounter.get(word));
        }
    }

    public static void main(String[] args) throws IOException {
        WordRepeatCounter wfc = new WordRepeatCounter();
        wfc.repeatCount("C://Users/user/IdeaProjects/HelloWorld/word");
    }
}
