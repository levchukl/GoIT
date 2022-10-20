package hw5.planet.rectangleArea;

public class RectangleArea {
    int [] coords;

    public RectangleArea(int[] coords) {
        this.coords = coords;
    }
    public int getArea(){
        return (( coords[0] - coords[2])* (coords[1]-coords[3]))*-1;
    }

}
