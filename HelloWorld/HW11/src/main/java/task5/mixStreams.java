package task5;

import java.util.Arrays;
import java.util.stream.Stream;

public class mixStreams {public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

    Object[] firstArray = first.toArray();
    Object[] secondArray = second.toArray();


    int minLength = Math.min(firstArray.length, secondArray.length);


    return Stream.concat(
            Arrays.stream(firstArray).boxed().limit(minLength),
            Arrays.stream(secondArray).boxed().limit(minLength)
    );
}

    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> secondStream = Stream.of(6, 7, 8, 9, 10);

        // Вивід: 1, 6, 2, 7, 3
        mixStreams(firstStream, secondStream).forEach(System.out::println);
    }
}
