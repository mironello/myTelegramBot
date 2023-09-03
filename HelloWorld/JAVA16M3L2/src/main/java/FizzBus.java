public class FizzBus {

    public static void main(String[] args) {
        int i = 30;
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + "FIZZ BUZZ");
        }else if (i % 3 == 0) {
                System.out.println(i + "=> FiZZ");
            } else if (i % 5 == 0) {
                System.out.println(i + " =>BUZZ");
            } else {
            System.out.println(i);
        }
        }

}
