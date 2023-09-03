public class StudentSchoolDataValidatator  implements StudentValidator, SmsNotification{
    private SmsNotificationService smsNotificationService;
    @Override
    public boolean validate(Student student) {
        smsNotificationService.send("you are valid");
        return true;
    }


    @Override
    public void send(String text) {
        smsNotificationService.send("message from student data validation process is: " + text);
    }
}
