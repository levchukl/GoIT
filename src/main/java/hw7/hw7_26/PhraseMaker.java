package hw7.hw7_26;

import java.util.Locale;

/*Є метод, який приймає масив слів, і робить із них рядок, розділяючи слова пробілами.
При цьому слова перетворюються. Якщо слово довше ніж 3 символи, воно наводиться в нижній регістр.
Інакше воно наводиться у верхній регістр.
Програма працює правильно, але повільно. Якщо дати їй на вхід масив завдовжки десятки тисяч рядків,
це буде помітно. Це відбувається через конкатенацію рядків у циклі.

public class PhraseMaker {
    public String join(String[] words) {
        String result = "";
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }

            result += word;
            if (i != words.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}*/
public class PhraseMaker {
    public String join(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 4){
                stringBuilder.append(words[i].toUpperCase()).append(" ");
            }else {
                stringBuilder.append(words[i].toLowerCase()).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
}

