package hw6.hw6_21;

public class LevelLoader {
    private static LevelLoader instance = new LevelLoader();

    private LevelLoader() {
    }

    public static LevelLoader getInstance(){
        return instance;
    }

    public String load(String levelName){
        return "Loading level "+levelName+" ...";
    }



}