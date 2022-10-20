package hw7.hw7_11;

/*Паліндром – це слово, яке читається однаково в обидві сторони. Наприклад, слово "казак" – паліндром.
Напиши програму, яка зможе порахувати кількість паліндромів у рядку. Реєстр букв ігноруй*/

public class PalindromeCounter {
    public int count(String phrase){
        int counter = 0;
        String [] words = phrase.toLowerCase().split("\\s+");

        for (String string : words){
            if (string == null){
                return 0;
            }
            StringBuilder stringBuilder = new StringBuilder(string);
            stringBuilder.reverse();
            if (stringBuilder.toString().equals(string)){
                counter++;
            }

        }
        return counter;
    }

}
