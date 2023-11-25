import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select action:");
        System.out.println("1 -> add");
        System.out.println("2 -> sub");
        System.out.println("3 -> multiply");

        int action = scanner.nextInt();

        System.out.println("Enter first number: ");
        int n1 = scanner.nextInt();


        System.out.println("Enter second number: ");
        int n2 = scanner.nextInt();

        if(action == 1){
            System.out.println("sum=" +(n2+n1));
        } else if(action==2){
            System.out.println("sub=" +(n2-n1));
        }else if(action == 3){
            System.out.println("multiply=" +(n2*n1));
        }else {
            System.out.println("Incorrect action");
        }
    }
}
