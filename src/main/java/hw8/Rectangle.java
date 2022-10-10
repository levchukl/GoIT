package hw8;

public class Rectangle extends Shape{

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        super("Rectangle");
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    @Override
    public double perimeter() {
        return 2*(a+b);
    }

}
