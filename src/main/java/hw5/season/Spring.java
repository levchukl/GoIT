package hw5.season;

public class Spring extends Season{
    @Override
    public String getName() {
        return "spring";
    }

    @Override
    public boolean isCold() {
        return false;
    }
}
