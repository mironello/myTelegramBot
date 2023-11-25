import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in); //Створили об'єкт Scanner
//       sdfgопросили користувача ввести число
//        int num = in.nextInt(); //Прочитали число
//        System.out.println("Your number is " + num); //Вивели число
//        String s = in.next();
//        String nextLine = in.nextLine();
//        System.out.println(s);
//        System.out.println(nextLine);
//        m5();
//        in.close(); //Закрили об'єкт scanner - остання операція
        System.out.println();

    }

    public int[] findMinMaxPrices(int[] prices){

        Arrays.sort(prices);
        int min = prices[0];
        int max = prices[prices.length -1];

        if (prices.length == 0){
            return new int[]{};
        } else if(min==max){
            return new int[]
       {min};
        } else {
            return new int [] {min,max};
        }
    }

    private static void m5(){
        Human human = new Human();
        human.name="Thh";
        human.age = 29;


        System.out.println("Human name: "+human.name+'\n'+ "Human age: "+ human.age);
    }

    public static void m4(){
        Scanner scan = new Scanner(System.in);
        float f = scan.nextFloat();
        System.out.println(f);

    }
//    public void printPrices(float[] prices) {
//        for(int i=0;i<price.length; i++){
//            System.out.println(String.valueOf(price[i])+" jup.");
//        }
//    }
}
