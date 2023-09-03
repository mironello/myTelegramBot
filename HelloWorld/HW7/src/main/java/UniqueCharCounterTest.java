class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}

class UniqueCharCounter {
    public int count(String phrase) {
        char[] arrPhrase = phrase.toCharArray();
        StringBuilder str = new StringBuilder(phrase);

        for (int i = 0; i < arrPhrase.length; i++) {
            int firstIndex = str.indexOf(String.valueOf(arrPhrase[i]));
            int lastIndex = str.lastIndexOf(String.valueOf(arrPhrase[i]));
            if (firstIndex != lastIndex) {
                str.deleteCharAt(lastIndex);
            }
        }
        return str.length();
    }
}