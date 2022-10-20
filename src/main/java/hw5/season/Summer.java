package hw5.season;

public class Summer extends Season{
    @Override
    public String getName() {
        return "summer";
    }

    @Override
    public boolean isCold() {
        return false;
    }
}
