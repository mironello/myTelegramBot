package Lmbds;

import User.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        List<User> users1 = new ArrayList<>();
        users1.add(new User("Ivan1", "Ivan1@asd"));
        users1.add(new User("Oleg", "Oleg@asd"));

        List<User> users2 = new ArrayList<>();
        users2.add(new User("Ivan2", "Ivan2@asd"));
        users2.add(new User("Oleg", "Oleg@asd"));

        List<List<User>> lists = List.of(users1, users2);

       Map<String, User> res = lists.stream()
        .flatMap(Collection::stream)
                .filter(user -> user.getName().startsWith("I"))
                .collect(Collectors.toMap(
                        user -> user.getEmail(),
                        Function.identity()
                ));
    }
}
