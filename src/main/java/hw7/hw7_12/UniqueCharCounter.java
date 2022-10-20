package hw7.hw7_12;

/*Пошукова система повинна вміти оцінювати такий параметр тексту, як різноманітність .
Дуже грубо це можна оцінити,
порахувавши кількість унікальних символів у тексті.*/

public class UniqueCharCounter {
    public int count(String phrase){
        char[]chars= phrase.toCharArray();
        float unique = chars.length;
        for (int i = 0; i < chars.length; i++) {
            float counter = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i]==chars[j]){
                    counter++;
                }
            }
            if (counter>1){
                unique-=(1/counter);
            }
        }
        return (int) unique;

    }
}
