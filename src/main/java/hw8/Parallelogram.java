package hw8;

public class Parallelogram extends Shape{
    private double a;
    private double b;

    public Parallelogram(double a, double b) {
        super("Parallelogram");
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }

}
