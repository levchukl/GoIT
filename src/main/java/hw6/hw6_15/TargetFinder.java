package hw6.hw6_15;

public class TargetFinder {
    private int calcDist(int x1, int y1, int x2, int y2){
        return (int) Math.round(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
    }
    public int[] findTarget(int[] aiCoords, int[][] targets){
        int distance = Integer.MAX_VALUE;
        int indexResult = 0;
        for (int i = 0; i < targets.length; i++) {
            if (distance>calcDist(aiCoords[0],aiCoords[1],targets[i][0],targets[i][0])){
                distance=calcDist(aiCoords[0], aiCoords[1], targets[i][0],targets[i][1]);
                indexResult=i;
            }
        }
        return new int[]{targets[indexResult][0], targets[indexResult][1]};
    }

}
