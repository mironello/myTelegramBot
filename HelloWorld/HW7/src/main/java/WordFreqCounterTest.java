class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
        System.out.println(freqCounter.countFreq(
                "jepem fiwacedylo vaunjisoboj Feqojeyseg idzupuqa qiewqoi Feqojeyseg sysydy giboebbube", "Feqojeyseg"));
    }
}
class WordFreqCounter{
    public float countFreq(String phrase, String word){
        String [] arrPhrase = phrase.toLowerCase().split(" ");
        word = word.toLowerCase();
        float count = 0.0F;
        for (String el:arrPhrase
             ) {
            if(word.equals(el)){
                count++;
            }
        }
        return (float)count/arrPhrase.length;
    }
}