import java.util.Arrays;

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[]{"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));
        System.out.println(wordDeleter.remove("ibfe egces sydiesu mynopybi zawofu",
                new String[]{"zawofu", "ibfe", "egces"}));
    }
}

class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] arrPhrase = phrase.split(" ");
        StringBuilder str = new StringBuilder();
        for (String word : words
        ) {
            for (int i = 0; i < arrPhrase.length; i++) {
                if (word.equals(arrPhrase[i])) {
                    arrPhrase[i] = "";
                }
            }
        }
        for (String el : arrPhrase
        ) {
            if (el != "") {
                str.append(el).append(" ");
            }
        }
        return str.toString().trim();
    }
}