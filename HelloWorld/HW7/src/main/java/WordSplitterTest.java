import java.util.Arrays;

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}

class WordSplitter {

    public String[] split(String phrase) {
        String[] words = phrase.toLowerCase().split("\\s+");
        return words;
//        int count = 0;
//        for (String word :
//                words) {
//            if (word == "") {
//                count++;
//            }
//        }
//        String [] resWords = new String[words.length - count];
//        int index = 0;
//        for (int i = 0; i < words.length; i++) {
//            if (words[i] != "") {
//            resWords[index]=words[i];
//            index++;
//            }
//        }
//        return resWords;
    }
}