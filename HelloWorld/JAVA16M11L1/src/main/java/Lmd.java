import java.util.function.Function;

public class Lmd {

    public static void main(String[] args) {

        Function<String, Integer> function = new Function<>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        };

        Function<String, Integer> function2 = new Function<>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        };

        Function <String, Integer> function5 = s -> Integer.valueOf(s);
    }
}
