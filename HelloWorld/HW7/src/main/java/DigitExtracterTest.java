import java.util.Arrays;

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}

class DigitExtracter {
    public int[] extract(String text) {
        int digitCount = 0;

        for (char c :
                text.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        int[] digitsArr = new int[digitCount];
        int index = 0;
        for (char c :
                text.toCharArray()) {
            if (Character.isDigit(c)) {
                digitsArr[index] = Character.digit(c, 10);
                index++;
            }
        }
        return digitsArr;
    }
}