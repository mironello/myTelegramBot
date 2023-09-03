public class LevelLoader {

    private static LevelLoader instance = new LevelLoader();
    private LevelLoader(){}

    public static LevelLoader getInstance(){
        return instance;
    }

    String load(String levelName){
        return "Loading level " + levelName + " ...";
    }
}
