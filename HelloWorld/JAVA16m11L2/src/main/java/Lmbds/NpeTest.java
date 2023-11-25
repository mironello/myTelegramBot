package Lmbds;

import java.util.Optional;

public class NpeTest {
    public static void main(String[] args) {

        Human humanFromDb = getHumanFromDb(8);
        if (humanFromDb != null) {
            System.out.println("humanFromDb = " + humanFromDb);
        }

        Optional<Human> humanFromDbOpt = getHumanFromDbOpt(22);
        System.out.println("humanFromDbOpt.isPresent() = " + humanFromDbOpt.isPresent());
        System.out.println("humanFromDbOpt.isEmpty() = " + humanFromDbOpt.isEmpty());

//        humanFromDbOpt.get();
        Human human = humanFromDbOpt.orElseGet(() -> {
            return new Human();
        });
        Human human1 = humanFromDbOpt.orElse(new Human());

        humanFromDbOpt.orElseThrow(() -> {
            return new IllegalArgumentException("bad");
        });

        humanFromDbOpt.ifPresentOrElse((h) -> {
            //якщо є виконається це
        }, () -> {
            // якщо немає, виконається це
        });


    }

    public static Human getHumanFromDb(int id) {
        if (id == 1) {
            return new Human();
        }
        return null;
    }

    public static Optional<Human> getHumanFromDbOpt(int id) {
        if (id == 1) {
            Human human1 = new Human();
            Optional<Human> humanOpt = Optional.of(human1);
        }
        return Optional.empty();
    }


}
