package hw6.hw6_13;

import java.util.Objects;

public class QuarkeTrack {

    private int [] lines;
    private int distance;

    public int getDistance() {
        int countDistance = 0;
        for (int line : lines) {
            countDistance += line;
        }
        return countDistance;
    }

    public QuarkeTrack(int[] lines) {
        this.lines = lines;
        if (lines==null || lines.length==0){
            distance=0;
        }else {
            distance=getDistance();
        }

        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof QuarkeTrack)) return false;
        QuarkeTrack quarkeTrack = (QuarkeTrack) o;

        return distance==quarkeTrack.distance;
    }

    @Override
    public int hashCode() {

        return Objects.hash(distance);
    }
}