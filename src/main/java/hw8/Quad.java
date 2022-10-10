package hw8;

public class Quad extends Shape{
    private double side;

    public Quad(double side){
        super("Quad");
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public double perimeter() {
        return 4*side;
    }

}
