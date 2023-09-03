class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}
class PalindromeCounter{
    public int count(String phrase){
        String [] arr = phrase.toLowerCase().split(" ");
        int count = 0;

        for (String word: arr
             ) {
           StringBuilder str = new StringBuilder(word);
           if(str.toString().equals(str.reverse().toString())){
               count++;
            }
        }
        return count;
    }
}