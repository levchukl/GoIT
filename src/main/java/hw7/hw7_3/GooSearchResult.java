package hw7.hw7_3;

/*Тобі потрібно написати іммутабельний клас для представлення окремого результату пошуку, який зберігатиме посилання.
Також тобі потрібно написати в цьому класі метод, який буде парсити URL, та виділяти звідти домен.*/

public class GooSearchResult {
    private  String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
    public String parseDomain() {
        String[] arrSplit = url.split("/");
        return arrSplit[2];
    }

}
