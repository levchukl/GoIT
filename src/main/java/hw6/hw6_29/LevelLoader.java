package hw6.hw6_29;

public class LevelLoader {
    public void load(Level level) throws LevelTooBigException{
        if(level.getHeight()* level.getWidth()>100000){
            throw new LevelTooBigException();
        }
        System.out.println("Level loaded");
    }
}
