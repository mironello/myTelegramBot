public class TexturePool {
    private static TexturePool instance = new TexturePool();
    public static TexturePool getInstance(){
        return instance;
    }
    private TexturePool(){}

    public String getTexture(String textureName){
        return "Get texture " + textureName;
    }
}
