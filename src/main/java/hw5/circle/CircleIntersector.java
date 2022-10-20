package hw5.circle;

public class CircleIntersector {
    int x1;
    int y1;
    int r1;
    int x2;
    int y2;
    int r2;
    int first;
    int second;
    int third;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        first = Math.abs(y1-x1);
        second = Math.abs(y2-x2);
        third = Math.abs(r1+r2);

    }
    @Override
    public String toString() {
        String result = "";
        if (first+second<=third){
              result =  "intersects";
            }else  {
            result = "not intersects";
        }
        return result;
    }
}
