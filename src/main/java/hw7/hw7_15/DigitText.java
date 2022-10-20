package hw7.hw7_15;

/*Іноді при пошуку зустрічаються такі тексти, які складаються виключно з цифр та пробілів.
Це, швидше за все, помилка парсингу, або помилка кодування, і такий текст не потрібно показувати в результатах пошуку.
Напиши програму, яка визначатиме, чи текст складається виключно з цифр і пробілів.*/

public class DigitText {
    public boolean detect(String text){
        String [] arr = text.split(" ");
        for (String s: arr) {
            if (s.matches("[a-zA-Za]+")){
                return false;
            }
        }
        return true;
    }
}
