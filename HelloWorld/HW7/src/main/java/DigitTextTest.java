import java.util.regex.Matcher;
import java.util.regex.Pattern;

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));
    }
}
class DigitText{
    boolean isText = true;
    public boolean detect(String text){
        Pattern patern = Pattern.compile("(.*)[a-zA-Z](.*)");
        Matcher matcher = patern.matcher(text);
        if(matcher.matches()) {
            isText = false;
        }
        return isText;
    }
}