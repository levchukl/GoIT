package hw7.hw7_23;

/*Напиши програму, яка визначатиме, чи є у тексті email.

Email вважається знайденим, якщо є рядок виду xx@xx, де замість x - будь-який символ, крім пробілу. */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDetector {
    public boolean isPresent(String text){
        Pattern pattern = Pattern.compile("\\w\\w@\\w\\w");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
