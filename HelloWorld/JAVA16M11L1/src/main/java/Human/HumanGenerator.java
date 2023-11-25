package Human;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HumanGenerator {
    public static List<Human> generate(int size) {
        Random random = new Random();

        List<String> names = List.of("Rgas", "WQsd", "QFGEWQ", "Igor", "Alex", "Oleg", "Olga");
        List<String> sNames = List.of("Haiba", "Myron", "Popov", "Velykyi", "Alexov", "Tymonko", "Gavrylenko");

        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            String name = names.get(random.nextInt(names.size()));
            String sName = sNames.get(random.nextInt(sNames.size()));

            Human human = new Human(name + " " + sName, random.nextInt(60), random.nextInt(4000) + 500);
            humans.add(human);
        }
        return humans;


    }
}
