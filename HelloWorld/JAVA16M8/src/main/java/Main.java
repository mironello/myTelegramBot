public class Main {
    public static void main(String[] args) {
        StudentSchoolDataValidatator studentSchoolDataValidatator = new StudentSchoolDataValidatator();
        studentSchoolDataValidatator.validate(new Student());
        studentSchoolDataValidatator.send("you are good");
    }
}
