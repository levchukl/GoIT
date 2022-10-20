package hw6.hw6_28;

public class TotalScore {
    public int sum(int[] scores) {
        int result = 0;
        for (int i = 0; i < scores.length; i++) {
            result+=scores[i];
        }
        return result;
    }
}
