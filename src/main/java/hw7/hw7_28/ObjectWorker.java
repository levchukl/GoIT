package hw7.hw7_28;

/*Перепиши метод join(Object[] objects) класу ObjectWorker так, щоб уникнути
 конкатенації рядків у циклі, і використовувати замість цього клас StringBuilder.

public class ObjectWorker {
    public String join(Object[] objects) {
        String result = "";

        for(int i = 0; i < objects.length; i++) {
            result += objects[i];

            if (i != objects.length - 1) {
                result += " ";
            }
        }

        return result;
    }
}
*/
class ObjectWorker {
    public String join(Object[] objects) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object o : objects) {
            stringBuilder.append(o).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
