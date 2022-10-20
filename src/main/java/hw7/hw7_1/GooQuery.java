package hw7.hw7_1;

/*Напиши клас, який описує запит до пошукової системи. Клас повинен називатися GooQuery.
У класу має бути публічний конструктор, який приймає два параметри:
 */

public class GooQuery {
    private String language;
    private String text;

    public GooQuery(String language, String text) {
        this.language = language;
        this.text = text;
    }

    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Searching ["+ text +"], using language: "+ language;
    }
}
