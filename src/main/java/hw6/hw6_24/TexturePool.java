package hw6.hw6_24;

public class TexturePool {
    private static TexturePool instance = new TexturePool();

    private TexturePool() {
    }

    public static TexturePool getInstance(){
        return instance;
    }
    public String getTexture(String textureName){
        return "Get texture "+ textureName;
    }
}
