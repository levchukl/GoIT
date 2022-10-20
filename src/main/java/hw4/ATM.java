package hw4;

public class ATM {
    private final int[] denomination ={500, 200, 100, 50, 20, 10, 5, 2, 1};
    public int countBanknotes(int sum){
        int result = 0;
        int index = 0;
        while (sum!=0){
            if (sum/denomination[index]>0){
                result++;
                sum-=denomination[index];
            }else {
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        System.out.println(atm.countBanknotes(7496));
    }
}
