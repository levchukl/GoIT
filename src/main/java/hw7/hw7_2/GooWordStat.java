package hw7.hw7_2;

/*Напиши іммутабельний клас, який зможе зберігати слово, скільки разів запитували це слово,
 і зможе виводити цю інформацію у зрозумілому вигляді.*/

public class GooWordStat {
    private String word;
    private int freq;

    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String getWord() {
        return word;
    }

    public int getFreq() {
        return freq;
    }
    public String getNewWord() {
        String st = "";
        if (freq < 1000) {
            return st = "LOW";
        } else if (freq >= 1000 && freq < 100000) {
            return st = "MEDIUM";
        } else if (freq >= 100000 && freq < 10000000) {
            return st = "HIGH";
        } else if (freq >= 10000000) {
            return st = "EXTRA HIGH";
        }
        return st;
    }

    @Override
    public String toString() {

        return "Word is [" + word + "], search freq is " + getNewWord();
    }
}
