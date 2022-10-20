package hw6.hw6_14;

public class Rectangle {
    private int a;
    private int b;
    private int area;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        this.area = a*b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getArea() {
        return area;
    }
    public boolean canPlaceInto(Rectangle anotherRect){
        if (this.a + this.b == anotherRect.a + anotherRect.b)
            return true;
        return this.a<=anotherRect.a
                && this.b<=anotherRect.b
                && this.area <=anotherRect.area;
    }

}
