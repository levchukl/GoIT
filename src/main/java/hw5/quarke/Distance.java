package hw5.quarke;

public class Distance {
    int startX;
    int startY;
    int endX;
    int endY;


    public  Distance(int startX, int startY, int endX, int endY) {
        this.startX=startX;
        this.startY=startY;
        this.endX=endX;
        this.endY=endY;
    }

    public int getDistance(){
       return (int) Math.round(Math.sqrt((endY-startY)*(endY-startY)+(endX-startX)*(endX-startX)));
    }
}
