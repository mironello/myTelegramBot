class AITest {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            new AI();
        }
    }
}
class AI{
    static{
        System.out.println("AI Loaded!");
    }
    {
        System.out.println("New AI created!");
    }
}