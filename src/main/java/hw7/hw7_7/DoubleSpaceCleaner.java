package hw7.hw7_7;

/*Перед тим, як шукати щось у тексті, його потрібно почистити.
Частий вид опечаток - це подвійні пробіли. Хтось набирає текст, і випадково ставить два пробіли поспіль.
Тобі потрібно написати програму, яка видалятиме зайві подвійні пробіли. Також програма повинна видаляти всі пробіли на початку та в кінці рядка.*/

public class DoubleSpaceCleaner {
    public String clean(String phrase){
        phrase = phrase.trim().replaceAll("\\s+", " ");
        return phrase;
    }
}
