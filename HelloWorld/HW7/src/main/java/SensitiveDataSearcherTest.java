class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
class SensitiveDataSearcher{
    public boolean isSensitiveDataPresent(String phrase){
        boolean isSensitive = false;
        String [] arrPhrase = phrase.toLowerCase().split(" ");
        for (String word:arrPhrase
             ) {
            if(word.equals("pass")||
                word.equals("email")||
                word.equals("key")||
                word.equals("login")){
                isSensitive=true;
            }
        }
        return isSensitive;
    }
}