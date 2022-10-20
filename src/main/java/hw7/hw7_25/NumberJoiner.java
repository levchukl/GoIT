package hw7.hw7_25;

/* Перепиши існуючий код класу NumberJoiner з використанням класу
StringBuilder, щоб позбутися конкатенації рядків у циклі. В іншому програма повинна працювати так само.

public class NumberJoiner {
    public String join(int[] numbers) {
        String result = "";
        for(int number: numbers) {
            result += number;
        }
        return result;
    }
}*/
class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int number : numbers){
            stringBuilder.append(number);
        }
        return stringBuilder.toString();
    }
}
