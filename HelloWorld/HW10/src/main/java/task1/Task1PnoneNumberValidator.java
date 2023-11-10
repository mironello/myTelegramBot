package task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1PnoneNumberValidator {

    public void isValid() throws FileNotFoundException {

        File file = new File("file.txt");
        String number ;

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){

                number = scanner.nextLine().trim();

                if(isValidNumber(number)){
                    System.out.println(number);
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("no such el");
        }
    }

    public boolean isValidNumber(String number){
        Pattern pattern = Pattern.compile("^\\(\\d{3}\\) \\d{3}-\\d{4}|\\d{3}-\\d{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }


    public static void main(String[] args) throws FileNotFoundException {

        Task1PnoneNumberValidator task1PnoneNumberValidator = new Task1PnoneNumberValidator();
        task1PnoneNumberValidator.isValid();
    }
}
