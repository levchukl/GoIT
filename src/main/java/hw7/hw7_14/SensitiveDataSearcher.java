package hw7.hw7_14;

/*Перед тим як показувати знайдену сторінку користувачеві, пошукова система повинна переконатися, що немає жодних чутливих даних.
Чутливими даними вважаються слова: pass, key, login, email у будь-якому регістрі.*/

public class SensitiveDataSearcher {
    public static final String [] WORDS = new String[]{"pass", "key", "login", "email"};
    public boolean isSensitiveDataPresent(String phrase){
        String [] arr = phrase.toLowerCase().split("\\W+");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < WORDS.length; j++) {
                if (arr[i].equals(WORDS[j])){
                    return true;
                }
            }
        }
        return false;
    }
}
