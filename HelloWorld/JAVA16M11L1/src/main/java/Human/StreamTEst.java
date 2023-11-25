package Human;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTEst {
    public static void main(String[] args) {
        List<Human> humans1 = HumanGenerator.generate(10);
        List<Human> humans2 = HumanGenerator.generate(10);
        List<Human> humans3 = HumanGenerator.generate(10);

        List<List<Human>> megaList = List.of(humans1, humans2, humans3);

        Map<String, Human> res = megaList.stream()
                .flatMap(Collection::stream)
                .sorted(Comparator.comparing(Human::getSalary))
//                .collect(Collectors.toMap(Human::getName, Human::getSalary));
                .collect(Collectors.toMap(Human::getName, Function.identity()));


//        for (Human h :
//                res) {
//            System.out.println("h = " + h);
//        }
    }

    public static void a5(){
        List<Human> humans = HumanGenerator.generate(100);

        Optional<Human> res = humans.stream()
                .sorted(Comparator.comparing(Human::getSalary))
                .skip(1)
                .findFirst();

        System.out.println("res.get() = " + res.get());

    }

    public static void a4() {
        List<Human> humans = HumanGenerator.generate(100);

        List<Human> res = humans.stream()
                .filter(human -> human.getSalary() > 2000)
                .sorted(Comparator.comparing(Human::getSalary).reversed()
                        .thenComparing(Human::getName))
                .skip(10)
                .limit(5)
                .distinct()
                .collect(Collectors.toList());

        for (Human h :
                res) {
            System.out.println("h = " + h);
        }
    }

    public static void a3() {
        List<Human> humans = HumanGenerator.generate(20);

        List<Integer> res = humans.stream()
                .filter(human -> human.getSalary() > 1000 && human.getSalary() < 2000)
                .sorted(Comparator.comparing(Human::getName))
                .peek(System.out::println)
                .map(human -> human.getAge())
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        for (Integer h :
                res) {
            System.out.println("h = " + h);
        }
    }

    public static void a2() {
        List<Human> humans = HumanGenerator.generate(20);
        List<Human> res = humans.stream()
                .filter(human -> human.getName().toLowerCase().startsWith("i"))
                .filter(human -> human.getSalary() > 1000 && human.getSalary() < 2000)
                .collect(Collectors.toList());

        for (Human h :
                res) {
            System.out.println("h = " + h);
        }
    }


    public static void a1() {
        List<Human> humans = HumanGenerator.generate(20);

//        for (Human human: humans
//        ) {
//            System.out.println("human = " + human);
//
//        }

//        humans.stream()
//                .peek(human -> System.out.println(human))
//                .collect(Collectors.toList());
//    }
        humans.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
