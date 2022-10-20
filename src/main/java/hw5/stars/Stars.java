package hw5.stars;

public class Stars {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void NumberToString( StringBuilder stringBuilder, int StarNumber, String SymbolStarNumber){
        stringBuilder.append(SymbolStarNumber);
        count-=StarNumber;
    }
    @Override
    public String toString(){
        final StringBuilder stringBuilder = new StringBuilder();
        while (count>0){
            if (count>=1000){
                NumberToString(stringBuilder, 1000, "X");
            } else if (count>=100) {
                NumberToString(stringBuilder, 100, "Y");
            } else if (count>=10) {
                NumberToString(stringBuilder, 10, "Z");
            } else if (count>=1) {
                NumberToString(stringBuilder, 1, "*");
            }
        }
        return stringBuilder.toString();
    }

//    @Override
//    public String toString() {
//        int a = count;
//        String x = "X";
//            if (a > 1000) {
//                count--;
//                return x;
//
//            }
//        String y = "y";
//            if (a > 100) {
//                return y;
//            }
//        String z = "Z";
//            if (a > 10) {
//                count--;
//                return z;
//            }
//            String one = "*";
//            if (a > 0) {
//                count--;
//                return one;
//            }
//
//        return x+y+z+one;
//
//    }
}
