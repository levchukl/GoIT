package hw4;

public class TrurlBank {
    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();
        System.out.println(bank.sumQuads(3));
        System.out.println(bank.countSumOfDigits(547));
    }
    public int sumQuads(int n){
        int result = 0;
        while (n>0){
            result+=n*n;
            n--;
        }
        return result;
    }
    public int countSumOfDigits(int number){
        int result = 0;
        while (number!=0){
            result+=number%10;
            number/=10;
        }
        return result;
    }

}
