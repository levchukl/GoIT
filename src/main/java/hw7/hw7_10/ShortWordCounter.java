package hw7.hw7_10;

//порахувати кількість слів у рядку, які менші або рівні заданої довжини.

public class ShortWordCounter {
    public int count(String phrase, int minLength){
        int result = 0;
        String []words = phrase.split(" ");
        for (String st:words){
            if (st.length()<=minLength){
                result++;
            }
        }
        return result;
    }
}
