import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int i = 3;
        int[] arr2 = {21, 333, -2};
        int[] arr = new int[3];
        System.out.println(arr.length);
        arr[0] = 3;
        arr[1] = 234;
        arr[2] = 8;


        System.out.println(arr.toString());
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        String[] strings = new String[2];
        strings[0] = "asad";
        strings[1] = "@WEF";

        Human[] humans = new Human[3];

        humans[0] = new Human();
        humans[0].name = "Fdd";
        humans[0].age = 34;

        System.out.println(Arrays.toString(humans));


        System.out.println("strins: " + Arrays.toString(strings));

        int[][] twoDimArr = new int[3][2];
        twoDimArr[0][0] = 1;
        twoDimArr[1][0] = 2;
        twoDimArr[2][0] = 3;
        twoDimArr[0][1] = 4;
        System.out.println("Two dim mas: " + Arrays.toString(twoDimArr[0]));
        System.out.println("Two dim mas: " + Arrays.toString(twoDimArr[1]));
        System.out.println("Two dim mas: " + Arrays.toString(twoDimArr[2]));

    }
}
