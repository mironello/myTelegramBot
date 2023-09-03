package Human;

public class HumanTest {
    public static void main(String[] args) {

        polimorph1();
    }
    public static void polimorph1(){
        Human human = new Human("Ivan", 33);
        Developer developer1 = new Developer("Java");
        Developer developer2 = new Developer("Java");
        Tester tester1 = new Tester(true);
        Tester tester2 = new Tester(true);


        human.printHumanInfo();
        developer1.printHumanInfo();
        tester1.printHumanInfo();

        Human developerToHuman = developer1;
        developerToHuman.printHumanInfo();
        Human testerToHuman = tester1;
        testerToHuman.printHumanInfo();

        Human [] hArr = {human, developer1, developer2, tester1,  tester2};
        System.out.println("Print in cycle");
        for (Human h:hArr
             ) {
            h.printHumanInfo();

        }


    }
    public static void m1(){
        Human human1 = new Human("Lola", 45);
        Human human2 = new Human("Lola", 45);
        Human human3 = new Human("Lola", 20);
        Human human4 = new Human("Koka", 44);
        String sName = "Fsdf";
        System.out.println("human1.equals(human2)= "+ human1.equals(human2));
        System.out.println("human1.equals(human3)=" +human1.equals(human3));
        System.out.println("human1.equals(human4)="+human1.equals(human4));
        System.out.println("human1.equals(sName)="+human1.equals(sName));
    }

}
