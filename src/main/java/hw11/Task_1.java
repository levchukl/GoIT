package hw11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task_1 {
    public static void main(String[] args) {
        String result = namesList.stream()
                .filter(person -> person.getNumber() % 2 !=0)
                .map(Names::toString)
                .collect(Collectors.joining(", "));
        System.out.println(result);

    }

    public static List<Names> namesList = Arrays.asList(
            new Names(1, "Mark"),
            new Names(2, "Anna"),
            new Names(3, "Ivan"),
            new Names(4, "Viktor"),
            new Names(5, "Orest"),
            new Names(6, "Olga"),
            new Names(7, "Toma"),
            new Names(8, "Ganna"),
            new Names(9, "Petro"),
            new Names(10, "Max"));

}
