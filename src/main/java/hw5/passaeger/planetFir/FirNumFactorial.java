package hw5.passaeger.planetFir;

public class FirNumFactorial extends FirNum{
    @Override
    public int calc(int n){
        int res = 1;
        for (int i = 1; i <=n; i++) {
            res *=i;
        }
        return res;
    }
}
