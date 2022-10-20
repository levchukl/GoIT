package hw7.hw7_21;

/*програму, яка визначатиме - чи можна з одного слова скласти інше.
Літери можна використовувати скільки завгодно разів. Регістр літер не враховуй.
 */

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){
        int counter = 0;
        for (String s: targetWord.toLowerCase().split("")){
            if (sourceWord.toLowerCase().contains(s)){
                counter++;
            }
        }
        return targetWord.length()==counter;

    }
}
