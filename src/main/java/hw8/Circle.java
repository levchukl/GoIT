package hw8;

public class Circle extends Shape{
    private int radius;
    final private double PI = Math.PI;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }
    @Override
    public double perimeter() {
        return 2*radius*PI;
    }

}
