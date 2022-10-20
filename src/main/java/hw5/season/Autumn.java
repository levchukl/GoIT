package hw5.season;

public class Autumn extends Season{
    @Override
    public String getName() {
        return "autumn";
    }

    @Override
    public boolean isCold() {
        return true;
    }
}
