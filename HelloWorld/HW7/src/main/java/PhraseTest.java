import java.util.Arrays;

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}

final class Phrase {
    private final String[] words;

    public Phrase(String[] words) {
        this.words = words.clone();
    }

    @Override
    public String toString() {
return String.join(" ", words);
    }
}