package task1and2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HomeWork11 {
//Task1
    public static String formatNames(List<String> names){
        return IntStream.range(0, names.size())
                .filter(i->i%2==0)
                .mapToObj(i->i+1 + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
//task2
    public static List<String> namesList(List<String> names){
       return names.stream()
               .map(String::toUpperCase)
               .sorted((s1, s2) -> s2.compareTo(s1))
               .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> names = List.of("Ann", "Oleg", "Alice", "Alex", "Serg");
        System.out.println("namesList(names) = " + namesList(names));

        System.out.println("formatNames(names) = " + formatNames(names));
    }
//public static String oddNames(List<List<User>> lists){
//
//
//      String collect = lists.stream()
//            .flatMap(Collection::stream)
//            .map(u -> u.getName())
//            .collect(Collectors.joining(", ")
//            );
//    System.out.println(collect);
//      return collect;
//}
//
//    public static void main(String[] args) {
//        List<User> users1 = new ArrayList<>();
//        users1.add(new User("Ivan1", "Ivan1@asd"));
//        users1.add(new User("Oleg", "Oleg@asd"));
//
//        List<User> users2 = new ArrayList<>();
//        users2.add(new User("Ivan2", "Ivan2@asd"));
//        users2.add(new User("Oleg", "Oleg@asd"));
//
//        List<List<User>> lists = List.of(users1, users2);
//
//    }
}
