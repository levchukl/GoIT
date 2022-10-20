package hw5.season;

public class Winter extends Season{
    @Override
    public String getName() {
        return "winter";
    }

    @Override
    public boolean isCold() {
        return true;
    }
}
