package hw5.passaeger.planetFir;

public class FirNumBasis extends FirNum{
    @Override
    public int calc(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i++;

            }
        }
        return sum/2;
    }
}
