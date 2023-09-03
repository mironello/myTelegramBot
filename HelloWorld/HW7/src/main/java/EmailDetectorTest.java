class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
        System.out.println(new EmailDetector().isPresent("d rewo cuvo wa@h kaj a h"));
    }
}
class EmailDetector{
    public boolean isPresent(String text){
        boolean isPres = false;
        int index = text.indexOf("@");
        for (int i = 1; i < 3 ; i++) {
            if(index >2 && text.length()>5){
                if((text.charAt(index-i)==32)||(text.charAt(index+i)==32)){
                    return false;
                }
                else isPres = true;
            }
        }
        return isPres;
    }
}