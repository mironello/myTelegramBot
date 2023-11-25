import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static String formatNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0) // Відфільтрувати непарні індекси
                .mapToObj(i -> (i + 1) + ". " + names.get(i)) // Створити рядки у вказаному форматі
                .collect(Collectors.joining(", ")); // Об'єднати рядки через кому
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Peter", "John", "Mary", "Alice");

        String result = formatNames(names);

        System.out.println(result);
    }
}