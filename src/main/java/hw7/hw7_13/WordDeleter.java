package hw7.hw7_13;

/*Іноді, перед тим, як показати користувачеві результати пошуку, необхідно видалити з тексту певні слова.
Напиши програму, яка вмітиме робити таку операцію.*/

public class WordDeleter {
    public String remove(String phrase, String[] words) {
        String[] split = phrase.split(" ");
        int counter = 0;
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (split[i].equals(words[j])) {
                    split[i] = " ";
                    counter++;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(" ")) {
                stringBuilder.append(split[i]).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
}
