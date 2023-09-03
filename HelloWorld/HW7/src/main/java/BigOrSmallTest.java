class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}
class BigOrSmall{
    public String calculate(String text) {
        int bigCount = 0;
        int smallCount = 0;
        for (char c :
                text.toCharArray()) {
            if (Character.valueOf(c) > 64 && Character.valueOf(c) < 91) {
                bigCount++;
            }
            if (Character.valueOf(c) > 96 && Character.valueOf(c) < 123) {
                smallCount++;
            }
        }
        if(bigCount == smallCount){
            return "Same";
        } else return bigCount>smallCount?"Big":"Small";

    }
}