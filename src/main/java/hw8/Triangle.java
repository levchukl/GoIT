package hw8;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        super("Triangle");
        this.a = a;
        this.b =b;
        this.c= c;
    }
    @Override
    public double perimeter() {
        return a+b+c;
    }
}
