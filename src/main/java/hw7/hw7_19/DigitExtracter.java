package hw7.hw7_19;

import java.util.Arrays;

/*При пошуку та подальшому аналізі тексту
буває корисно виділити всі цифри з тексту в окремий масив для подальшого аналізу.*/

public class DigitExtracter {
    public int[] extract(String text){
        int [] digit = new int[text.length()];
        int index = 0;
        for (char c : text.toCharArray()){
            if (Character.isDigit(c)){
                digit[index++]=Integer.parseInt(String.valueOf(c));
            }
        }
        return Arrays.copyOf(digit, index);
    }
}
