package hw7.hw7_29;
/*Зроби рефакторинг класу NameParser, перепиши метод String parse(String[] names),
щоб позбутися конкатенації рядків у циклі. Використовуй замість конкатенації клас StringBuilder.
Важливо!. Збережи код вирішення поточного завдання, він знадобиться тобі при вирішенні наступного завдання.
public class NameParser {
    public String parse(String[] names) {
        String result = "";

        for(int i = 0; i < names.length; i++) {
            String firstName = names[i].split(" ")[0];

            result += firstName;
            if (i != names.length - 1) {
                result += ", ";
            }
        }

        return result;
    }
}
 */
public class NameParser {
    public String parse(String[] names) {
       StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1){
                stringBuilder.append(names[i].split(" ")[0]);
                return stringBuilder.toString();
            }
            stringBuilder.append(names[i].split(" ")[0]).append(", ");
        }
        return stringBuilder.toString();
    }
}