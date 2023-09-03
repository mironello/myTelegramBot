import java.util.Objects;

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very po pular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}
class SummaryCreator{
    public String create(String text){
        StringBuilder str = new StringBuilder(text);
        if(text.length()<=15){
            return text;
        } else if (text.charAt(15)==32) {
            return text.substring(0,15);
        }else
            return text.substring(0,15).concat("...");
    }
}