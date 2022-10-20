package hw7.hw7_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*При пошуку будь-якого тексту з багатьох подібних оцінюється безліч показників.
Один з таких показників – це кількість знаків пунктуації на фразу.
 Занадто маленька чи занадто велика кількість таких знаків може свідчити про низьку якість тексту*/

public class PunctuationMarkCounter {
    public int count(String phrase){
        Pattern pattern = Pattern.compile("[.,!:;]");
        Matcher matcher = pattern.matcher(phrase);
        int counter = 0;
        while (matcher.find()){
            counter++;
        }
return counter;
    }
}
