package Human;

public class Tester extends Human{
    private boolean isAutomation;

    public Tester(boolean isAutomation) {
        this.isAutomation = isAutomation;
    }

    @Override
    public void printHumanInfo() {
        System.out.println("This is tester and automation is = "+isAutomation);
    }
}
