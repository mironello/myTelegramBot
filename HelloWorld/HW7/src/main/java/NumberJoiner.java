class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder str = new StringBuilder();
        for(int number: numbers) {
            str.append(number);
        }
        return str.toString();
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}