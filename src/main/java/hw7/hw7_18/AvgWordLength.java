package hw7.hw7_18;

/*Щоб визначити, чи не є текст пошуковим спамом, корисно оцінити такий параметр, як середня довжина слова в тексті .
Далі можна порівняти цей показник з аналогічним показником для інших текстів, і у разі великого відхилення - придивитися до тексту ближче.
Напиши програму, яка рахує середню довжину слова у переданому тексті.*/

public class AvgWordLength {
    public double count(String phrase){
       String [] strings = phrase.split(" ");
       char []  chars = phrase.toCharArray();
       return ((double) chars.length - (strings.length-1))/strings.length;
    }

}
