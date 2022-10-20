package hw7.hw7_24;
/*При аналізі тексту важливо враховувати, скільки у ньому є власних назв - це імена людей, назви планет, і т.д.
Власним ім'ям вважається слово, в якому є хоча б дві літери. Перша літера має бути великою, решта - маленькими.
Напиши програму, яка рахуватиме кількість власних назв у тексті */

public class NameCounter {
    public int count(String text){
        int counter = 0;
        for (String s: text.split(" ")){
            if (s.length() > 1 && (Character.isUpperCase(s.charAt(0))
            && Character.isLowerCase(s.charAt(1)))){
                counter++;
            }
        }
        return counter;
    }
}
