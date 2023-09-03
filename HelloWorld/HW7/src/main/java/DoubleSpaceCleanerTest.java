import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
class DoubleSpaceCleaner{
    public String clean(@NotNull String phrase){
        String [] cleanArrPhrase = phrase.trim().split("\\s+");

        return String.join(" ", cleanArrPhrase);
    }

}