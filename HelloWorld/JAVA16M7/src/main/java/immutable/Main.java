package immutable;

public class Main {
    public static void main(String[] args) {
        String changed = "123" +"hello" + " java";
      String newString=  changed.replace("1", "error");
        System.out.println(changed);
        System.out.println(newString);
    }
}
