package hw7.hw7_4;

import java.util.Arrays;

/*Щоб шукати фразу у тексті, цю фразу ми розбиваємо на масив слів. Далі ми працюємо з окремими словами.
Напиши іммутабельний клас, який приймає та зберігає масив рядків.*/

public class Phrase {
    private final String [] words;

    public Phrase(String[] words) {
        this.words = Arrays.copyOf(words, words.length);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.words.length; i++) {
            stringBuilder.append(this.words[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
