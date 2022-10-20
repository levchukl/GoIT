package hw4;

public class TriangleDrawer {
    public String drawTriangle(int side){
        String result="";
        while (side>0){
            result+="*".repeat(side);
            result+="\n";
            side--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new TriangleDrawer().drawTriangle(3));
    }
}
