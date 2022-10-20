package hw5.passaeger.planetFir;

public class FirNumSum extends FirNum{
    @Override
    public int calc(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;

        }
        return sum;
    }
}
