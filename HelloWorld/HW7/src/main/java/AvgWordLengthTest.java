class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}
class AvgWordLength{
    public double count(String phrase){
        String [] str = phrase.split(" ");
        double sum = 0.0;
        for (String word :
                str) {
            sum+=word.length();
        }
        return sum/str.length;
    }
}