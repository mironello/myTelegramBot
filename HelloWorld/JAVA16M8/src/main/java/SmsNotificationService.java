public abstract class SmsNotificationService implements SmsNotification{

    public  void sendMsg(String msg){

    };

    @Override
    public void send(String text) {
        System.out.println("msd send: " + text);
    }
}
