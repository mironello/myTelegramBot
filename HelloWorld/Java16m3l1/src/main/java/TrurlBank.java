public class TrurlBank {
    public int sumQuads(int n){
        int number = 1;
        int result = 0;
        while (number <= n) {
            result += number * number;
            number++;
        }
        return result;
    }
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
    }
}
