public class GameMenu {
    static abstract class MenuItem{
        public abstract String getAction();
    }
    void act(MenuItem item){
        System.out.println(item.getAction());
    }
    public static class Options extends MenuItem {
        @Override
        public String getAction(){
            return "options";
        }
    }
    public static class Start extends MenuItem {
        @Override
        public String getAction(){
            return "start";
        }
    }
    public static class Exit extends MenuItem{
        @Override
        public String getAction(){
            return "exit";
        }
    }

}
