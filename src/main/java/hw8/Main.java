package hw8;


public class Main {
    public static void main(String[] args) {
     Circle shape = new Circle(150);
     Parallelogram parallelogram = new Parallelogram(12,25);
     Quad quad = new Quad(30);
     Rectangle rectangle = new Rectangle(45,20);
     Triangle triangle = new Triangle(10,15,20);

     ShapeInfo shapeInfo = new ShapeInfo();
     shapeInfo.print(shape);

        System.out.println(parallelogram.perimeter());
    }

}
