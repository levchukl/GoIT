package hw7.hw7_17;

/*Коли пошукова система шукає якийсь текст на тему "Математика",
то знайдені тексти оцінюються за параметром - чи є у тексті математичні вирази.
Такі тексти ранжуються вище.
Для пошукової системи Goo текст вважається таким, що в ньому є математичні вирази, якщо:
у тексті є хоча б один символ =;
у тексті є хоча б один математичний оператор +, -, *, /;
у тексті є мінімум 2 цифри.*/

public class MathDetector {
    public boolean isMath(String text){
        int counter = 0;
        for (char c : text.toCharArray()){
            if (Character.isDigit(c)){
                counter++;
            }
        }
        if (counter<2){
            return false;
        }
return text.contains("=")&&(text.contains("+")||text.contains("-")||text.contains("*")||text.contains("/"));
    }

}
