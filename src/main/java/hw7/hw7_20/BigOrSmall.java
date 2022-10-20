package hw7.hw7_20;

/*Пошукова система вище ранжує добре оформлені тексти. Одним із критеріїв оформленості є
правильне розміщення великих літер (фраза повинна починатися з великої літери, але якщо весь
текст набраний великими літерами - це, швидше за все, проблемний текст).
Напиши програму, яка приймає рядок, та повертає рядок за такими критеріями:
якщо кількість маленьких літер у рядку більше ніж кількість великих літер - повертається Small;
якщо кількість великих літер більша за кількість маленьких - повертається Big;
якщо кількість великих і маленьких літер рівна - повертається Same*/

public class BigOrSmall {
    public String calculate(String text){
        int bigCounter = 0;
        int smallCounter = 0;

        for (char c : text.toCharArray()){
            if (Character.isUpperCase(c)){
                bigCounter++;
            }
            if (Character.isLowerCase(c)) {
                smallCounter++;
            }
        }
        if (bigCounter == smallCounter) {
            return "Same";
        }

        return bigCounter > smallCounter ? "Big" : "Small";
    }
}
