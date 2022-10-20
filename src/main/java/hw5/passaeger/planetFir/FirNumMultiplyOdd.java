package hw5.passaeger.planetFir;

public class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                res *= i;
            }
        }
        return res;
    }
}
