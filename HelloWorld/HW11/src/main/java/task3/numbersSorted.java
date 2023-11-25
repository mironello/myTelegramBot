package task3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.stream.Collectors;

public class numbersSorted {
    public static void main(String[] args) {
        String[] inputArray = {"1, 2, 0", "4, 5"};

        System.out.println(sortedStringNumbers(inputArray));

    }

    public static String sortedStringNumbers(String [] inputArr){
        String result =  Arrays.stream(inputArr)
                .flatMap(s->Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .distinct()
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
        return result;
    }
}
