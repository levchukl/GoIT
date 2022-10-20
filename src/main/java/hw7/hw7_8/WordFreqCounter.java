package hw7.hw7_8;

/*Одна з важливих характеристик тексту – скільки разів у текст входить те чи інше слово.
 Чим частіше слово зустрічається в тексті щодо загальної кількості слів у тексті -
 тим швидше текст повніше відповідає на запит користувача.
Тобі для пошукової системи Goo потрібно написати програму, яка рахуватиме частоту входження слова.*/

public class WordFreqCounter {
    public float countFreq(String phrase, String word){
        String [] words = phrase.toLowerCase().split(" ");
        float counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word.toLowerCase())){
                counter++;
            }

        }
        return counter/ words.length;
    }
}
