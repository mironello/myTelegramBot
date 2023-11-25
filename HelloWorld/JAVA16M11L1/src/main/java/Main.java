import java.io.FileReader;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function <String, Integer> function = new Function<>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        };

        Integer i = function.apply("78");
        System.out.println("i = " + i);
    }
    public int method(String str, Function<String, Integer> mapper){
        return mapper.apply(str);
    }

}
