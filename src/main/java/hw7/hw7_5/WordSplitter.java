package hw7.hw7_5;

/*Спочатку потрібно підготувати дані. Для цього потрібно взяти рядок і виділити
всі слова з цього рядка, привівши їх до нижнього регістру*/

public class WordSplitter {
    public String[] split(String phrase){
        return phrase.toLowerCase().split("[^A-Za-zA-Z]+");

    }
}
